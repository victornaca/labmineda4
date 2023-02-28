package laboratorio.mineda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import laboratorio.mineda.entity.Usuario;
import laboratorio.mineda.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario buscarPorId(Long id){
        Optional<Usuario> usuarioOp = usuarioRepo.findById(id);
        if(usuarioOp.isPresent()){
            return usuarioOp.get();
        }
        throw new IllegalArgumentException("Id Inválido");
    }

    public Usuario novoUsuario(Usuario usuario){
        if(usuario == null ||
                usuario.getNome() == null ||
                usuario.getSenha() == null){
            throw new IllegalArgumentException ("Nome ou senha inválidos");
            }
        return usuarioRepo.save(usuario);
    }
}
