package ChainOfResponsiblityHandson;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LeaveRequest leaveRequest = new LeaveRequest();
		
		leaveRequest.setEmployeeName("Avinash");
		leaveRequest.setLeaveDays(6);
		
		ILeaveRequestHandler requestHandler = new Supervisor();
		
		requestHandler.HandleRequest(leaveRequest);
	}

}
