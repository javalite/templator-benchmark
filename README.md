## Templator Benchmark	

exists to benchmark different templating engines. See branches. 


## Templator

```
ab -n 1000  http://localhost:8080/
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
Document Length:        9454 bytes

Concurrency Level:      1
Time taken for tests:   6.837 seconds
Complete requests:      1000
Failed requests:        0
Total transferred:      9697908 bytes
HTML transferred:       9454000 bytes
Requests per second:    146.27 [#/sec] (mean)
Time per request:       6.837 [ms] (mean)
Time per request:       6.837 [ms] (mean, across all concurrent requests)
Transfer rate:          1385.28 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:     4    7   4.4      7     132
Waiting:        4    7   4.4      7     132
Total:          4    7   4.4      7     132

Percentage of the requests served within a certain time (ms)
  50%      7
  66%      8
  75%      8
  80%      8
  90%      8
  95%      9
  98%     10
  99%     11
 100%    132 (longest request)

```