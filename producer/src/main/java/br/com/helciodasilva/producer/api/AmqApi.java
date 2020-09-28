package br.com.helciodasilva.producer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.helciodasilva.producer.message.MessageQueue;
import br.com.helciodasilva.producer.service.AmqpService;

@RestController
public class AmqApi {

	@Autowired
	private AmqpService service;

	@PostMapping("/send")
	public void sendToConsumer(@RequestBody MessageQueue message) {
		service.sendToConsumer(message);
	}

}
