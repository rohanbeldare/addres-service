package com.address.address.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.address.domain.Address;
import com.address.address.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	public Address getAddress(Long addressId){
		return addressRepository.getOne(addressId);
	}
}
