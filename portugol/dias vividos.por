programa
{
	
	funcao inicio(){
		
		
		cadeia nome
		inteiro anoNascimento
		inteiro diaNascimento
		inteiro mesNascimento
		inteiro anoAtual
		inteiro mesesVividos
		inteiro diasVividos
		inteiro mesAtual
		inteiro diaAtual
		inteiro diasVividosincompleto
		inteiro mesesVividosincompleto1
		inteiro mesesVividosincompleto2
	
		escreva("qual o seu nome?")
		leia(nome)
		escreva("qual ano voce nasceu?")
		leia(anoNascimento)
		escreva("qual mes voce nasceu?")
		leia(mesNascimento)
		escreva("qual dia voce nasceu?")
		leia(diaNascimento)
		escreva("qual o ano atual?")
		leia(anoAtual)
		escreva("qual a data de hoje?")
		leia(diaAtual)
		escreva("que mês voce está?(numeral)")
		leia(mesAtual)	

		mesesVividosincompleto1= (mesNascimento-13)*-1
		
		mesesVividosincompleto2= (anoAtual-anoNascimento)*12

		mesesVividos= mesesVividosincompleto1+mesesVividosincompleto2
				
		
		
		diasVividosincompleto= mesesVividos*30

		diasVividos= diasVividosincompleto+diaAtual
		
		escreva("esses são os totais dias que voçê está vivo até hoje "+diasVividos)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1038; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */