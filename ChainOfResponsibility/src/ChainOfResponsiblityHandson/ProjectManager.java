package ChainOfResponsiblityHandson;

public class ProjectManager implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler = new HR();

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub

		int leaveDays = leaveRequest.getLeaveDays();

		if (leaveDays >= 3 && leaveDays <=5) {
			System.out.println("Your leave request is approved by Project Manager");
		} else {
			
			System.out.println("Your leave request is approved by Project Manager");

			nextHandler.HandleRequest(leaveRequest);
		}

	}

}
