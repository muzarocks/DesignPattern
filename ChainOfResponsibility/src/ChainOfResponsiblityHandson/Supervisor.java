package ChainOfResponsiblityHandson;

public class Supervisor implements ILeaveRequestHandler{
	
	private ILeaveRequestHandler nextHandler = new ProjectManager();
	
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		
		int leaveDays = leaveRequest.getLeaveDays();
		
		if(leaveDays>=1 && leaveDays<3)
		{
			System.out.println("Your leave request is approved by Supervisor");
		}
		else {
			System.out.println("Your leave request is approved by Supervisor");

			nextHandler.HandleRequest(leaveRequest);
		}
		
		
	}

}
