package com.api.parkingcontroll.tarefas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa,Long> {
    // <Tarefa,Long> <Entidade, tipo da chave primária>
}
