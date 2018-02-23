# Microservices with Spring

![Architecture Diagram](https://github.com/HankLi0130/MicroservicesDemo/blob/master/diagram/architecture.png?raw=true)

**account-service:** 基本的REST服務

**customer-service:** 基本的REST服務，搭配Feign與其他REST溝通

**discovery-service:** 服務發現器，使用Eureka

**gateway-service:** 路由，使用Zuul

## 參考來源

[Part 1: Creating microservice using Spring Cloud, Eureka and Zuul](https://piotrminkowski.wordpress.com/2017/02/05/part-1-creating-microservice-using-spring-cloud-eureka-and-zuul/)

[Part 2: Creating microservices – monitoring with Spring Cloud Sleuth, ELK and Zipkin](https://piotrminkowski.wordpress.com/2017/04/05/part-2-creating-microservices-monitoring-with-spring-cloud-sleuth-elk-and-zipkin/)

[GitHub](https://github.com/piomin/sample-spring-microservices)

## 基礎知識

[微服務基礎建設](http://columns.chicken-house.net/2017/12/31/microservice9-servicediscovery/)

微服務核心：Service Discovery
用途：找到適當的服務，並自動檢查該服務是否能正常提供服務

### Service Discovery 三大動作組合

1. **Register**：服務啟動時的註冊機制
2. **Query**：查詢已註冊服務資訊的機制
3. **Healthy Check**：確認服務健康狀態的機制

## Service Registration Pattern

**參考來源**： [Service Discovery in a Microservices Architecture](https://www.nginx.com/blog/service-discovery-in-a-microservices-architecture/)

### The Client - Side Discovery Pattern

![The Client-Side Discovery Pattern](https://cdn-1.wp.nginx.com/wp-content/uploads/2016/04/Richardson-microservices-part4-2_client-side-pattern.png)

服務向Service Registry註冊，Client在呼叫服務前，向Service Registry查詢可用服務，Service Registry傳回可用服務清單，Registry-aware HTTP Client透過自定義的演算法決定使用哪個服務

**優點**：最大彈性自定義負載平衡機制

**缺點**：Registry-aware HTTP Client的程式碼為侵入式