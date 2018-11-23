package com.cg.springRESTful.service;

import com.cg.springRESTful.beans.Customer;

public interface IWalletService {

	public boolean fundTransfer(int customerId1,int customerId2,
			double transferAmount); 
}
