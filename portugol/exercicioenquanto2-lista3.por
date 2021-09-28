programa
{
	
	funcao inicio ()
	{
		inteiro num
		inteiro novoValor = 0
		escreva ("DIGITE UM NÚMERO QUALQUER:")
		leia (num)
		limpa()
		escreva("\n-> ",num)
		
		enquanto (num<100){
			novoValor = num*3
			num = novoValor
			escreva("\n-> ",novoValor,"\n")
				
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */