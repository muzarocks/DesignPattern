package MediatorPatternHandson;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator{

	private List<IUser> userList = new ArrayList<IUser>();

	@Override
	public void AddUser(IUser user) {
		// TODO Auto-generated method stub
		
		userList.add(user);
		
	}

	@Override
	public void SendMessage(String msg) {
		// TODO Auto-generated method stub
		
		
		for(IUser user : userList)
		{
			user.RecieveMessage(msg);
		}
		
	}
	
	
}
