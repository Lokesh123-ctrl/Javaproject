package com.caprusIt.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caprusIt.Interface.AddressInterface;
import com.caprusIt.entity.Address;
import com.caprusIt.repository.AddressRepository;


@Service
public  class AddressServiceImpl implements AddressInterface{

	@Autowired
	private AddressRepository addressRepo;
	@Override
	public Address saveAddress(Address student) {
		return addressRepo.save(student); // Same save method
	}

	@Override
	public Address updateAddress(Address student) {
		return addressRepo.save(student);
	}

	@Override
	public List<Address> findAllAddresss() {
		return (List<Address>) addressRepo.findAll();
		
	}

	@Override
	public void deleteAddress(int id) {
		addressRepo.deleteById(id);
	}
		
}







