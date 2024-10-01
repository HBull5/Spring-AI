package dev.harcourt.dad_jokes;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

  @Autowired
  JokeService service;

  @GetMapping("/dad-jokes")
  @CrossOrigin
  public Map<String, String> generate(@RequestParam(value = "message", defaultValue = "Tell me a dad joke") String message) {
    return service.generateJoke(message);
  }
  
}
