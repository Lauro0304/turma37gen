package com.lojaGames.AppLoja.Services;

import java.nio.charset.Charset;
import java.util.Optional;
import javax.validation.Valid;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.lojaGames.AppLoja.models.UserLoginModel;
import com.lojaGames.AppLoja.models.UserModel;
import com.lojaGames.AppLoja.repositories.UserRepository;
/**
 * 
 * @author Lauro
 * since 1.0
 */
@Service
public class UserService {

	@Autowired

	private UserRepository userRepository;

	public Optional<UserModel> cadastrarUsuario(UserModel usuario) {

		if (userRepository.findAllByUserModelContainingIgnoreCase(usuario.getUsuario()).isPresent())

			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário já existe!", null);

		usuario.setSenha(criptografarSenha(usuario.getSenha()));

		return Optional.of(userRepository.save(usuario));

	}

	public Optional<UserModel> atualizarUsuario(UserModel usuario) {

		if (userRepository.findById(usuario.getId()).isPresent()) {

			Optional<UserModel> buscaUsuario = userRepository
					.findAllByUserModelContainingIgnoreCase(usuario.getUsuario());

			if (buscaUsuario.isPresent()) {

				if (buscaUsuario.get().getId() != usuario.getId())

					throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário já existe!", null);

			}

			usuario.setSenha(criptografarSenha(usuario.getSenha()));

			return Optional.of(userRepository.save(usuario));

		}

		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado!", null);

	}

	public Optional<UserLoginModel> logarUsuario(Optional<UserLoginModel> user) {

		Optional<UserModel> usuario = userRepository.findAllByUserModelContainingIgnoreCase(user.get().getUsuario());

		if (usuario.isPresent()) {

			if (compararSenhas(user.get().getSenha(), usuario.get().getSenha())) {

				user.get().setId(usuario.get().getId());

				user.get().setFoto(usuario.get().getFoto());

				user.get().setNome(usuario.get().getNome());

				user.get().setSenha(usuario.get().getSenha());

				user.get().setToken(generatorBasicToken(user.get().getUsuario(), user.get().getSenha()));

				return user;

			}

		}

		throw new ResponseStatusException(

				HttpStatus.UNAUTHORIZED, "Usuário ou senha inválidos!", null);

	}

	private String criptografarSenha(String senha) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaEncoder = encoder.encode(senha);

		return senhaEncoder;

	}

	private boolean compararSenhas(String senhaDigitada, String senhaBanco) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		return encoder.matches(senhaDigitada, senhaBanco);

	}

	private String generatorBasicToken(String email, String password) {

		String structure = email + ":" + password;

		byte[] structureBase64 = Base64.encodeBase64(structure.getBytes(Charset.forName("US-ASCII")));

		return "Basic " + new String(structureBase64);

	}

	public Optional<UserModel> Logar(@Valid Optional<UserLoginModel> user) {
		// TODO Auto-generated method stub
		return null;
	}

}
