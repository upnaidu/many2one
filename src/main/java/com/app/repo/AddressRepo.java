package com.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Address;

@Repository
public interface AddressRepo extends CrudRepository<Address, Long> {

}
