package ObserverPatternHandson;

public class Main

{

	public static void main(String[] args)

	{

		MessageSubscriberOne s1 = new MessageSubscriberOne();

		MessageSubscriberTwo s2 = new MessageSubscriberTwo();

		MessageSubscriberThree s3 = new MessageSubscriberThree();

		MessagePublisher p = new MessagePublisher();

		p.attach(s1);

		p.attach(s2);
		
		p.setState(2); // s1 and s2 will be notified of state change
		//p.notifyUpdate(new Message("First Message")); // s1 and s2 will receive the update

		p.detach(s1);

		p.attach(s3);

		p.setState(3); //s2 and s3 will be notified of state change
		//p.notifyUpdate(new Message("Second Message")); // s2 and s3 will receive the update

	}

}