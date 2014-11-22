public class EmployeeProfile {

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
		return id + "-" + name;
	}
	
}
