package hproject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ControleFinanceiro {
	List<Fornecedores> produtos = new ArrayList<Fornecedores>();
	List<Clientes> clientes = new ArrayList<Clientes>();

	/*public void adicionaPrimeirosProdutos() {
		Fornecedores produto1 = new Fornecedores("fornecedor 1", "produto 1", 1500, 0.60);
		Fornecedores produto2 = new Fornecedores("fornecedor 2", "produto 2", 500, 1.00);
		Fornecedores produto3 = new Fornecedores("fornecedor 3", "produto 3", 60, 5.50);

		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);

	}*/

	public void adicionaProduto() {// adiciona produtos

		Scanner ler = new Scanner(System.in);
		try {

			System.out.print("Digite o nome do fornecedor: ");
			String nome = ler.nextLine();
			System.out.print("Digite o nome do produto: ");
			String descricao = ler.nextLine();
			System.out.print("Digite a quantidade: ");
			int quantidade = ler.nextInt();
			ler.nextLine();
			System.out.print("Digite o valor do produto: ");
			double valor = ler.nextDouble();
			ler.nextLine();

			Fornecedores f = new Fornecedores(nome, descricao, quantidade, valor);
			produtos.add(f);
                        System.out.println("Pedido adicionado.");

		} catch (InputMismatchException entradaErro) {
			System.out.println("Valores inválidos! Digite novamente...");
			adicionaProduto();
		}

	}

	public void listarProdutos() {// lista os produtos da list
		System.out.println(produtos);
	}
        
        public void listarClientes() {// lista os produtos da list
		System.out.println(clientes);
	}

	public void adicionaClientes() {// adiciona Clientes a list

		Scanner ler = new Scanner(System.in);
		boolean plano = false;
		boolean planoMaisSeguranca = false;
		int dependentes = 0;

		System.out.println("Contratar plano? (s/n)");
		String opcao = ler.nextLine();
		if (opcao.equals("s")) {
			plano = true;
		} else if (opcao.equals("n")) {
			plano = false;
		} else {
			System.out.println("Opção inválida! Digite novamente...");
			adicionaClientes();
		}

		if (plano == true) {
			System.out.println("Contratar plano Mais Segurança? (s/n)");
			String opcao2 = ler.nextLine();

			if (opcao2.equals("s")) {
				planoMaisSeguranca = true;
			} else if (opcao2.equals("n")) {
				planoMaisSeguranca = false;
			} else {
				System.out.println("Opção inválida! Digite novamente...");
				System.out.println("Contratar plano Mais Segurança? (s/n)");
				opcao2 = ler.nextLine();
			}
		}

		System.out.println("Deseja adicionar dependentes (s/n)");
		String opcao3 = ler.nextLine();
		if (opcao3.equals("s")) {
			System.out.print("Digite a quantidade de dependentes: ");
			dependentes = ler.nextInt();
			ler.nextLine();
		} else if (opcao3.equals("n")) {
			dependentes = 0;
		} else {
			System.out.println("Opção inválida! Digite novamente...");
			System.out.println("Deseja adicionar dependentes (s/n)");
			opcao3 = ler.nextLine();
		}

		Clientes c = new Clientes(plano, planoMaisSeguranca, dependentes);
		clientes.add(c);
                
                System.out.println("Plano criado: " + plano);
                System.out.println("Tipo de plano: " + planoMaisSeguranca);
                System.out.println("O plano possui dependentes?: " + dependentes);
	}

	public double calculaTotalProdutos(){// retorna o valor total de produtos
		double balanco, balancoAtual = 0;
		for (int i = 0; i<produtos.size(); i++) {
			balanco = produtos.get(i).getPreco() * produtos.get(i).getQuantidade();
			balancoAtual = balancoAtual + balanco;
		}
		System.out.println("Balanco atual dos orçamentos: " + balancoAtual);
		return balancoAtual;
	}
	
	public double calculaValorPlanos() {//retorna o valor total de planos
		int planosSimples = 0, planosPlus = 0;
		for (int i = 0; i<clientes.size(); i++) {
			if(clientes.get(i).isPlanoAtivo() == true && clientes.get(i).isPlanoMaisSeguranca() == false) {
				planosSimples++;
			}
			else if(clientes.get(i).isPlanoMaisSeguranca() == true) {
				planosPlus++;
			}
		}
		double totalPlano = (250.00 * planosSimples) + (500.00 * planosPlus);
                System.out.println("Seu plano: " + totalPlano);
		return totalPlano;
	}
	
	public void balanco() {// retorna o balanco final
            double balanco = calculaValorPlanos() - calculaTotalProdutos();
            System.out.println(" Balanco de contas final: "+ balanco);
		//return calculaValorPlanos()-calculaTotalProdutos();
	}

}
