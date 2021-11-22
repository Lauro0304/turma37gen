package com.lojaGames.AppLoja.controllers;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lojaGames.AppLoja.Services.UserService;
import com.lojaGames.AppLoja.models.UserLoginModel;
import com.lojaGames.AppLoja.models.UserModel;
import com.lojaGames.AppLoja.repositories.UserRepository;
/**
 * 
 * @author Lauro
 *since 1.0
 */
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	@Autowired
	private UserService usuarioServicos;

	@Autowired
	private UserRepository repository;

	@GetMapping("/all")
	public ResponseEntity<List<UserModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserModel> getById(@PathVariable Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping("/logar")
	public ResponseEntity<UserModel> Autentication(@Valid @RequestBody Optional<UserLoginModel> user) {
		return usuarioServicos.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());

	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Optional<UserModel>> Post(@Valid @RequestBody UserModel usuario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioServicos.cadastrarUsuario(usuario));

	}
}
