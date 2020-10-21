package ecommerce;

import java.util.Date;

public class Carrinho {
	
	private int id;
	private Date data;
	private Produto[] itens;
	private int numDeItens;
	private float valorICMS;
	private float valorVenda;
	private String status;
	
	public Carrinho(int id, Date data, int numDeItens) {
		this.id = id;
		this.data = data;
		this.numDeItens = numDeItens;
		itens = new Produto [this.numDeItens];
		this.status = "False";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Produto[] getItens() {
		return itens;
	}

	public void setItens(Produto[] itens) {
		this.itens = itens;
	}

	public int getNumDeItens() {
		return numDeItens;
	}

	public void setNumDeItens(int numDeItens) {
		this.numDeItens = numDeItens;
	}

	public float getValorICMS() {
		return valorICMS;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public String getStatus() {
		return status;
	}

	public void inserirItem(Produto p) {
		for (int i = 0; i<itens.length; i++) {
			if (itens[i] == null) {
				itens[i] = p;
				break;
			}
		}
		
		valorICMS += p.calcularICMS();
		valorVenda += p.getPrecoVenda();
	}
	
	public void confirmarCompra() {
		status = "Confirmada";
		for (int i = 0; i<itens.length; i++) {
			itens[i].confirmaVenda();
		}
	}
	
	public String toString() {
		return "\nid: " +
				id +
				"\nStatus: " +
				status +
				"\nValor ICMS: R$ " +
				String.format("%.2f",valorICMS) +
				"\nValor da venda: R$ " +
				String.format("%.2f",valorVenda);
	}

}
