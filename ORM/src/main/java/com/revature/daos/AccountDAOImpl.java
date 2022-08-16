package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.models.Address;

import com.revature.services.ConnectionUtil;

public class AccountDAOImpl implements AccountDAO{
	
	public Address getSingleRecordById(int id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {//resultSets are cursor based, each time.next is called the cursor moves to the
				   //next group of values. It starts one before so you always need to call next.
				Address AccountObject = new Address(
				result.getInt("address_id"),
				result.getString("street"),
				result.getString("apartment_number"),
				result.getString("city"),			
				result.getString("zip")
				);					
				return AccountObject;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;		
	}	
}
