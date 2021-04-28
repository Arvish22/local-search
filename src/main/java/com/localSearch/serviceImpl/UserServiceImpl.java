package com.localSearch.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.localSearch.modal.User;
import com.localSearch.repository.UserRepository;
import com.localSearch.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder encoder;

	@Override
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User update(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> saveAll(List<User> users) {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.saveAll(users);
	}

}
