# Web Services and Cloud-Based Systems - Assignment 2.1

Contextualize a VM such	that it	automatically deploys the URL Shortner	
Web	service	(developed	for	Assignment	1.1) at	start up. The service	
should be available (visible) outside the VM

## Getting Started

These instructions will get you a copy of the solution up and running on your local machine for development and testing purposes. 

### Prerequisites

Before running the service and creating the VM, you must have access to the following system and install 
requirements:

Access with OpenNebula installed **DAS-4**

**APACHE Lamp Server** (once VM is created, set it up there)

**Python3.xx**

### Setup, deploy VM & access VM

Log into your DAS-4 account with OpenNebula installed.

```
cd OpenNebula
```
Create a vm_template file and specify the template specifics. We have our template in the **vm_template** file.
```
cat vm_template
```

Create the VM from the template
```
onetemplate create vm_template_name
```

You can view templaes
```
onetemplate list
```

Check for the template ID/name and instatinate the VM (make sure to use persistent mode)
```
onetemplate instantiate template_name --persistent --name name_of_VM
```

Your VM is now instatinated. You can check by:
```
onevm list
```

To check for assigned IP:
```
onevm show vm_id | grep IP
```

To terminate VM:
```
onevem vm_id terminate
```

To update template:
```
onetemplate update template_id
```

To re-instatinate VM:
```
onetemplate instantiate template_id --name name_vm
```

SSH to vm:
```
ssh -Y root@assigned_IP_address
```
### Run URL SHORTENER service outside the VM

Check for assigned VM IP. Access the service 

```
firefox -no-remote http://VM_IP/url.com/public_html
```
