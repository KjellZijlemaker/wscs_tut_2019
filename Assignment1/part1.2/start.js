var connect = require('connect');
var serveStatic = require('serve-static')

connect().use(serveStatic(__dirname)).listen(8080,function(){
    console.log('server running on 8080...')
})