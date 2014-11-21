import java.util.HashMap;
import java.util.Hashtable;

public class EmployeeCache {

	/**
	 * We use a linked list to determine the least recently used employee
	 * profile.  The cache that itself is implemented by a Hashtable
	 * object. The Hashtable values are linked list objects that refer
	 * to the actual EmployeeProfile object.
	 */
	private HashMap cache = new HashMap();

	/**
	 * This is the head of the linked list that refers to the most
	 * recently used EmployeeProfile.
	 */
	LinkedList mru = null;

	/**
	 * this is the end of the linked list that refers to the least
	 * recently used EmployeeProfile.
	 */
	LinkedList lru = null;

	/**
	 * Maximum number of EmployeeProfile objects that may be in the cache.
	 */
	private final int MAX_CACHE_SIZE = 5;

	/**
	 * The number of EmployeeProfile objects currently in the cache.
	 */
	private int currentCacheSize = 0;

	/**
	 * Objects are passed to this method for addition to the cache.
	 * However, this method is not required to actually add an object
	 * to the cache if that is contrary to its policy for what object
	 * should be added.  This method may also remove objects already in
	 * the cache in order to make room for new objects.
	 */
	public void addEmployee(EmployeeProfile emp) {
		EmployeeID id = emp.getID();
		if (cache.get(id) == null) { // if profile not in cache
			// Add profile to cache, making it the most recently used.
			if (currentCacheSize == 0) {
				// treat empty cache as a special case
				System.out.println("Entrou");
				lru = mru = new LinkedList();
				mru.profile = emp;
			} else {            // currentCacheSize > 0
				LinkedList newLink = new LinkedList();
				if (currentCacheSize >= MAX_CACHE_SIZE) {
					
					// remove least recently used EmployeeProfile from the cache
		//			newLink = lru;
		//			lru = newLink.previous;
					/*cache.remove(newLink);
					lru.next = null;*/
		//			cache.remove(newLink);
		//			lru.next = null;
		//			  cache.remove(id);
        //            currentCacheSize--;
        //            lru.next = null;
        //            newLink.profile = emp;
					
					newLink = lru;
                    lru = newLink.previous;
                    cache.remove(newLink);
                    lru.next = null;
				} else {
		//			newLink = new LinkedList();
					lru.profile = emp;
					lru.previous = lru;
					lru.next = lru;
				} // if >= MAX_CACHE_SIZE
				newLink.profile = emp;
				newLink.next = mru;
				newLink.previous = null;
				mru = newLink;
			} // if 0
			// put the now most recently used profile in the cache
			cache.put(id, mru);
			currentCacheSize++;
			
		} else {                // profile already in cache
			// addEmployee shouldn't be called when the object is already
			// in the cache.  Since that has happened, do a fetch so
			// that so object becomes the most recently used.
			fetchEmployee(id);
		} // if cache.get(id)
		System.out.println(cache);
	} // addEmployee(EmployeeProfile)

		
	/**
	 * Return the EmployeeProfile associated with the given EmployeeID or
	 * null if no EmployeeProfile is associated with the given EmployeeID.
	 */
	public EmployeeProfile fetchEmployee(EmployeeID id) {
		LinkedList foundLink = (LinkedList)cache.get(id);
		if (foundLink == null)
			return null;
		if (mru != foundLink) {
			if (foundLink.previous != null)
				foundLink.previous.next = foundLink.next;
			if (foundLink.next != null)
				foundLink.next.previous = foundLink.previous;
			foundLink.previous = null;
			foundLink.next = mru;
			mru = foundLink;
		} // if currentCacheSize > 1
		return foundLink.profile;
	} // fetchEmployee(EmployeeID)

	/**
	 * private doublely linked list class for managing list of most
	 * recently used employee profiles.
	 */
	private class LinkedList {
		EmployeeProfile profile;
		LinkedList previous;
		LinkedList next;
	} // class LinkedList
} // class EmployeeCache


