IP="$(hostname -I)"
destdir=/var/www/html/url.com/public_html/IP.txt

if [ -f "$destdir" ]
then
        echo "$IP" > "$destdir"
fi

cd /var/www/html/url.com/public_html
python3 update_html.py
sleep 5
python3 REST.py