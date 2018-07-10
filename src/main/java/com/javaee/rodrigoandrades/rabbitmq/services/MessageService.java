package com.javaee.rodrigoandrades.rabbitmq.services;

import com.javaee.rodrigoandrades.rabbitmq.domain.Message;

public interface MessageService {

	void sendMessage(Message message);
}
