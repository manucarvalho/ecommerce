package ecommerce;

public class Produto {
	
	private int codigo;
	private String descricao;
	private float precoVenda;
	private float aliquotaICMS;
	private boolean vendido;
	
	public Produto(int codigo, String descricao, float precoVenda, float aliquotaICMS) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoVenda = precoVenda;
		this.aliquotaICMS = aliquotaICMS;
		this.vendido = false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public float getAliquotaICMS() {
		return aliquotaICMS;
	}

	public void setAliquotaICMS(float aliquotaICMS) {
		this.aliquotaICMS = aliquotaICMS;
	}

	public boolean isVendido() {
		return vendido;
	}
	
	public float calcularICMS() {
		return aliquotaICMS * precoVenda;
	}
	
	public void confirmaVenda() {
		vendido = !vendido;
	}
	
	public String toString() {
		return "\nCódigo: " +
				codigo +
				"\nDescrição: " +
				descricao +
				"\nPreço de venda: R$ " +
				String.format("%.2f", precoVenda) +
				"\nValor ICMS: R$ " +
				String.format("%.2f", calcularICMS());
	}

}
