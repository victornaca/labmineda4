package laboratorio.mineda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import laboratorio.mineda.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
