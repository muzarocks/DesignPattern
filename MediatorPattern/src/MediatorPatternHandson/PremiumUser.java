package MediatorPatternHandson;

public class PremiumUser implements IUser {
	
	private IChatMediator chatMediator;

	private String name;
	

	public PremiumUser(IChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}
	
	public IChatMediator getChatMediator() {
		return chatMediator;
	}

	public void setChatMediator(IChatMediator chatMediator) {
		this.chatMediator = chatMediator;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void RecieveMessage(String msg) {
		// TODO Auto-generated method stub

		System.out.println("To "+name + ":: " + msg);

	}

	@Override
	public void SendMessage(String msg) {
		// TODO Auto-generated method stub
		chatMediator.SendMessage(msg);
	}

}
