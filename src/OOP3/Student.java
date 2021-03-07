package OOP3;

public class Student {
	public int id;
	public String Name;

	public Student(int id, String Name) {
		this.id = id;
		this.Name = Name;
	}

	public static void main(String[] args) {

		// java code to create the array of objects
		// array of type object 

		Student[] arr = new Student[5];
		arr[0] = new Student(1, "karthik");
		arr[1] = new Student(11, "skuasu");
		arr[2] = new Student(1111, "Samyuktha");
		arr[3] = new Student(11111, "Karmathik");
		arr[4] = new Student(11111, "Ayodhya");
		
		for(Student s : arr) {
		System.out.println("Name : " + s.Name +"\n Student Roll : " + s.id);
		}
		
	}


}
