import java.util.Scanner;

public class exercicio2quesito3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
				
		String nome;
		int idade;
		
		System.out.println("Qual sua idade? ");
		idade=ler.nextInt();
		
		if(idade<0) {
			System.out.println("Voc� digitou uma idade inv�lida");
		}
		
		else if(idade==0) {
			System.out.println("Voc� ainda � um beb�, como est� digitando?");
		}
		
		else if(idade<=14) {
			System.out.println("Voc� ainda tem uma idade Infantil");
			
		}
		else if(idade<=17) {
			System.out.println("Voc� tem uma idade Juvenil");
			
		}
		else
			System.out.println("Voc� � tem a idade de um Adulto");
		
		
		
	}

}
