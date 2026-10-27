package rapido.quatrodifrenas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class QuatrodifrenasApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuatrodifrenasApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		System.out.println("escolha um número inteiro");

		int valor = scanner.nextInt();

		scanner.nextLine();

		System.out.println("seu nome de usuário");

		String id = scanner.nextLine();

		System.out.println("deseja continua?");
		boolean duvida = scanner.nextBoolean();

		if(valor <=0){
         System.out.println("valor inadequado");
		}
		else{
			System.out.println("valor adequado");
		}

		if(id.length() <= 20 && id.length() > 0){
			System.out.println("será um prazer adota esse nome");
		}
		else {
			System.out.println("nome inválido");

		}
		if( duvida){
			System.out.println("fico feliz");
		}
	else {
		System.out.println("aguarderei o proóximo uso");
	}
	scanner.close();

	}

}
