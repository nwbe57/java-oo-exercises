package assignment1;
import java.text.DecimalFormat;

public class Student {
	
	private String firstName;
	private String lastName;
	private int studID;
	private int credits;
	private double gpa;
	private double totalQ;
	
	
	public Student (String firstName, String lastName, int studID){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.studID = studID;
		this.credits = 0;
		this.gpa = 0.0;
		this.totalQ = 0;
	}
	
	public String getName(){
		return this.firstName + " " + this.lastName;
	}
	
	public int getStudentID(){
		return this.studID;
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	public double getGPA(){
		DecimalFormat df = new DecimalFormat("#.###");
		df.setMinimumFractionDigits(3);
		
		return Double.valueOf(df.format(this.gpa));
	}
	
	
	
	public String getClassStanding(){
		
		if(getCredits() < 30){
			return "Freshman";
		}
		else if(getCredits() < 60){
			return "Sophomore";
		}
		else if(getCredits() < 90){
			return "Junior";
		}
		else{
			return "Senior";
		}
		
	}
	
	public double submitGrade(double courseGrade, int courseCredits){
		DecimalFormat df = new DecimalFormat("#.###");
		df.setMinimumFractionDigits(3);
		
		double qScore = (courseGrade) * (courseCredits);
		
		this.credits += courseCredits;
		totalQ += qScore;
		this.gpa = totalQ / this.credits;
		
		return Double.valueOf(df.format(this.gpa));
		
	}
	
	public double computeTuition(){
		
		double tuition = 0;
		
		if(this.credits > 15){
			tuition = (this.credits - 15)* 1333.33 + 20000.0;
		}
		else if(this.credits == 15){
			tuition = 20000.0;
		} else {
			tuition = this.credits * 1333.33;
		}
		return tuition; 
	}
	
	public String toString(){
		return this.lastName + ", " + this.firstName + " ID#" + this.studID;
	}
	
	public Student createLegacy(Student a, Student b){
		DecimalFormat df = new DecimalFormat("#.###");
		df.setMinimumFractionDigits(3);
		
		String legFirstName = a.getName();
		String legLastName=  b.getName();
		int newIdBeg = a.getStudentID();
		int newIdEnd = b.getStudentID();
		int newID = newIdBeg + newIdEnd;
		double newGPA = Double.valueOf(df.format((a.getGPA() + b.getGPA())/2.0));
		
		Student legacy  = new Student(legFirstName, legLastName, newID);
		legacy.submitGrade(newGPA, Math.max(a.getCredits(), b.getCredits()));
		return legacy;
	}
	

	public static void main(String[] args) {
		
		Student newbie = new Student("nick", "burns", 12345);
		newbie.submitGrade(4.0, 1);
		newbie.submitGrade(3.0, 2);
		newbie.submitGrade(2.5, 1);
		newbie.submitGrade(4.0, 3);
		
		System.out.println(newbie.getClassStanding());
		System.out.println(newbie.getName());
		System.out.println(newbie.getStudentID());
		System.out.println(newbie.getCredits());
		System.out.println(newbie.getGPA());

	}

}
