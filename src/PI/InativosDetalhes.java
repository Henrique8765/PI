package PI;

public class InativosDetalhes extends AtivosDetalhes{
	public InativosDetalhes(String data, float remuneracao, float comissao, float beneficios, float eventuais,
			float horasExtras, float judiciais, float tetoRedutor, double impostoRetidoNaFonte, double contrubuicaoPrevidenciaria,
			double totalLiquido) {
		super(data, remuneracao, comissao, beneficios, eventuais, horasExtras, judiciais, tetoRedutor, impostoRetidoNaFonte, contrubuicaoPrevidenciaria,
				totalLiquido);

	}

	private double proventos;

	public String vetorresultados() {
		return "InativosDetalhes [pessoa=" + pessoa + ", data=" + data + ", proventos=" + proventos + ", remuneracao="
				+ remuneracao + ", comissao=" + comissao + ", beneficios=" + beneficios + ", eventuais=" + eventuais
				+ ", horasExtras=" + horasExtras + ", judicias=" + judiciais + ", tetoRedutor=" + tetoRedutor + ", impostoRetidoNaFonte="
				+ impostoRetidoNaFonte + ", contrubuicaoPrevidenciaria=" + contrubuicaoPrevidenciaria + ", totalLiquido=" + totalLiquido + "]";
	}
	
	
	
}

