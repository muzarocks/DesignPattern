package ChainOfResponsiblityHandson;

public class HR implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = null;
	
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		
		int leaveDays = leaveRequest.getLeaveDays();
		
		if(leaveDays >5 && leaveDays <= 7)
		{
			System.out.println("Your Leave Request is approved by HR");
		}
		else
		{
			System.out.println("Your Leave Request is rejected by HR");
		}
	}

}
