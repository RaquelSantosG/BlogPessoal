package br.org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity //gerar tabela
@Table(name = "tb_postagens") //definir nome da tabela
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull(message = "o atributo titulo é obrigatótio!")
	@Size(min = 5, max = 100, message = "o atributo titulo deve ter no minimo 5 e no maximo 100")
	private String titulo;
	@NotNull(message = "o atributo texto é obrigatótio!")
	@Size(min = 10, max = 1000, message = "o atributo texto deve ter no minimo 10 e no maximo 1000")
	private String texto;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTituloo() {
		return titulo;
	}
	public void setTituloo(String tituloo) {
		this.titulo = tituloo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	
	
}
