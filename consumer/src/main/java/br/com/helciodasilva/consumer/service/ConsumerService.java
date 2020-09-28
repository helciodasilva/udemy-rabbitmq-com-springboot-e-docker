package br.com.helciodasilva.consumer.service;

import br.com.helciodasilva.consumer.message.MessageQueue;

public interface ConsumerService {

	void action(MessageQueue message) throws Exception;

}