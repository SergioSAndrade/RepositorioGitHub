import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;



public class EmployeeServer {
	
	/*public void addEmployee(FileWriter arq, EmployeeProfile emp) throws IOException{
//		 FileWriter arq = new FileWriter("D:\\server.txt");
	//	 PrintWriter gravarArq = new PrintWriter(arq);
		// gravarArq.println(emp.toString());
		
	}*/
	
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
