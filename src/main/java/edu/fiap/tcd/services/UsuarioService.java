package edu.fiap.tcd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiap.tcd.model.Usuario;
import edu.fiap.tcd.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;


	public Usuario getUsuario(int usuarioId) {
		return usuarioRepository.findByUsuarioId(usuarioId);
	}

	public void deleteUsuario(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}

	public void saveUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public void updateUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

}
