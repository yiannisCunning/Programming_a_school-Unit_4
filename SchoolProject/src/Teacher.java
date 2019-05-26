public class Teacher {
    //teacher object that stores a name and subject.


    //fields
    private String firstName;
    private String lastName;
    private String subject;

    //constructor
    Teacher(String firstName,String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }


    //to string - when used as a string name + subject are returned.
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Subject: " + subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
