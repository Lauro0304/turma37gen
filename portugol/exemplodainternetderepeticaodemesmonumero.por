programa
{
	
	funcao inicio()
	{
		 // Declaração de variaveis
        inteiro vetor1[5], vetor2[5], n, chave, maior, j=1, i
        logico mensagem = verdadeiro

        // Leitura de n
        leia(n)

        // leitura do vetor principal
        para(i=1; i<n; i++){
            leia(vetor1[i])
        }

        // Vetor 2 define as repitições, deixando primeiro todas iguais a 0
        para(i=1; i<n; i++){
            vetor2[i] = 0
        }

        // Verifica se dois numeros são iguais e se sim aumenta no vetor repetições
        para(i=1; i<n; i++){
            para(j=1; j<n; j++){
                se (vetor1[i] == vetor1[j]){
                    vetor2[i] = vetor2[i] + 1
                }
            }
        }
        // Determina qual é o maior nº de repetições
        maior = 0
        para(i=1; i<n; i++){
            se(vetor2[i] > maior){
                maior = vetor2[i] 
            }
        }
        // Determina em que posições esta repetido e depois qual é o numero repetido
        para(i=1; i<n; i++){
            se (vetor2[i] == maior){
                chave = i
                // Utilizado o ciclo while para não repetir a mensagem o nº de vezes de repetições do vetor 2 
                enquanto(mensagem == verdadeiro){
                    escreva("\nNumero mais repetido: ", vetor1[chave], " e repete ", maior, " vezes")
                    mensagem = falso
                }
                escreva("\nPosições: ", i)
            }

        }       
    }
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */