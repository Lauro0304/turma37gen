programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real num1,num2,num3,num4,q1,q2,q3,q4
		escreva("escreva o primeiro valor:")
		leia(num1)
		escreva("escreva o segundo valor:")
		leia(num2)
		escreva("escreva o terceiro valor:")
		leia(num3)
		escreva("escreva o quarto valor:")
		leia(num4)

		q1=mat.potencia(num1,2)
		q2=mat.potencia(num2,2)
		q3=mat.potencia(num3,2)
		q4=mat.potencia(num4,2)

		se(q3>=1000){
			escreva("o quadrado de ",num3,"  e ",q3)

		}
		senao se(q3<1000){
			escreva("\n o quadrado de ",num1," e ",q1)
			escreva("\n o quadrado de " ,num2," e ",q2)
			escreva("\n o quadrado de " ,num3," e ",q3)
			escreva("\n o quadrado de ",num4," e ",q4) 
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 417; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */