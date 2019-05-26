public class Student {
    //student object that stores a name, grade, and unique id number

    //fields
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;
    static int num = 1;


    //constructor
    Student(String firstName,String lastName,int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = num;
        num++;
    }

    //to string - when used as a string name + grade will return
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + " Grade: " + this.grade;
    }


    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getStudentNumber(){
        return this.studentNumber;
    }
}
