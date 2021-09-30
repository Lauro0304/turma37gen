programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro lancamento[10]
		real media= 0.00, total=0.00
		inteiro maiorValor=0
		inteiro MVR=0

		para(inteiro x=0; x<10; x++){
			
			lancamento[x]=Util.sorteia(1,6)
			escreva(lancamento[x])
			total=total+lancamento[x]
			se(lancamento[x]>=maiorValor){
					se(lancamento[x]==maiorValor){
						MVR++
					}
					senao se(lancamento[x]>maiorValor){
						MVR = 1
					}
					maiorValor=lancamento[x]
			}
			
			
			escreva("\n")	
			Util.aguarde(200)
		}
		media=total/10
		escreva("\n A media dos lançamentos: ",media)
		escreva("\n A soma de números lançados é: ",total)
		escreva("\n O maior número apareceu ",MVR," vezes" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 691; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */