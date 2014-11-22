import java.util.ArrayList;

class EmployeeProfileFetcher {
   
    EmployeeProfile fetchEmployee(ArrayList<EmployeeProfile> bd, EmployeeID id) {
    	EmployeeServer srv = new EmployeeServer();
        EmployeeProfile profile = srv.fetchEmployee(bd, id);
        return profile;
    }
}