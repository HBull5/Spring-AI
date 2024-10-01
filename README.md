## How to Run

* Ensure you have installed mvn & java
* Create your own [OpenAI](https://openai.com/) account and enter your api key in the application properties
  * This project was designed to use their lowest cost model, hit the open ai api about 50 times, and charge is still less than a penny
* From the command line of this project run `mvn clean` -> `mvn install` -> `mvn spring-boot:run`
  * The application should start on port `8080`
* Open the `index.html` file in the browser of your choosing, this should have all the canned rest endpoints for you to use.
  * You can manually hit the following endpoints as well, they're both `GET` requests.
    * [http://localhost:8080/dad-jokes](http://localhost:8080/dad-jokes)
    * [http://localhost:8080/dad-jokes?category=spiderman](http://localhost:8080/dad-jokes?category=spiderman)
    * [http://localhost:8080/dad-names](http://localhost:8080/dad-names)
* You should now see a screen like the one shown below. 

![screenshot-1](https://raw.githubusercontent.com/HBull5/Spring-AI/refs/heads/main/screenshot-1.png?token=GHSAT0AAAAAACYJ5YXRD7GE27IRP6ZWM4PIZX4H7UQ)

* You can also provide a category by entering one in the input box as shown below

![screenshot-2](https://raw.githubusercontent.com/HBull5/Spring-AI/refs/heads/main/screenshot-2.png?token=GHSAT0AAAAAACYJ5YXRUNYA2I5AXOBKFD4WZX4IA2Q)
