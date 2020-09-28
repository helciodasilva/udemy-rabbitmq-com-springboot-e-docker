package br.com.helciodasilva.producer.amqp;

public interface AmqpProducer<T> {
    void producer(T t);
}