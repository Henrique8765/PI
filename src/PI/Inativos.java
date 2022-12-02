package PI;

public class Inativos extends Ativos{
	
	public Inativos(String nome, String cpf, String vinculo, double totalLiquido) {
		super(cpf, nome, vinculo, totalLiquido);
		
	}

	public String vetorresultados() {
		return "Inativos [cpf=" + cpf + ", nome=" + nome + ", órgão=" + vinculo + ", totalLiquido=" + totalLiquido
				+ "]";
	}	
	
}

