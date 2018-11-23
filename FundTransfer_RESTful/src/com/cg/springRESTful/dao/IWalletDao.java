package com.cg.springRESTful.dao;

import com.cg.springRESTful.beans.Customer;

public interface IWalletDao {
	public boolean fundTransfer(int customerId1,int customerId2,
			double transferAmount); 
}
