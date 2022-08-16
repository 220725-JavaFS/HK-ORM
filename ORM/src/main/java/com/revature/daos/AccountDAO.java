package com.revature.daos;


import com.revature.models.Address;

public interface AccountDAO {
	
	public abstract Address getSingleRecordById(int id);
	
}
