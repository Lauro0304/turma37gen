programa
{
	
	funcao inicio()
	{
		real valorDocarrofabrica
		real porcentagemDodistribuidor
		real porcentagemDoimposto
		real valorTotalfinal

		escreva("Qual o valor do carro para a fabrica?")
		leia(valorDocarrofabrica)
		escreva("Qual a taxa do distribuidor?")
		leia(porcentagemDodistribuidor)
		escreva("Qual a taxa de impostos?")
		leia(porcentagemDoimposto)

		porcentagemDodistribuidor= valorDocarrofabrica*porcentagemDodistribuidor/100
		porcentagemDoimposto= valorDocarrofabrica*porcentagemDoimposto/100
		
		valorTotalfinal= (porcentagemDodistribuidor+porcentagemDoimposto+valorDocarrofabrica)

		escreva("valor total a ser pago pelo carro "+valorTotalfinal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 511; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */