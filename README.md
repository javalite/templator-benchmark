## Templator Benchmark	

exists to benchmark different templating engines. See branches. 


## Freemarker

```
 ab -n 1000 http://localhost:8080/
This is ApacheBench, Version 2.3 <$Revision: 1528965 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Completed 400 requests
Completed 500 requests
Completed 600 requests
Completed 700 requests
Completed 800 requests
Completed 900 requests
Completed 1000 requests
Finished 1000 requests


Server Software:        Jetty(9.3.0.M1)
Server Hostname:        localhost
Server Port:            8080

Document Path:          /
Document Length:        9109 bytes

Concurrency Level:      1
Time taken for tests:   4.984 seconds
Complete requests:      1000
Failed requests:        9
   (Connect: 0, Receive: 0, Length: 0, Exceptions: 9)
Total transferred:      9330986 bytes
HTML transferred:       9109000 bytes
Requests per second:    200.65 [#/sec] (mean)
Time per request:       4.984 [ms] (mean)
Time per request:       4.984 [ms] (mean, across all concurrent requests)
Transfer rate:          1828.36 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:     3    5   1.9      5      37
Waiting:        3    5   1.9      5      37
Total:          3    5   1.9      5      37

Percentage of the requests served within a certain time (ms)
  50%      5
  66%      6
  75%      6
  80%      6
  90%      7
  95%      7
  98%      7
  99%      7
 100%     37 (longest request)

```