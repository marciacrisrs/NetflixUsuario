package edu.fiap.tcd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.fiap.tcd.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String> {
	Usuario findByUsuarioId(int usuarioId);

}
