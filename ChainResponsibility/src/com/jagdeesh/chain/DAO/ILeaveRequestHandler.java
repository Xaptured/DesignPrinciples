package com.jagdeesh.chain.DAO;

import com.jagdeesh.chain.DAOImpl.LeaveRequest;

public interface ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = null;
	public void handleRequest(LeaveRequest leaveRequest);
}
