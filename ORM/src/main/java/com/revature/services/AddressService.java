package com.revature.services;

import com.revature.models.Address;
import com.revature.repo.AddressRepo;

public class AddressService {
	
	private AddressRepo addressRepo;
	
	public AddressService(AddressRepo addressRepo) {
		super();
		this.addressRepo = addressRepo;
	}
	
	public AddressService() {
		this.addressRepo = new AddressRepo();
	}
	
	public Address getAddressByCity(String City) {
		Address a = addressRepo.getAddressByCityFromDB(City);
		return a;
	}
	
	
}
