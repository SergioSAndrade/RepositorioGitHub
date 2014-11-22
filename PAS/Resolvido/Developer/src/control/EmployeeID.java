package control;
public class EmployeeID {
	
	 private String id;

	    public EmployeeID(String id) {
	        this.id = id;
	    }

	    public int hashCode() {
	    	return id.hashCode();
	    }

   	    public boolean equals(Object obj) {
	        return (obj instanceof EmployeeID && id.equals(((EmployeeID)obj).id));
	    }

	    public String toString() {
	    	return id;
	    }
	
}
