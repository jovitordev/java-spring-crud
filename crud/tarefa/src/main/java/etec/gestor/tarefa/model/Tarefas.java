package etec.gestor.tarefa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarefa")
public class Tarefas implements Serializable {

	private static final long serialVersionUID = 4411084654518324070L;
	private long id;
	private String nomeTarefa, descricaoTarefa, nomeUsuario;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "tarefa_id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "tarefa_nome")
	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	@Column(name = "tarefa_descricao")
	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}

	public void setDescricaoTarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}

	@Column(name = "nome_usuario")
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
}
