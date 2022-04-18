package exercises.chpt4.school;

public class Student {

    public static void main(String[] args) {
        Student myself = new Student("vic", 1, 1, 4.0);
    }
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }
//name, studentId,numberOfCredits,gpa are the class variables

  //name
   public String getName () {
        return this.name;
   }

   public void setName (String name) {
        this.name = name;
   }

   //student Id
    public int getStudentId () {
        return this.studentId;
    }

   private int setStudentId (int studentId) {
        return this.studentId;
    }

    //number of credits
    public int getNumberOfCredits () {
        return this.numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
       this.numberOfCredits = numberOfCredits;
    }

    //GPA
    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }




}

