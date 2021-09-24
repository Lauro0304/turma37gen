programa
{
	
	funcao inicio()
	{
		cadeia codigo
		inteiro horaExtra
		inteiro salarioNormal
		inteiro salarioExtra
		inteiro horas
		inteiro salarioMenor
		
		
		escreva("qual a matricula do funcionario:")
		leia(codigo)
		
		escreva("escreva o total de horas que voce trabalhou:")
		leia(horas) 

		horaExtra= horas-50

		salarioExtra= horaExtra*20

		salarioNormal= 50*10

		salarioMenor= horas*10

		se(horaExtra>0.1){
			escreva("este funcionario trabalhou ", horaExtra, " horas a mais, \n receberá R$ ",salarioNormal," do salario normal \n e recebera R$ ",salarioExtra," a mais pelo \n trabalho extra")
		escreva(" salario total R$", salarioNormal+salarioExtra)
		}
		
		senao se (horaExtra<0){
			escreva("voce recebera R$",salarioMenor)
		}
		senao se (horaExtra==0){
			escreva("voce recebera o salario de - R$",salarioNormal)
		}
		

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 592; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */