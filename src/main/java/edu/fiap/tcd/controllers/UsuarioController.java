package edu.fiap.tcd.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.fiap.tcd.model.Usuario;
import edu.fiap.tcd.services.UsuarioService;

@RestController
@RequestMapping(value = "v1/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private HttpServletRequest request;

	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

	@RequestMapping(value = "/{usuarioId}", method = RequestMethod.GET)
	public Usuario getUsuario(@PathVariable("usuarioId") int usuarioId) {
		logger.debug("Found tmx-correlation-id in usuario-service-controller: {} ",
				request.getHeader("tmx-correlation-id"));
		return usuarioService.getUsuario(usuarioId);
	}

	@RequestMapping(value = "{usuarioId}", method = RequestMethod.PUT)
	public void updateUsuario(@PathVariable("usuarioId") String usuarioId, @RequestBody Usuario usuario) {
		usuarioService.updateUsuario(usuario);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void saveUsuario(@RequestBody Usuario usuario) {
		usuarioService.saveUsuario(usuario);
	}

	@RequestMapping(value = "{usuarioId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUsuario(@PathVariable("usuarioId") String usuarioId, @RequestBody Usuario usuario) {
		usuarioService.deleteUsuario(usuario);
	}
}
