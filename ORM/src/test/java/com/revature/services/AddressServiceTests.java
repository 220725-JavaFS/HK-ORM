package com.revature.services;

import com.revature.models.Address;

import com.revature.repo.AddressRepo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AddressServiceTests {

	private AddressRepo mockRepo = Mockito.mock(AddressRepo.class);
	private AddressService bookService = new AddressService(mockRepo);
	private Address testAddress = new Address("157 Grain", "Unit 10", "Houston", "75757");
	
	@Test
	public void testFindByCity() {
		Mockito.when(mockRepo.getAddressByCityFromDB("Raleigh"))
			.thenReturn(new Address("157 Grain", "Unit 10", "Houston", "75757"));
		Address a = bookService.getAddressByCity("Raleigh");
		assertEquals(testAddress, a);
	}
}
