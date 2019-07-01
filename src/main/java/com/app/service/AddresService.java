package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repo.AddressRepo;

@Service
public class AddresService {

	@Autowired
	private AddressRepo AddressRepo;
}
