package OOP3;

// This is the class that has only variables with get and set which is of private access modifier

public class Class01 {
	// this method contain variables and method needed for the abstraction or
	// datahiding

	private String name;
	private String place;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
