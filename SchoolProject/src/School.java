import java.util.ArrayList;

public class School {
    //school object - contains name, color, city. and lists/details of all students and teachers.


    //fields
        //array lists
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<String> courses = new ArrayList<>();
        //other fields
    private String schoolName;
    private String color;
    private String city;

    //constructor
    School(String schoolName,String color, String city){
        this.schoolName = schoolName;
        this.color = color;
        this.city = city;
    }

    //methods -
    public void addTeacher(Teacher teacher){    //adds a teacher to the arraylist/teachers list
        teachers.add(teacher);
    }
    public void addStudent(Student student){    //adds a student to the student list
        students.add(student);
    }
    public void deleteTeacher(Teacher teacher){ //removes a specified teacher from the school/arraylist
        teachers.remove(teacher);
    }
    public void deleteStudent(Student student){ //removes a specified student from the school/arraylist
        students.remove(student);
    }
    public String showTeachers(){
        return teachers.toString();             //returns the names + Subjects of all teachers
    }
    public String showStudents(){
        return students.toString();             //returns the name + grade of all students
    }


    //getters and setters

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
