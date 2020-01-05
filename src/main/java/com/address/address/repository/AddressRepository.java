package com.address.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.address.address.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
