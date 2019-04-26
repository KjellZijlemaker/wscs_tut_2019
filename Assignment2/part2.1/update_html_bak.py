import fileinput

with open('IP.txt', 'r') as file:
    h_ip = file.read().replace('\n', '')
    ip = file.read()

f = open('temp.html', 'r')
content = f.read()
f.close()

new_content = content.replace("host_name", "http://" + ip + ":5002/")
h_new_content = content.replace("var_host_name", "http://" + h_ip + ":5002/")

f = open('index.html', 'w')
f.write(new_content)
f.write(h_new_content)
f.close()
