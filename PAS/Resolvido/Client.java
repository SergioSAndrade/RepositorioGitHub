import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	
	Client(){
		
	}
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<EmployeeProfile> bd = new ArrayList(); 
		Client cliente1 = new Client();
		Scanner ent = new Scanner(System.in);
		EmployeeProfileManager manager = new EmployeeProfileManager();
		
		while(true){
			
			EmployeeProfile emp1 = new EmployeeProfile(new EmployeeID("0001"), "Marcelo");
			EmployeeProfile emp2 = new EmployeeProfile(new EmployeeID("0002"), "Railan");
			EmployeeProfile emp3 = new EmployeeProfile(new EmployeeID("0003"), "Lucas");
			EmployeeProfile emp4 = new EmployeeProfile(new EmployeeID("0004"), "Titi");
			EmployeeProfile emp5 = new EmployeeProfile(new EmployeeID("0005"), "Rafael");
			EmployeeProfile emp6 = new EmployeeProfile(new EmployeeID("0006"), "Guilherme");
			EmployeeProfile emp7 = new EmployeeProfile(new EmployeeID("0007"), "Fahel");
			EmployeeProfile emp8 = new EmployeeProfile(new EmployeeID("0008"), "Bruno");
			EmployeeProfile emp9 = new EmployeeProfile(new EmployeeID("0009"), "Kieza");
			bd.add(emp1);
			bd.add(emp2);
			bd.add(emp3);
			bd.add(emp4);
			bd.add(emp5);
			bd.add(emp6);
			bd.add(emp7);
			bd.add(emp8);
			bd.add(emp9);
						
			
			System.out.println("Digite seu ID: ");
			String s = ent.nextLine();
			EmployeeProfile profile = manager.fetchEmployee(bd, new EmployeeID(s)); 
			if (profile == null) System.out.println("Funcionário não existe no sistema. Por favor, procure o RH.");
			else System.out.println("Bem-vindo Sr(a) " + profile.getName() + " !");
		}
		
	}
	
}
