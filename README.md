![image](https://user-images.githubusercontent.com/45692017/112557995-0a44ea00-8dce-11eb-93df-ac5016da6859.png)

# 🔥 spring-test-examples

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
