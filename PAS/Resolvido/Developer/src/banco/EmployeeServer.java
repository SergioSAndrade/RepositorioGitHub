package banco;
import java.util.ArrayList;

import control.Colaborador;
import control.EmployeeID;
import control.EmployeeProfile;
import control.Gerente;

public class EmployeeServer {
	
	ArrayList<Colaborador> bd = new ArrayList();
	
	public EmployeeServer(){
		Colaborador emp1 = new EmployeeProfile(new EmployeeID("0001"), "Marcelo");
		Colaborador emp2 = new EmployeeProfile(new EmployeeID("0002"), "Railan");
		Colaborador emp3 = new EmployeeProfile(new EmployeeID("0003"), "Lucas");
		Colaborador emp4 = new EmployeeProfile(new EmployeeID("0004"), "Titi");
		Colaborador emp5 = new EmployeeProfile(new EmployeeID("0005"), "Rafael");
		Colaborador emp6 = new EmployeeProfile(new EmployeeID("0006"), "Guilherme");
		Colaborador emp7 = new EmployeeProfile(new EmployeeID("0007"), "Fahel");
		Colaborador emp8 = new EmployeeProfile(new EmployeeID("0008"), "Bruno");
		Colaborador emp9 = new Gerente(new EmployeeID("0009"), "Kieza");
		bd.add(emp1);
		bd.add(emp2);
		bd.add(emp3);
		bd.add(emp4);
		bd.add(emp5);
		bd.add(emp6);
		bd.add(emp7);
		bd.add(emp8);
		bd.add(emp9);
	}
	
	public Colaborador fetchEmployee(EmployeeID id) {
		for (int i=0; i<bd.size(); i++){
			if ( id.equals( bd.get(i).getID())) {
				return bd.get(i);
			}
		}
		return null;	
	}

}
