package view;
import java.util.Scanner;

import control.Colaborador;
import control.EmployeeID;
import control.EmployeeProfileManager;

public class Client {
	
	public static void main(String[] args){
		
		Scanner ent = new Scanner(System.in);
		EmployeeProfileManager manager = new EmployeeProfileManager();
		
		while(true){
			
			System.out.println("Digite seu ID: ");
			String s = ent.nextLine();
			//EmployeeProfile profile = manager.fetchEmployee(new EmployeeID(s));
			Colaborador profile = manager.fetchEmployee(new EmployeeID(s));
			if (profile == null) System.out.println("Funcionário não existe no sistema. Por favor, procure o RH.");
			//else System.out.println("Bem-vindo Sr(a) " + profile.getName() + " !");
			else System.out.println("Bem-vindo Sr(a) " + profile.toString() + " !");
		}
		
	}
}
