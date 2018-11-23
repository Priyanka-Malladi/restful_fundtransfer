package com.cg.springRESTful.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springRESTful.dao.IWalletDao;

@Service("service")
@Transactional
public class WalletServiceImpl implements IWalletService{
	
	@Autowired
	IWalletDao dao;
	
	@Override
	public boolean fundTransfer(int customerId1,int customerId2,
			double transferAmount)  {
		// TODO Auto-generated method stub
		return dao.fundTransfer(customerId1,customerId2,transferAmount);
	}

}
