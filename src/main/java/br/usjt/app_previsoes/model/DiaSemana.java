package br.usjt.app_previsoes.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="DiaSemana")
@Table(name="DiaSemana")
public class DiaSemana implements Serializable {
	private static final long serialVersionUID = 1L;
	
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

	public Previsao getPrevisao() {
		return previsao;
	}

	public void setPrevisao(Previsao previsao) {
		this.previsao = previsao;
	}
	
	
}
