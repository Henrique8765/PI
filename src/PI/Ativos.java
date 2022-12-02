package PI;

public class Ativos{
	protected String nome;
	protected String cpf;
	protected String vinculo;
	protected double totalLiquido;
	protected String export;
	
	public Ativos(String nome, String cpf, String vinculo, double totalLiquido) {
		this.cpf = cpf;
		this.nome = nome;
		this.vinculo = vinculo;
		this.totalLiquido = totalLiquido;
	}
	
	public void exportar(int export){
		if (export == 1){
			this.export = ".pdf"; 
		}
		
		if (export == 2	){
			this.export = ".xls"; 
		}
		
		if (export == 3	){
			this.export = ".csv"; 
		}
		
		if (export == 4	){
			this.export = ".txt"; 
		}
		
		if (export == 5	){
			this.export = ".json"; 
		}
	}
	
	

	public String vetorresultados() {
		return "Ativos [cpf=" + cpf + ", nome=" + nome + ", vinculo=" + vinculo + ", totalLiquido=" + totalLiquido
				+ "]";
	}
	
}

