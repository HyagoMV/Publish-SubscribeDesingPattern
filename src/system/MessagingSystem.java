package system;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import subscrivers.Subscriber;

public class MessagingSystem {

	private Map<String, Set<Subscriber>> subscribersTopicMap;
	private Queue<Message> messagesQueue;
	
	public MessagingSystem( ) {
		subscribersTopicMap = new HashMap<>();
		messagesQueue = new LinkedList<>();
	}

	public void addMessageToQueue(Message message) {
		messagesQueue.add(message);
	}

	public void addSubscriber(String topic, Subscriber subscriber) {
		if (subscribersTopicMap.containsKey(topic)) {
			Set<Subscriber> subscribers = subscribersTopicMap.get(topic);
			subscribers.add(subscriber);
			subscribersTopicMap.put(topic, subscribers);
		} else {
			Set<Subscriber> subscribers = new HashSet<Subscriber>();
			subscribers.add(subscriber);
			subscribersTopicMap.put(topic, subscribers);
		}
	}

	public void removeSubscriber(String topic, Subscriber subscriber) {
		if (subscribersTopicMap.containsKey(topic)) {
			Set<Subscriber> subscribers = subscribersTopicMap.get(topic);
			subscribers.remove(subscriber);
			subscribersTopicMap.put(topic, subscribers);
		}
	}

	public void broadcast() {
		if (messagesQueue.isEmpty()) {
			System.out.println("No messages from publishers to display");
		} else {
			while (!messagesQueue.isEmpty()) {
				Message message = messagesQueue.remove();
				String topic = message.getTopic();

				Set<Subscriber> subscribersOfTopic = subscribersTopicMap.get(topic);

				for (Subscriber subscriber : subscribersOfTopic) {
					List<Message> subscriberMessages = subscriber.getSubscriberMessages();
					subscriberMessages.add(message);
				}
			}
		}
	}

	public void getMessagesForSubscriberOfTopic(String topic, Subscriber subscriber) {
		if (messagesQueue.isEmpty()) {
			System.out.println("No messages from publishers to display");
		} else {
			while (!messagesQueue.isEmpty()) {
				Message message = messagesQueue.remove();

				if (message.getTopic().equalsIgnoreCase(topic)) {

					Set<Subscriber> subscribersOfTopic = subscribersTopicMap.get(topic);

					for (Subscriber _subscriber : subscribersOfTopic) {
						if (_subscriber.equals(subscriber)) {
							List<Message> subscriberMessages = subscriber.getSubscriberMessages();
							subscriberMessages.add(message);
							subscriber.setSubscriberMessages(subscriberMessages);
						}
					}
				}
			}
		}
	}

}