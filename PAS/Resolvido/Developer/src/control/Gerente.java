package control;
import java.util.Date;

public class Gerente implements Colaborador{
	
	private EmployeeID id;      
	private String name;
	private String setorResponsavel;
	
	public Gerente(EmployeeID id, String name){
		this.id = id;
		this.name = name;
	}

	public EmployeeID getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSetorResponsavel(){
		return setorResponsavel;
	}

	@Override
	public String toString() {
		return "Gerente: " + id + "-" + name;
	}

}
