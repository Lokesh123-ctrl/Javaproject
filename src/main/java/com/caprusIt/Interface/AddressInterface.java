package com.caprusIt.Interface;


	import java.util.List;

import com.caprusIt.entity.Address;

	

	public interface AddressInterface {
		//To save new address
		public Address saveAddress(Address address);
		
		//To update Address
		
		public Address updateAddress(Address address);
		
		// To fetch all addresss from database
		
		public List<Address> findAllAddresss();
		
		// To delete address
		public void deleteAddress(int id);
		
	}



