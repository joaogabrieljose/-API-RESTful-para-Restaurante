package pt.com.restarante.Domain.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pt.com.restarante.Domain.Entity.Cliente;

import java.util.Optional;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    Optional<Cliente> findClienteById (long id);
}
