package com.revature.services;

import java.util.List;

import com.revature.daos.AddressDAO;
import com.revature.daos.AddressDaoImpl;
import com.revature.models.Address;
import com.revature.repo.AddressRepo;



public class AddressService {
	
	
private AddressDAO addressDao = new AddressDaoImpl();
	
	
	public List<Address> AddressAssemble(){
		return addressDao.getAllAddress();
	}
	
	public void recruitAddress(Address address) {
		addressDao.insertAddress(address);
	}

	public void DeleteAddress(Address address) {		
		addressDao.deleteAddress(address);
	}
	public void updateAddress(Address address) {
		addressDao.updateAddress(address);
	}
private AddressRepo addressRepo;
	

	public AddressService(AddressRepo bookRepo) {
		super();
		this.addressRepo = bookRepo;
	}

	public AddressService() {
		this.addressRepo = new AddressRepo();
	}

	public Address getAddressByCity(String title) {
		Address b = addressRepo.getAddressByCityFromDB(title);
		return b;
	}
}
