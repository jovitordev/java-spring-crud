package etec.gestor.tarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import etec.gestor.tarefa.model.Tarefas;

public interface Tarefa extends JpaRepository<Tarefas, Long> {

}
