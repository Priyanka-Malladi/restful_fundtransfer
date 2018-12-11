package com.cg.springRESTful.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.springRESTful.beans.Customer;
@Repository("dao")
public class WalletDaoImpl implements IWalletDao {
	
	@PersistenceContext
	EntityManager entityManager;

	public boolean fundTransfer(int customerId1, int customerId2,
			double transferAmount) {

		boolean isValid = false;

		Customer customer1 = entityManager.find(Customer.class, customerId1);

		Customer customer2 = entityManager.find(Customer.class, customerId2);

		if (customer1 != null && customer2 != null) {

			if (customer1.getBalance() > transferAmount) {

				customer1.setBalance(customer1.getBalance() - transferAmount);
				customer2.setBalance(customer2.getBalance() + transferAmount);
			
				
				entityManager.merge(customer1);
				entityManager.merge(customer2);
	
				
				isValid = true;
			}
		}

		return isValid;
	}
}