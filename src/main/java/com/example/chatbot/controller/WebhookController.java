package com.example.chatbot.controller;

import com.example.chatbot.model.MessageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {
	
	@PostMapping("/webhook")
	public String handleMessage(@RequestBody MessageRequest request) {
		
		String msg = request.getMessage();
		
		//Login Message
		System.out.println("Message: " +msg);
		
		// logic
        if (msg.equalsIgnoreCase("Hi")) {
            return "Hello";
        } 
        else if (msg.equalsIgnoreCase("Bye")) {
            return "Goodbye";
        } 
        else {
            return "I didn't understand that.";
        }
	}
}
