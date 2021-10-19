package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Investimento {

	private String nomeInvestimento;
	private Double juros;
	private Double valorInvestido;
	private TipoInvestimento tipoInvestimento;
	private LocalDate dataInvestimento;
	
	public Investimento() {
		
	}
	

	public Investimento(String nomeInvestimento, Double juros, Double valorInvestido,
			TipoInvestimento tipoInvestimento) {
		super();
		this.nomeInvestimento = nomeInvestimento;
		this.juros = juros;
		this.valorInvestido = valorInvestido;
		this.tipoInvestimento = tipoInvestimento;
	}

	public String getNomeInvestimento() {
		return nomeInvestimento;
	}

	public void setNomeInvestimento(String nomeInvestimento) {
		this.nomeInvestimento = nomeInvestimento;
	}

	public Double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}

	public Double getValorInvestido() {
		return valorInvestido;
	}

	public void setValorInvestido(Double valorInvestido) {
		this.valorInvestido = valorInvestido;
	}

	public TipoInvestimento getTipoInvestimento() {
		return tipoInvestimento;
	}

	public void setTipoInvestimento(TipoInvestimento tipoInvestimento) {
		this.tipoInvestimento = tipoInvestimento;
	}

	@Override
	public String toString() {
		return "Investimento [nomeInvestimento=" + nomeInvestimento + ", juros=" + juros + ", valorInvestido="
				+ valorInvestido + ", tipoInvestimento=" + tipoInvestimento + ", dataInvestimento=" + dataInvestimento
				+ "]";
	}
}
