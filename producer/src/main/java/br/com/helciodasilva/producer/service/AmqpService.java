package br.com.helciodasilva.producer.service;

import br.com.helciodasilva.producer.message.MessageQueue;

public interface AmqpService {
	void sendToConsumer(MessageQueue message);
}
