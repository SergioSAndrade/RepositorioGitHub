import java.util.ArrayList;

public class EmployeeProfileManager {

	private EmployeeCache cache = new EmployeeCache();
	private EmployeeProfileFetcher fetcher = new EmployeeProfileFetcher();

	/**
	 * Fetch an employee profile for the given employee id from the
	 * internal cache or timekeeping server if not in the internal cache.
	 * @return employee's profile or null if employee profile not found.
	 */
	EmployeeProfile fetchEmployee(ArrayList<EmployeeProfile> bd, EmployeeID id) {
		EmployeeProfile profile = cache.fetchEmployee(id);
		if (profile == null) {   // if profile not in cache try server
			//******************
			System.out.println("Não encontrado na cache.");
			profile = fetcher.fetchEmployee(bd, id);
			if (profile != null) { // Got the profile from the server
				// put profile in the cache
				System.out.println("Encontrado no servidor. Adicionando a cache.");
				cache.addEmployee(profile);
			} // if != null
		} // if == null
		return profile;
	} // fetchEmployee(EmployeeID)

}
