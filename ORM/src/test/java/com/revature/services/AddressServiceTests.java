package com.revature.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.revature.models.Address;
import com.revature.repo.AddressRepo;


public class AddressServiceTests {
	private AddressService realAddress = new AddressService();
	private AddressRepo mockRepo = Mockito.mock(AddressRepo.class);
	private AddressService addressService = new AddressService(mockRepo);
	private Address testBook = new Address("123 Main", "Unit 80", "New York", "77890");
	
	@Test
	public void testFindByCity() {
		Mockito.when(mockRepo.getAddressByCityFromDB("New York"))
			.thenReturn(new Address("123 Main", "Unit 80", "New York", "77890"));
		Address b = addressService.getAddressByCity("New York");
		assertEquals(testBook, b);
	}
	
}
