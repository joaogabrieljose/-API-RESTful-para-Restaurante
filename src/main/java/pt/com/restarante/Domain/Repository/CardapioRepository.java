package pt.com.restarante.Domain.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pt.com.restarante.Domain.Entity.Cardapio;

import java.util.Optional;

@Repository
public interface CardapioRepository  extends CrudRepository<Cardapio, Long> {
    Optional<Cardapio> findCardapioById (long id);
}
