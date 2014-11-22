package control;
import java.util.ArrayList;

public class EmployeeProfileManager {

	private EmployeeCache cache = new EmployeeCache();
	private EmployeeProfileFetcher fetcher = new EmployeeProfileFetcher();

	public Colaborador fetchEmployee(EmployeeID id) {
		Colaborador profile = cache.fetchEmployee(id);
		if (profile == null) { 
			System.out.println("Não encontrado na cache.");
			profile = fetcher.fetchEmployee(id);
			if (profile != null) {
				System.out.println("Encontrado no servidor. Adicionando a cache.");
				cache.addEmployee(profile);
			}
		}
		return profile;
	}

}
