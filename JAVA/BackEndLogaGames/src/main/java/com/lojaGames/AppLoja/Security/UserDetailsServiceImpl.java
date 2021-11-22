package com.lojaGames.AppLoja.Security;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.lojaGames.AppLoja.models.UserModel;
import com.lojaGames.AppLoja.repositories.UserRepository;
/**
 * 
 * @author Lauro
 * since 1.0
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
		Optional<UserModel> user = userRepository.findAllByUserModelContainingIgnoreCase(usuario);
		user.orElseThrow(() -> new UsernameNotFoundException(usuario + "not found."));

		return user.map(UserDetailsImpl::new).get();
	}
}
