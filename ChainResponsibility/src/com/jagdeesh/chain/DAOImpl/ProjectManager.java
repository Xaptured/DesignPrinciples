package com.jagdeesh.chain.DAOImpl;

import com.jagdeesh.chain.DAO.ILeaveRequestHandler;

public class ProjectManager implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = new HR();
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		int leaveDays = leaveRequest.getLeaveDays();
		if(leaveDays>=3 && leaveDays<=5)
		{
			System.out.println("Leave has been approved by the project manager for " +leaveRequest.getEmployeeName());
		}
		else if(leaveDays>5) {
			nextHandler.handleRequest(leaveRequest);
		}
	}

}
