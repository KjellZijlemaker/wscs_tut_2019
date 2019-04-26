import fileinput

with open('IP.txt', 'r') as file:
        ip = file.read().replace('\n', '').replace(' ', '')

f = open('temp.html', 'r')
content = f.read()

new_content = content.replace("host_name", "http://" + ip + ":5002/")

f = open('index.html', 'w')
f.write(new_content)

