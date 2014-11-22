package control;
import java.util.Date;

public class EmployeeProfile implements Colaborador {

	private EmployeeID id;      
	private String name;
	
	public EmployeeProfile(EmployeeID id, String name){
		this.id = id;
		this.name = name;
	}

	public EmployeeID getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return "Employee: " + id + "-" + name;
	}
	
}
