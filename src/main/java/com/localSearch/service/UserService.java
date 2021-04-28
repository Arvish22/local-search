package com.localSearch.service;

import java.util.List;
import java.util.Optional;

import com.localSearch.modal.User;

public interface UserService {

	public List<User> findAll();
	
	public User findById(Long id);
	
	public User save(User user);
	
	public User update(User user);
	
	public List<User> saveAll(List<User> users);
}
