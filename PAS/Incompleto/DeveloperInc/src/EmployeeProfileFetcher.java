import java.util.ArrayList;

class EmployeeProfileFetcher {
   
    EmployeeProfile fetchEmployee(EmployeeID id) {
    	EmployeeServer srv = new EmployeeServer();
        EmployeeProfile profile = srv.fetchEmployee(id);
        return profile;
    }
	
}