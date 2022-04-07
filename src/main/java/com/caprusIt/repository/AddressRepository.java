package com.caprusIt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.caprusIt.entity.Address;
@Repository

public interface AddressRepository extends JpaRepository<Address, Integer>{

	
@Query (value="INSERT into address values(?,?,?,?,?)",nativeQuery=true)
public Address saveAddress(Address address);

@Query (value="update address set address_id=?,city=? ,state=?,street=? where id=?",nativeQuery=true)
public Address updateAddress(Address address);

@Query(value="delete from address where adress_id between ? and ?",nativeQuery=true)
public void deleteAddress(int id);


@Query(value="select * from  address ",nativeQuery=true)
public List<Address> findAllAddresss();

@Procedure(procedureName = "INSERT_TOTAL", outputParameterName = "total_records")
public int insertAndReturnTotal(int studentId, int addressId);
}

