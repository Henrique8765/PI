package PI;

public class AtivosDetalhes {
	protected Ativos pessoa;
	protected String data;
	protected float remuneracao;
	protected float comissao;
	protected float beneficios;
	protected float eventuais;
	protected float horasExtras;
	protected float judiciais;
	protected float tetoRedutor;
	protected double impostoRetidoNaFonte;
	protected double contrubuicaoPrevidenciaria;
	protected double totalLiquido;
	
	public AtivosDetalhes(String data, float remuneracao, float comissao, float beneficios, float eventuais, float horasExtras, float judiciais, float tetoRedutor, double impostoRetidoNaFonte, double contrubuicaoPrevidenciaria, double totalLiquido) {
		this.data = data;
		this.remuneracao = remuneracao;
		this.comissao = comissao;
		this.beneficios = beneficios;
		this.eventuais = eventuais;
		this.horasExtras = horasExtras;
		this.judiciais = judiciais;
		this.tetoRedutor = tetoRedutor;
		this.impostoRetidoNaFonte = impostoRetidoNaFonte;
		this.contrubuicaoPrevidenciaria = contrubuicaoPrevidenciaria;
		this.totalLiquido = totalLiquido;
	}
	
	public String vetorresultados() {
		return "AtivosDetalhes [pessoa=" + pessoa + ", data=" + data + ", remuneracao=" + remuneracao + ", comissao="
				+ comissao + ", beneficios=" + beneficios + ", eventuais=" + eventuais + ", horasExtras=" + horasExtras
				+ ", judicias=" + judiciais + ", tetoRedutor=" + tetoRedutor + ", impostoRetidoNaFonte=" + impostoRetidoNaFonte + ", contrubuicaoPrevidenciaria="
				+ contrubuicaoPrevidenciaria + ", totalLiquido=" + totalLiquido + "]";
	}
	
	
}

