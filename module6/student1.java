package module6;

public class student1 
{
      private int rollno;
      private String name;
      private double score;
      
      public student1() {
    	  
		rollno=0;
		name=null;
		score=0.0;
	}
     
      public student1(int rollno, String name, double score) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.score = score;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

//	public void display()
//      {
//    	  System.out.println("Roll No: " + rollno);
//    	  System.out.println("Name: " + name);
//    	  System.out.println("Score: "+score);
//      }
      public void markAttendance()
      {
    	  System.out.println("Marking the attendence");
      }
}
