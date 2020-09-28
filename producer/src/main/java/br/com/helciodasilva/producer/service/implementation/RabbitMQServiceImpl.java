package br.com.helciodasilva.producer.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.helciodasilva.producer.amqp.AmqpProducer;
import br.com.helciodasilva.producer.message.MessageQueue;
import br.com.helciodasilva.producer.service.AmqpService;

@Service
public class RabbitMQServiceImpl implements AmqpService {

	@Autowired
	private AmqpProducer<MessageQueue> amqp;

	@Override
	public void sendToConsumer(MessageQueue message) {
		amqp.producer(message);
	}
}