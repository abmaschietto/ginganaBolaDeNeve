package calculadora;

import model.InvestimentResult;
import model.Investimento;
import model.TipoInvestimento;

public class CalculadoraLucro {

	public InvestimentResult calcularLucroBruto(Investimento primeiroInvestidor) {
		Double valorInicial = primeiroInvestidor.getValorInvestido();
		Double valorJuros = primeiroInvestidor.getJuros();
		Double valorCorrente = primeiroInvestidor.getValorInvestido();
		Double valorTotal = primeiroInvestidor.getValorInvestido();
		Double porcentagemLucroMensal = 0.0;
		Double lucroLiquido = 0.0;
		Integer ciclos = 0;
		InvestimentResult resultado = null;
		while(valorInicial >  lucroLiquido) {
			ciclos ++;
			valorCorrente = valorTotal;
			porcentagemLucroMensal = (valorCorrente * valorJuros) / 100 ;
			System.out.println("Porcentagem lucro no mês " + ciclos + " : " + porcentagemLucroMensal);
			valorCorrente = porcentagemLucroMensal + valorCorrente;
			System.out.println("Valor atual lucrado: " + valorCorrente);
			lucroLiquido =  valorCorrente - valorInicial;
			System.out.println("Lucro líquido: " + lucroLiquido);
			valorTotal = valorCorrente;
		}
		System.out.println(primeiroInvestidor.getTipoInvestimento());
		resultado = resultBuilder(primeiroInvestidor, valorTotal, lucroLiquido, ciclos, resultado);
		return resultado;
	}

	private InvestimentResult resultBuilder(Investimento primeiroInvestidor, Double valorTotal, Double lucroLiquido,
			Integer ciclos, InvestimentResult resultado) {
		if(primeiroInvestidor.getTipoInvestimento() == TipoInvestimento.MENSAL) 
			resultado =  new InvestimentResult(primeiroInvestidor.getValorInvestido(), valorTotal, ciclos, lucroLiquido);
		if(primeiroInvestidor.getTipoInvestimento() == TipoInvestimento.ANUAL) 
			resultado = new InvestimentResult(primeiroInvestidor.getValorInvestido(), valorTotal, ciclos * 12, lucroLiquido);
		return resultado;
	}

}



