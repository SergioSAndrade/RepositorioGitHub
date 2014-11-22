import java.util.ArrayList;
import java.util.Date;

public class EmployeeServer {

	ArrayList<EmployeeProfile> bd = new ArrayList();
	
	public EmployeeServer(){
		
		EmployeeProfile emp1 = new EmployeeProfile(new EmployeeID("0001"), "Marcelo", new Date());;
		EmployeeProfile emp2 = new EmployeeProfile(new EmployeeID("0002"), "Railan", new Date());
		EmployeeProfile emp3 = new EmployeeProfile(new EmployeeID("0003"), "Lucas", new Date());
		EmployeeProfile emp4 = new EmployeeProfile(new EmployeeID("0004"), "Titi", new Date());
		EmployeeProfile emp5 = new EmployeeProfile(new EmployeeID("0005"), "Rafael", new Date());
		EmployeeProfile emp6 = new EmployeeProfile(new EmployeeID("0006"), "Guilherme", new Date());
		EmployeeProfile emp7 = new EmployeeProfile(new EmployeeID("0007"), "Fahel", new Date());
		EmployeeProfile emp8 = new EmployeeProfile(new EmployeeID("0008"), "Bruno", new Date());
		EmployeeProfile emp9 = new EmployeeProfile(new EmployeeID("0009"), "Kieza", new Date());
		
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
	
	public EmployeeProfile fetchEmployee(EmployeeID id) {
		for (int i=0; i<bd.size(); i++){
			if ( id.equals( bd.get(i).getID())) {
				return bd.get(i);
			}
		}
		return null;	
	}

}
