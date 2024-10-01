package dev.harcourt.dad_jokes;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DadJokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DadJokesApplication.class, args);
	}

	@Bean
	ChatClient chatClient(ChatClient.Builder builder) {
		return builder.build();
	}

}
