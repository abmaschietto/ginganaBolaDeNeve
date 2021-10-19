package model;

public class InvestimentResult {
	
	private Double valorInicial;
	private Double valorTotalLucradoBruto;
	private Integer meses;
	private Double lucroLiquido;
	
	public InvestimentResult(Double valorInicial, Double valorTotalLucradoBruto, Integer meses, Double lucroLiquido) {
		super();
		this.valorInicial = valorInicial;
		this.valorTotalLucradoBruto = valorTotalLucradoBruto;
		this.meses = meses;
		this.lucroLiquido = lucroLiquido;
	}
	public Double getValorInicial() {
		return valorInicial;
	}
	public Double getValorTotalLucradoBruto() {
		return valorTotalLucradoBruto;
	}
	public Integer getMeses() {
		return meses;
	}
	public Double getLucroLiquido() {
		return lucroLiquido;
	}
	
	
	@Override
	public String toString() {
		return "InvestimentResult [valorInicial=" + valorInicial + ", valorTotalLucradoBruto=" + valorTotalLucradoBruto
				+ ", meses=" + meses + ", lucroLiquido=" + lucroLiquido + "]";
	}
	
	

}
