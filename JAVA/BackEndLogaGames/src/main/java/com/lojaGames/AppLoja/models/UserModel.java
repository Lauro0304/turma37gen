package com.lojaGames.AppLoja.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author Lauro since 1.0
 */
@Entity
@Table(name = "tb_user")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String nome;

	@NotNull(message = "O atributo Usuário é Obrigatório!")
	@Email(message = "O atributo Usuário deve ser um email válido!")
	@Size(min = 2, max = 100)
	private String usuario;

	@NotNull
	@Size(min = 8, max = 100)
	private String senha;

	private String foto;

	@OneToMany(mappedBy = "descriptionCategoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({ "descriptionCategoria" })
	private List<CategoryModel> descriptionCategoria = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<CategoryModel> getDescriptionCategoria() {
		return descriptionCategoria;
	}

	public void setDescriptionCategoria(List<CategoryModel> descriptionCategoria) {
		this.descriptionCategoria = descriptionCategoria;
	}

	

}
