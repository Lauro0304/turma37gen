package projeto;

import java.util.Scanner;

public class projeto {

	public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);

	String codigo[] = {"G3-01","G3-02","G3-03","G3-04","G3-05","G3-06","G3-07","G3-08","G3-09","G3-10"}; // %s
	String produto[] = {"mouse           ","teclado           ","webcam           ","impressora           ","monitor           ","headset           ","caixa de som           ","roteador           ", "hd externo           ", "cabo hdmi           "}; // %s
	int estoque[] ={10,10,10,10,10,10,10,10,10,10}; // %d
	double preco[] = {30.00,40.00,80.00,500.00,800.00,100.00,70.00,150.00,400.00,30.00}; // %f -> %.2f
	String auxCodigo;
	int teste = 0;
	int auxQtde = 0;
	String sn; 
	String ProdutoFinal[];
	double VALORFINAL[] ={10,10,10,10,10,10,10,10,10,10};
	int QuantFinal[] ={10,10,10,10,10,10,10,10,10,10};
	String compra;
	int quantidade;
	double carrinho = 0.0;
	int QuantdeCompra = 0;
	double ValorFinal = 0.0;
	double imposto = 0.9;
	double pgVista;
	double pgCarao;
	double pgParcelado;
	double ValorFechado;
	String y; //= grupo3;
	int formaDePagamento;


		System.out.println("--------------------------Mangue-Tech--------------------------\n");
		System.out.println("--------------Posso comprar aqui pra me organizar--------------");
		System.out.println();
		System.out.println("COD\tPRODUTO\t\tESTOQUE\t\tVALOR");
		for (int x = 0; x < produto.length; x++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", codigo[x], produto[x], estoque[x], preco[x]);
		}
			for(int i=0; i<10; i++) {
			codigo[i]=("G3-" + (i + 1));
			}
			for(int i=0; i<10; i++) {
			estoque[i]=(10);		
}
			//CARRINHO 
						
				do{
					System.out.println("--------------------------Mangue-Tech--------------------------");
					System.out.println("--------------Posso comprar aqui pra me organizar--------------");
					System.out.println("DESEJA FAZER COMPRAS EM NOSSO SITE? [S OU N]");
					sn=leia.next();
					if(sn =="S") {
						sn=leia.next().toUpperCase();
					}
				
				do{
					System.out.println("--------------------------Mangue-Tech--------------------------");
					System.out.println("--------------Posso comprar aqui pra me organizar--------------");
					System.out.println("CODIGO\\t	PRODUTO\\t 		VALOR \\tESTOQUE\\");
					
					for(int i=0; i<10; i++) {
						System.out.println("\\n\\t\",codigo[i],\" \\t\\t\", produto[i],\"\\t\",preco[i],\"\\t   \",estoque[i]");
						
					}
					System.out.println("\"\\n\\n---------------------------CARRINHO---------------------------\\n\\n\"");
					for(int i=0; i<10; i++) {
						if(ProdutoFinal[i] != "") {
							System.out.println("QuantFinal[i], \" x \", ProdutoFinal[i], \"\\t R$\", VALORFINAL[i],");
						}
				}
					System.out.println("Quais produtos você deseja comprar? (Digite o código do produto)");
					compra=leia.next();
					for(int i=0; i<10; i++) {
						if(compra == produto[i] || compra == codigo [i]) {
							System.out.println("CONFIRMA O PRODUTO: " +codigo[i]+ "\t"+ produto[i]+ "\t R$"+ preco[i]);
							System.out.println("ESTA TUDO CERTO? CONFIME SEU PEDIDO [S ou N]");
							sn=leia.next();
							while(sn == 's') {
								System.out.println("Qual a quantidade?");
								quantidade=leia.nextInt();
								if(quantidade > 0 && quantidade <= estoque[i]) {
									carrinho = quantidade * preco[i];
									System.out.println("CARRINHO ATUAL: \", quantidade, \" x \", produto[i],\"\\t Valor unitário: RS\", preco[i], \"\\t TOTAL: R$\", carrinho");
									System.out.println("ESTA TUDO CERTO? CONFIRME SEU PEDIDO [S OU N]");
									sn=leia.next().charAt(sn);
									if(sn == 's' || sn == 'S') {
										QuantdeCompra = QuantdeCompra + quantidade;
										ValorFinal = ValorFinal + carrinho;
										estoque[i] = estoque[i] - quantidade;
										ProdutoFinal[i] = produto[i];
										if(produto[i] == ProdutoFinal[i]) {
											VALORFINAL[i] = VALORFINAL[i] + carrinho;
											QuantFinal[i]+= quantidade;
										}
									}
								}else{
									System.out.println("\"ESTOQUE INDISPONÍVEL! \\nVERIFIQUE A LISTA E INFORME UMA QUANTIDADE VÁLIDA\\nAPERTE ENTER PARA CONTINUAR");
									y=leia.next();
								}
							}System.out.println("SALDO RESTANTE: \", produto[i],\"\\t\",estoque[i]");
						}
					}
			
		
			//METODO DE PAGAMENTO E NOTA FISCAL 
			

			
			System.out.println("Método de Pagamento: ");
			System.out.println("\n1 - A vista com 10% de desconto ");
			System.out.println("\n2 - No cartão de crédito em 1x (10% de acréscimo)");
			System.out.println("\n3 - No cartão de crédito em 2x (15% de acréscimo)");
			System.out.println("\nPor favor, informe a forma de pagamento [1/2/3]:");
			
			formaDePagamento = leia.nextInt();
			if (formaDePagamento == 1){
			
			System.out.println("MANGUE-TECH\n\n");
			System.out.println("---------NOTA FISCAL----------\n\n");
			for (int x1=0; x1<10; x1++){											// Laço para exibir os produtos pedidos na nota
				if(ProdutoFinal[x1]!= ""){											  // condicional para exibir APENAS os produtos no vetor de produtos no carrinho 
					System.out.println(QuantFinal[x1]+ " "+ ProdutoFinal[x1]+ "\t R$"+ VALORFINAL[x1]+ "\n");   // Escreve os produtos do carrinho na tela
					
				}
			}
			System.out.println("\nValor total do produto: R$"+ ValorFinal);
			System.out.println("\nImpostos sobre a nota: R$"+ Math.pow((ValorFinal*0.09),2));
			System.out.println("\nValor do desconto: R$"+ Math.pow((ValorFinal*0.1),2));
			ValorFechado = ValorFinal - (ValorFinal *0.10);
			System.out.println("\nValor total a pagar: R$"+ Math.pow(ValorFechado,2));
			System.out.println("\nObrigado por comprar na MANGUE-TECH");
			System.out.println("\nDESEJA CONTINUAR COMPRANDO ? [S/N]: ");
			sn = leia.next();
			
			}
			if (formaDePagamento == 2){
			
			System.out.println("MANGUE-TECH\n\n");
			System.out.println("---------NOTA FISCAL----------\n\n");
			for (int x2=0; x2<10; x2++){											// Laço para exibir os produtos pedidos na nota
				if(ProdutoFinal[x2]!= ""){											  // condicional para exibir APENAS os produtos no vetor de produtos no carrinho 
					System.out.println(QuantFinal[x2]+ " "+ ProdutoFinal[x2]+ "\t R$"+ VALORFINAL[x2]+ "\n");   // Escreve os produtos do carrinho na tela
					
				}
			}
			System.out.println("\nValor total do produto: R$"+ ValorFinal);
			System.out.println("\nImpostos sobre a nota: R$"+ Math.pow((ValorFinal*0.09),2));
			System.out.println("\nValor do acréscimo: R$"+ Math.pow((ValorFinal*0.1),2));
			ValorFechado = ValorFinal + (ValorFinal *0.10);
			System.out.println("\nValor total a pagar: R$"+ Math.pow(ValorFechado,2));
			System.out.println("\nObrigado por comprar na MANGUE-TECH");
			System.out.println("\nDESEJA CONTINUAR COMPRANDO ? [S/N]: ");
			sn = leia.next();
				
			}

			if (formaDePagamento == 3){
			
			System.out.println("MANGUE-TECH\n\n");
			System.out.println("---------NOTA FISCAL----------\n\n");
			for (int x3=0; x3<10; x3++){											// Laço para exibir os produtos pedidos na nota
				if(ProdutoFinal[x3]!= ""){											  // condicional para exibir APENAS os produtos no vetor de produtos no carrinho 
					System.out.println(QuantFinal[x3]+ " "+ ProdutoFinal[x3]+ "\t R$"+ VALORFINAL[x3]+ "\n");   // Escreve os produtos do carrinho na tela
					
				}
			}
			System.out.println("\nValor total do produto: R$"+ ValorFinal);
			System.out.println("\nImpostos sobre a nota: R$"+ Math.pow((ValorFinal*0.09),2));
			System.out.println("\nValor do acréscimo: R$"+Math.pow((ValorFinal*0.15),2));
			ValorFechado = ValorFinal + (ValorFinal *0.15);
			System.out.println("\nValor total da parcela: Duas Parcelas de R$"+Math.pow((ValorFechado/2),2));
			System.out.println("\nValor total a pagar: R$"+Math.pow(ValorFechado,2));
			System.out.println("\nObrigado por comprar na MANGUE-TECH");
			System.out.println("\nDESEJA CONTINUAR COMPRANDO ? [S/N]: ");  // Valida der o cliente quer continuar
			sn = leia.next();
			}

			// y = leia.nextLine();			//Vai ler a variável coringa para finalizar a compra ou retornar a fazer mais compras
			quantidade=0; 		// Redefine a quantiade de produtos no carrinho
			carrinho=0.0;			// Redefine o preço dos produtos no carrinho
			for (int i=0; i<0; i++){  //Laço para varrer e limpar os produtos no carrinho
				QuantFinal[i] = 0;	// Limpa o vetor de quantidade
				 ProdutoFinal[i] = "";  //Limpa o vetor dos produtos e insere um espaço vazio no lugar
				VALORFINAL[i] = 0;		// Limpoa o vetpor dos valores
				ValorFinal = 0.0;		//  Limpa a variavel de valor
				QuantdeCompra = 0;		// Limopa a quantidade comprada para finalizar o pedido
				
			}
		}
	

		sn = 's';				// define um s para uqe o laço não acabe depois de um pedido
			
							
		}else {				// fim do laço, se o cliente não quiser mais fazer compras
				
			System.out.println("ATÉ A PRÓXIMA");
				
		} while (sn== 's' || sn == 'S') {   // encerramento do laço
		}


	

		}
}
