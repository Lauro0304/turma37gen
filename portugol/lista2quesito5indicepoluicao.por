programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva("digite o indice de poluição atua :")
		leia(indicePoluicao)
		
		se(indicePoluicao<=0.29){
			escreva("Indice aceitavel!!")

			
		}
		senao se (indicePoluicao <=0.4){
			escreva("GRUPO 1 -PAREM SUAS ATIVIDADES!!")
		}

		senao se (indicePoluicao<0.49){
			escreva("GRUPO 1 e GRUPO 2 - PAREM SUAS ATIVIDADE!!!")
		}

		senao{
			escreva("GRUPO 1 e GRUPO 2 - GRUPO 3 PAREM SUAS ATIVIDADE!!!") 
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 319; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */