package MediatorPatternHandson;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IChatMediator chatMediator = new ChatMediator();
		
		IUser user1 = new BasicUser(chatMediator,"Shubham");
		
		IUser user2 = new PremiumUser(chatMediator,"Avinash");
		
		
		IUser user3 = new BasicUser(chatMediator,"Arijit");
		
		
		IUser user4 = new BasicUser(chatMediator,"Vrushali");
		
		
		
		
		chatMediator.AddUser(user1);
		chatMediator.AddUser(user2);
		chatMediator.AddUser(user3);
		chatMediator.AddUser(user4);
		
		IUser user5 = new BasicUser(chatMediator,"Rahul");
		
		user5.SendMessage("Hey buddy how are you?");
		

		
	}

}
