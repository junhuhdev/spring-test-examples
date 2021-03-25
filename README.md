# spring-test-examples

![image](https://user-images.githubusercontent.com/45692017/112557388-a837b500-8dcc-11eb-836b-7a1f2102b12d.png)



### Different kind of tests

* Parameterized tests
* test-containers
* Kafka test



### p6spy

(1) Add pom dependency

(2) Change jdbc-url to jdbc:p6spy:postgresql://localhost:5432/skeleton

(3) Configure driver class name 

```
spring.datasource.driver-class-name=com.p6spy.engine.spy.P6SpyDriver
```


### test-containers

/users/jon/.testcontainers.properties

Add following line

```
testcontainers.reuse.enable=true
```
