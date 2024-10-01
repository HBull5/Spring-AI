package dev.harcourt.dad_jokes;

import java.util.Map;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

  @Autowired
  ChatClient chatClient;

  public Map<String, String> generateJoke(String message) {
    try {
      return Map.of(
        "completion",
        chatClient.prompt()
          .user(message)
          .call()
          .content()
        );
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

}
