import java.util.ArrayList;

public class EmployeeProfileManager {

	private EmployeeCache cache = new EmployeeCache();
	private EmployeeProfileFetcher fetcher = new EmployeeProfileFetcher();

	EmployeeProfile fetchEmployee(ArrayList<EmployeeProfile> bd, EmployeeID id) {
		EmployeeProfile profile = cache.fetchEmployee(id);
		if (profile == null) { 
			System.out.println("Não encontrado na cache.");
			profile = fetcher.fetchEmployee(bd, id);
			if (profile != null) {
				System.out.println("Encontrado no servidor. Adicionando a cache.");
				cache.addEmployee(profile);
			}
		}
		return profile;
	}

}
