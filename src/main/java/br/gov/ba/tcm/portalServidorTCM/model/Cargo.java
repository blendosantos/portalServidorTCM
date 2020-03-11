//package br.gov.ba.tcm.portalServidorTCM.model;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "CARGO")
//public class Cargo implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy  = GenerationType.AUTO)
//	@Column(name = "COD_CARGO")
//	private long id;
//	
//	@Column(name = "DESC_CARGO")
//	private String descricao;
//	
//	@Column(name = "DATA_INI_VIGENCIA")
//	private Date dataInicioVigencia;
//	
//	@Column(name = "DATA_CADASTRO")
//	private Date dataCadastro;
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getDescricao() {
//		return descricao;
//	}
//
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
//
//	public Date getDataInicioVigencia() {
//		return dataInicioVigencia;
//	}
//
//	public void setDataInicioVigencia(Date dataInicioVigencia) {
//		this.dataInicioVigencia = dataInicioVigencia;
//	}
//
//	public Date getDataCadastro() {
//		return dataCadastro;
//	}
//
//	public void setDataCadastro(Date dataCadastro) {
//		this.dataCadastro = dataCadastro;
//	}
//
//}
