import java.util.HashMap;
import java.util.Hashtable;
public class EmployeeCache {

	private HashMap cache = new HashMap();
	private final int MAX_CACHE_SIZE = 5;
	private int currentCacheSize = 0;

	public void addEmployee(EmployeeProfile emp) {
		if (currentCacheSize >= MAX_CACHE_SIZE){
			System.out.println("Cache cheia. Impossível adicionar outro objeto.");
		}
		else{
			EmployeeID id = emp.getID();
			cache.put(id, emp);
			currentCacheSize++;
		}
	}

	public EmployeeProfile fetchEmployee(EmployeeID id) {
		EmployeeProfile found = (EmployeeProfile) cache.get(id);
		if (found == null) return null;
		else return found;		
	}
	
}


