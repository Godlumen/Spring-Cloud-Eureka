# Spring-Cloud-Eureka
Spring-Cloud服务注册中心、服务提供客户端、服务消费客户端、客户端的负载均衡

客户端负载均衡：
  多个eureka-client，配置spring.application.name和其他的相同。consumer它会交替请求不同的producer
