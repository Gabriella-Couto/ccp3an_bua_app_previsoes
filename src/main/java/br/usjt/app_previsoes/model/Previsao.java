package br.usjt.app_previsoes.model;

import java.io.Serializable;

import java.sql.Date;
import java.time.*;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.usjt.app_previsoes.model.Cidade;

@Entity
@Table(name="Previsao")
public class Previsao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@Column(name="MIN")
	private Double min;
	
	@Column(name="MAX")
	private Double max;
	
	@Column(name="HUMIDADE")
	private int humidade;

	@Column(name="DESCRICAO")
	private String descricao;
	
	@Column(name="DATA")
	private Date data;
	
	@Column(name="HORA")
	private String hora;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dia")
	private DiaSemana dia;
	
	@ManyToOne(optional = false
			)
	@JoinColumn(name = "ID_CIDADE")
	private Cidade cidade;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public DiaSemana getDia() {
		return dia;
	}

	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	public int getHumidade() {
		return humidade;
	}

	public void setHumidade(int humidade) {
		this.humidade = humidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
}
