# Spring-AI

## How to Run

* Ensure you have installed mvn & java
* Create your own [OpenAI](https://openai.com/) account and enter your api key in the application properties
  * This project was designed to use their lowest cost model, several hits costs about a penny
* From the command line of this project run `mvn clean` -> `mvn install` `mvn spring-boot:run`
  * The application should start on port `8080`
* You can point your browser [here](http://localhost:8080/dad-jokes) and you should see the resulting screenshot below.
  * Since this uses a lower tier model, a lot of the responses are the same across uses

![alt text](https://raw.githubusercontent.com/HBull5/Spring-AI/refs/heads/main/screenshot.png?token=GHSAT0AAAAAACYJ5YXRJX5XFJTCAYIB5PGQZX4E5UQ)

* You can also provide a category by adding a query parameter, as shown [here]([http://localhost:8080/dad-jokes](http://localhost:8080/dad-jokes?category=spiderman)
