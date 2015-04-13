## Templator Benchmark	

exists to benchmark different templating engines. See branches. 


## Templator

```
ab -n 100  http://localhost:8080/
This is ApacheBench, Version 2.3 <$Revision: 1528965 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient).....done


Server Software:        Jetty(9.3.0.M1)
Server Hostname:        localhost
Server Port:            8080

Document Path:          /
Document Length:        9454 bytes

Concurrency Level:      1
Time taken for tests:   0.719 seconds
Complete requests:      100
Failed requests:        0
Total transferred:      969805 bytes
HTML transferred:       945400 bytes
Requests per second:    139.00 [#/sec] (mean)
Time per request:       7.194 [ms] (mean)
Time per request:       7.194 [ms] (mean, across all concurrent requests)
Transfer rate:          1316.47 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.0      0       0
Processing:     4    7   1.5      8      10
Waiting:        4    7   1.5      8      10
Total:          4    7   1.5      8      10

Percentage of the requests served within a certain time (ms)
  50%      8
  66%      8
  75%      8
  80%      8
  90%      9
  95%     10
  98%     10
  99%     10
 100%     10 (longest request)

```