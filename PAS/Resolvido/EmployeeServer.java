import java.util.ArrayList;

public class EmployeeServer {
	
	public void addEmployee(ArrayList<EmployeeProfile> bd, EmployeeProfile emp){
		bd.add(emp);
	}
	
	public EmployeeProfile fetchEmployee(ArrayList<EmployeeProfile> bd, EmployeeID id) {
		for (int i=0; i<bd.size(); i++){
			if ( id.equals( bd.get(i).getID())) {
				return bd.get(i);
			}
		}
		return null;	
	}

}
