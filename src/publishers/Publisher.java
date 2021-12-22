package publishers;

import system.Message;
import system.MessagingSystem;

public interface Publisher {

	static void publish(Message message, MessagingSystem system) {
		system.addMessageToQueue(message);
	}

}
