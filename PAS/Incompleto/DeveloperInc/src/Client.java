import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args){
		
		Scanner ent = new Scanner(System.in);
		EmployeeProfileFetcher fetcher = new EmployeeProfileFetcher();
		EmployeeFactory factory = new EmployeeFactory();
		
		while(true){
			
			System.out.println("------------------------\n\n***Empresa Fantasia***");
			System.out.println("\nPasse o seu cartão na leitora: ");
			String s = ent.nextLine();
			EmployeeProfile profile = fetcher.fetchEmployee(new EmployeeID(s));
			System.out.println("Buscando no servidor ...");
			if (profile == null) System.out.println("Funcionário não existe no sistema. Por favor, procure o RH.");
			else System.out.println("Bem-vindo Sr(a) " + profile.getName() + " !");
		}
		
	}
	
}
