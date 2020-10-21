package ecommerce;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		Produto p1 = new Produto(123, "TV", 3500.0f, 0.15f);
		Produto p2 = new Produto(25, "Calça", 350.0f, 0.10f);
		Produto p3 = new Produto(30, "Camisa", 150.0f, 0.10f);

		Carrinho carrinho;
				
		carrinho = new Carrinho(1, sdf.parse("08/10/2020"), 3);
		
		if (p1.isVendido() == false) {
			carrinho.inserirItem(p1);
		} else {
			System.out.println("Produto já vendido.");
		}
		if (p2.isVendido() == false) {
			carrinho.inserirItem(p2);
		} else {
			System.out.println("Produto já vendido.");
		}
		if (p3.isVendido() == false) {
			carrinho.inserirItem(p3);
		} else {
			System.out.println("Produto já vendido.");
		}
		
		if (carrinho.getStatus().equals("False")) {
			carrinho.confirmarCompra();
		} else {
			System.out.println("Compra já confirmada.");
		}
		
		System.out.println("Dados da venda: " + carrinho);
		System.out.println();
		System.out.println("Dados do(s) produto(s): ");
		/*System.out.println("Produto 1:" + p1);
		System.out.println("\nProduto 2:" + p2);
		System.out.println("\nProduto 3:" + p3);*/
		
		/*for (int i=0; i<carrinho.getNumDeItens(); i++) {
			System.out.printf("Produto %d: ", i+1);
			System.out.print(carrinho.getItens()[i].toString());
		}*/

		for (Produto prods:carrinho.getItens()) {
			System.out.print(prods);
			System.out.println();
	
		}
	}
}
