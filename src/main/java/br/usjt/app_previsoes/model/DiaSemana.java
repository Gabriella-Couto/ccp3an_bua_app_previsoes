package br.usjt.app_previsoes.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DiaSemana")
public class DiaSemana implements Serializable {

	@Id
	private Long idDia;
	
	@Column(name="nome")
	private String dia;
	
    @OneToOne(mappedBy = "dia")
	private Previsao previsao;

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Long getIdDia() {
		return idDia;
	}

	public void setIdDia(Long idDia) {
		this.idDia = idDia;
	}
}
