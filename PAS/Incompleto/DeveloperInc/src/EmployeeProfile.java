import java.util.Date;

public class EmployeeProfile {

	private EmployeeID id;    
	private String name;
	private Date dtAdmissao;

	public EmployeeProfile(EmployeeID id_, String name_, Date dtAdmissao_){
		this.id = id_;
		this.name = name_;
		this.dtAdmissao = dtAdmissao_;
	}

	public EmployeeID getID(){
		return id;
	}

	public String getName(){
		return name;
	}
	
	public Date getDtAdmissao(){
		return dtAdmissao;
	}

	@Override
	public String toString() {
		return id + "-" + name + "-" + dtAdmissao;
	}
}