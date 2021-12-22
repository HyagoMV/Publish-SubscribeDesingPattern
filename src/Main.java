import publishers.Publisher;
import subscrivers.Subscriber;
import system.Message;
import system.MessagingSystem;

public class Main {

	public static void main(String[] args) {
		MessagingSystem system = new MessagingSystem();

		Publisher.publish(new Message("A", "Fooooooo"), system);
		Publisher.publish(new Message("B", "Barrrrrr"), system);
		Publisher.publish(new Message("C", "Gaaaaaaa"), system);

		new Subscriber().addSubscriber("A", system);
		new Subscriber().addSubscriber("A", system);
		new Subscriber().addSubscriber("B", system);

		system.broadcast();
	}

}
