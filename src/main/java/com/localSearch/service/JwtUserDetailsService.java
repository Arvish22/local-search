package com.localSearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.localSearch.modal.User;
import com.localSearch.modal.UserData;
import com.localSearch.repository.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		System.err.println("---------------------");
		User user = userRepository.getUserByUsername(username)
				.orElseThrow(()->new UsernameNotFoundException("User not found with username: " + username));
		
		System.err.println(user+"---------------------");
		return new UserData(user);
	}
}
