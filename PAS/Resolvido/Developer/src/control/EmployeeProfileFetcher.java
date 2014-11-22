package control;
import java.util.ArrayList;

import banco.EmployeeServer;

class EmployeeProfileFetcher {
   
    	Colaborador fetchEmployee(EmployeeID id) {
    	EmployeeServer srv = new EmployeeServer();
        Colaborador profile = srv.fetchEmployee(id);
        return profile;
    }
}