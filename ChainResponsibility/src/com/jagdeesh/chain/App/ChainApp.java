package com.jagdeesh.chain.App;

import com.jagdeesh.chain.DAO.ILeaveRequestHandler;
import com.jagdeesh.chain.DAOImpl.LeaveRequest;
import com.jagdeesh.chain.DAOImpl.Supervisor;

public class ChainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployeeName("Jack");
		leaveRequest.setLeaveDays(4);
		ILeaveRequestHandler supervisor = new Supervisor();
		supervisor.handleRequest(leaveRequest);
	}

}
