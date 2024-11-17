package com.ramya.student.service.impl;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ramya.student.model.LoginUserEntity;
import com.ramya.student.repo.LoginUserRepo;
import com.ramya.student.service.LoginUserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginUserServiceImpl implements LoginUserService, UserDetailsService {
	
	
	private final LoginUserRepo loginUserRepo;
	
	
	private final PasswordEncoder encoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LoginUserEntity user = loginUserRepo.findByname(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not present in db");
		}
		Collection<SimpleGrantedAuthority> authorities = user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());

		return new User(user.getName(), user.getPassword(), authorities);
	}
	
	
	
	@Override
	public Long createUser(LoginUserEntity user) {
		user.setPassword(encoder.encode(user.getPassword()));
		LoginUserEntity userEntity= loginUserRepo.save(user);
		return userEntity.getId();
	}
	
	@Override
	public LoginUserEntity getUser(Long id) {
		Optional<LoginUserEntity> user = loginUserRepo.findById(id);
		return user.isEmpty()?null:user.get();
		
	}
	
	@Override
	public boolean deleteUser(Long id) {
		LoginUserEntity user = getUser(id);
		if(user != null) {
			loginUserRepo.deleteById(id);
			return true;
		}		
		return false;
	}
	
	@Override
	public LoginUserEntity findByname(String name) {	
		return loginUserRepo.findByname(name);
	}

}
