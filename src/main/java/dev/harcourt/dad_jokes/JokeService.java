package dev.harcourt.dad_jokes;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

  @Autowired
  ChatClient chatClient;
  
  final String DAD_NAME_PROMPT = "Imagine you are creating a citation for a dad joke. Provide me in a single word or phrase without any punctuation or quotations a citation that would be akin to the word \"dad\".";

  public String generateJoke(String category) {
    try {
      String message = (category.equalsIgnoreCase("Tell me a dad joke"))
        ? category : String.format("Tell me a dad joke about %s.", category);
      return chatClient.prompt()
        .user(message)
        .call()
        .content();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public String generateName() {
    try {
      return chatClient.prompt()
        .user(DAD_NAME_PROMPT)
        .call()
        .content();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

}
