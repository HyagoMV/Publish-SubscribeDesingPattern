import publishers.Publisher;
import subscrivers.Subscriber;
import system.Message;
import system.MessagingSystem;

public class Main {

	public static void main(String[] args) {
		MessagingSystem system = new MessagingSystem();
		
		Message msg1 = new Message("Java", "Core Java Concepts");
		Publisher.publish(msg1, system);

		Subscriber a = new Subscriber();
		a.addSubscriber("Java", system);

		system.broadcast();
		
		a.printMessages();
	}

}
