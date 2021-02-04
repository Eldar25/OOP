
public class Course {
	private String name;
	  private String description;
	  private int credits;
	  public Course(String name, String description, int credits) {
	    
	    this.name = name;
	    this.credits = credits;
	    this.description = description;
	    
	  }
	  
	  public String toString() {
	    return name + ": " + description + "\n"
	    + credits + " credits" + "\n";
	  }
}
