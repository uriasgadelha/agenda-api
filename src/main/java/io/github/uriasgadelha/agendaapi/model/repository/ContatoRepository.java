package io.github.uriasgadelha.agendaapi.model.repository;

import io.github.uriasgadelha.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
