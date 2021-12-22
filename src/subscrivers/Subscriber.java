package subscrivers;

import java.util.ArrayList;
import java.util.List;

import system.Message;
import system.MessagingSystem;

public class Subscriber {

	private List<Message> subscriberMessages;

	public Subscriber() {
		subscriberMessages = new ArrayList<>();
	}

	public void addSubscriber(String topic, MessagingSystem system) {
		system.addSubscriber(topic, this);
	}

	public void unSubscribe(String topic, MessagingSystem system) {
		system.removeSubscriber(topic, this);
	}

	public void getMessagesForSubscriberOfTopic(String topic, MessagingSystem system) {
		system.getMessagesForSubscriberOfTopic(topic, this);
	}

	public List<Message> getSubscriberMessages() {
		return subscriberMessages;
	}

	public void setSubscriberMessages(List<Message> subscriberMessages) {
		this.subscriberMessages = subscriberMessages;
	}

	public void messageNotify() {
		for (Message message : subscriberMessages) {
			System.out.println("Message Topic -> " + message.getTopic() + " : " + message.getPayload());
		}
	}

}
