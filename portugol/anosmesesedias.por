programa
{
	
	funcao inicio()
	{
		inteiro dataDehoje
		inteiro mesDehoje
		inteiro anoDehoje 
		inteiro anoNascimento
		inteiro diaNascimento
		inteiro mesNascimento
		inteiro anosVivo
		inteiro mesesVivo
		inteiro diasVivo

		escreva("que data é hoje?")
		leia(dataDehoje)
		escreva("que mês é hoje?")
		leia(mesDehoje)
		escreva("que anos estamos?")
		leia(anoDehoje)

		escreva("em que ano você nasceu?")
		leia(anoNascimento)
		escreva("em que mês você nasceu?")
		leia(mesNascimento)
		escreva("que dia você nasceu?")
		leia(diaNascimento)

		anosVivo= anoDehoje-anoNascimento

		mesesVivo= mesDehoje-mesNascimento

		diasVivo= dataDehoje-diaNascimento

		escreva("você está vivo a "+anosVivo+" anos, "+mesesVivo+" meses e "+diasVivo+" vivos")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 758; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */