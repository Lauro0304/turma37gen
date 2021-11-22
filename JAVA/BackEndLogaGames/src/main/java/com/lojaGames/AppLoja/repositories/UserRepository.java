package com.lojaGames.AppLoja.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lojaGames.AppLoja.models.UserModel;


/**
 * 
 * @author Lauro
 *	since 1.0
 *
 */
	@Repository
	public interface UserRepository extends JpaRepository<UserModel, Long> {
		public Optional<UserModel> findAllByUserModelContainingIgnoreCase(String usuario);
	}


