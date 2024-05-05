package Dao;

import domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
