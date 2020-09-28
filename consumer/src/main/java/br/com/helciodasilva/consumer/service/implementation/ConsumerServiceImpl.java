package br.com.helciodasilva.consumer.service.implementation;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.stereotype.Service;

import br.com.helciodasilva.consumer.message.MessageQueue;
import br.com.helciodasilva.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public void action(MessageQueue message) throws Exception {
		if ("teste".equalsIgnoreCase(message.getText())) {
			throw new AmqpRejectAndDontRequeueException("erro");
		}
		System.out.println(message.getText());
	}
}