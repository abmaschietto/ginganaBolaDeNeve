package calculadora;

import java.util.Scanner;

import model.InvestimentResult;
import model.Investimento;
import model.TipoInvestimento;

public class Interface {
	
	public static void main(String[] args) {
		Investimento recebeInputs = investimentMaker();
		calcular(recebeInputs);
		
	}

	private static Investimento investimentMaker() {
		Investimento investidor = new Investimento();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite o nome do investimento:");
		investidor.setNomeInvestimento(sc.nextLine());
		System.out.println("O investimento é anual? S ou N");
		investidor.setTipoInvestimento(TipoInvestimento.MENSAL);
		if(sc.nextLine().equals("S")) {
			investidor.setTipoInvestimento(TipoInvestimento.ANUAL);
		}
		System.out.println("Digite o juros do investimento:");
		investidor.setJuros(sc.nextDouble());
		System.out.println("Digite o valor que deseja investir");
		investidor.setValorInvestido(sc.nextDouble());
		return investidor;
	}

	private static void calcular(Investimento primeiroInvestidor) {
		CalculadoraLucro calculadora = new CalculadoraLucro();
		InvestimentResult calculoFinal = calculadora.calcularLucroBruto(primeiroInvestidor);
		System.out.println("Você investiu: " + calculoFinal.getValorInicial() + " e demorou " + calculoFinal.getMeses() +
							" meses parar fazer o efeito bola de neve. Seu lucro bruto: " + calculoFinal.getValorTotalLucradoBruto() + ", seu lucro líquido foi: " + calculoFinal.getLucroLiquido());
	}

}
