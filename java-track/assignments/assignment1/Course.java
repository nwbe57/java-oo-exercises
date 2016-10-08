package assignment1;

public class Course {
	
	private String name;
	private int credits;
	private int seatsLeft;
	private Student[] roster;
	
	
	public Course(String name, int credits, int seatsStart) {
		this.name = name;
		this.credits = credits;
		this.seatsLeft = seatsStart;
		roster = new Student[seatsStart];
	}
	
	public int getRemainingSeats(){
		return this.seatsLeft;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	public String generateRoster(){
		String x = "";
		
		for(int i = 0; i < roster.length; i++){
			int spot = i + 1;
			
			if(roster[i] != null){
				x += spot + ". " + roster[i] + "\n";
			}
		}
		
		return x;
	}
	
	public boolean addStudent(Student a){
		
		for(int i = 0; i < roster.length; i++){
			
			if(roster[i] != null && a.getName() == roster[i].getName()){
				return false;
			}
		}
		
		if(this.seatsLeft == 0){
			return false;
		}
		
		roster[roster.length - this.seatsLeft] = a;
		this.seatsLeft--;
		return true;
	}
	
	public double averageGPA(){
		
		double gpaTotal = 0;
		
		for(int i = 0; i < roster.length; i++){
			if(roster[i] != null){
				gpaTotal += roster[i].getGPA();
			}
			
		}
		
		double avgGPA = gpaTotal/(roster.length - this.seatsLeft);
		
		return avgGPA;
	}
	
	public String toString(){
		return this.name + ", " + this.credits;
	}

	public static void main(String[] args) {
		Student newbie = new Student("nick", "burns", 12345);
		newbie.submitGrade(4.0, 1);
		newbie.submitGrade(3.0, 2);
		newbie.submitGrade(2.5, 1);
		newbie.submitGrade(4.0, 3);
		
		Student n = new Student("nik", "bur", 123);
		n.submitGrade(2.0, 1);
		n.submitGrade(2.0, 4);
		n.submitGrade(2.5, 1);
		n.submitGrade(4.0, 3);
		
		Student nf = new Student("nk", "br", 12);
		nf.submitGrade(4.0, 3);
		nf.submitGrade(4.0, 4);
		nf.submitGrade(2.5, 3);
		nf.submitGrade(4.0, 3);
		
		Course econ = new Course("econ", 3, 20);
		econ.addStudent(newbie);
		econ.addStudent(n);
		econ.addStudent(nf);
		
		System.out.println(newbie.getGPA());
		System.out.println(n.getGPA());
		System.out.println(nf.getGPA());
		System.out.println(econ.getRemainingSeats());
		System.out.println(econ.generateRoster());
		System.out.println(econ.averageGPA());

	}

}