const express = require('express')
const app = express()

app.get('/api/SMBCustomers', function (req, res) {
  res.send([{"UUID":1,"lastName":"liton" ,"FistName":"jabed" },{"UUID":2,"lastName":"n" ,"FistName":"d" }])
})
app.listen(3000,()=> console.log("on port 3000"));