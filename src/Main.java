import publishers.Publisher;
import subscrivers.Subscriber;
import system.Message;
import system.MessagingSystem;

public class Main {

	public static void main(String[] args) {
		MessagingSystem system = new MessagingSystem();
		
		final String tagA = "A";
		final String tagB = "B";
		final String tagC = "C";

		Publisher.publish(new Message(tagA, "Fooooooo"), system);
		Publisher.publish(new Message(tagB, "Barrrrrr"), system);
		Publisher.publish(new Message(tagC, "Gaaaaaaa"), system);

		new Subscriber().addSubscriber(tagA, system);
		new Subscriber().addSubscriber(tagA, system);
		new Subscriber().addSubscriber(tagB, system);

		system.broadcast();
	}

}
