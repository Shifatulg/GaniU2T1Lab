public class student {
    // instance
    private String name;
    private int grade;
    private double gpa;

    public student(String StudentName, int StudentGrade, double StudentGPA) {
        name = StudentName;
        grade = StudentGrade;
        gpa = StudentGPA;
    }
    public void introduce() {
        System.out.println("Hello my name is " + name + " I am in grade " + grade + " and I have a gpa of " + gpa);
    }

}
