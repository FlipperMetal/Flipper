package fr.univ_rennes1.bioinfo;


/**
 * Simple student with an unique identifier and a grade.
 * 
 * @author Olivier Dameron
 *
 */
public class Student {
	
	private String ident;
	private double grade;
	
	/**
	 * creates a student with his/her identifier and grade.
	 * 
	 * @param identifier
	 * @param grade
	 */
	public Student(String identifier, double grade) {
		// TODO: DO SOMETHING HERE
		this.ident=identifier;
		this.grade=grade;
		
	}
	
	public Student(String identifier) {
		// TODO: DO SOMETHING HERE
		this.ident=identifier;
	}
	
	public String getIdentifier() {
		// TODO: DO SOMETHING HERE
		return ident;
	}
	
	public double getGrade() {
		// TODO: DO SOMETHING HERE
		return grade;
	}
	
	public void setGrade(double newGrade) {
		// TODO: DO SOMETHING HERE
		this.grade=newGrade;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student riri = new Student("riri", 12.5);
		Student fifi = new Student("fifi", 14.0);
		Student loulou = new Student("loulou", 18.5);
		Student geo = new Student("geo", 19.5);
		Student donald = new Student("donald", 10.5);
	}

}
