import java.util.ArrayList;

class EmployeeProfileFetcher {
    //...
    /**
     * Fetch an employee profile for the given employee id from the
     * timekeeping server.
     * @param id the employee's id
     * @ return the employee's profile or null if the employee's
     *          profile is not found on the timekeeping server.
     */
    EmployeeProfile fetchEmployee(ArrayList<EmployeeProfile> bd, EmployeeID id) {
    	EmployeeServer srv = new EmployeeServer();
        EmployeeProfile profile = srv.fetchEmployee(bd, id);
        return profile; // MVC: se for null, imprimir que emplyee nao existe
    }					//      se não for, retorna o employee
}