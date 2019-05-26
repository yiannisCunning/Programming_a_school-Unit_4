public class Main {
    public static void main(String[] args) {
        //create school
        School Kits = new School("Kitsilano","red","Vancouver");
        //create students
        Student a = new Student("Yiannis","Cunning",11);
        Student b = new Student("Dave","Rick",10);
        Student c = new Student("Stanly","Pinkman",8);
        Student d = new Student("Andrew","Black",10);
        Student e = new Student("Jane","Salinger",12);
        Student f = new Student("Susan","Caufeild",11);
        Student g = new Student("Sam","Hays",12);
        Student h = new Student("Robert","Green",10);
        Student i = new Student("Sophie","Booth",9);
        Student j = new Student("Rick","Dave",9);

        //create teachers
        Teacher mike = new Teacher("Mike","Lee","Math");
        Teacher steve = new Teacher("Steve","Roy","English");
        Teacher sarah = new Teacher("Sarah","Kurt","Physics");

        //add students to school/arraylist
        Kits.addStudent(a);
        Kits.addStudent(b);
        Kits.addStudent(c);
        Kits.addStudent(d);
        Kits.addStudent(e);
        Kits.addStudent(f);
        Kits.addStudent(g);
        Kits.addStudent(h);
        Kits.addStudent(i);
        Kits.addStudent(j);

        //add teachers to the school/arraylist
        Kits.addTeacher(mike);
        Kits.addTeacher(steve);
        Kits.addTeacher(sarah);

        //prints out the list of teachers and students
        System.out.println("Teachers: " + Kits.showTeachers());
        System.out.println("Students: " + Kits.showStudents());

        //two students are removed
        Kits.deleteStudent(a);
        Kits.deleteStudent(b);

        //one teacher is removed from the school.
        Kits.deleteTeacher(mike);

        //school lists are printed
        System.out.println("Teachers: " + Kits.showTeachers());
        System.out.println("Students: " + Kits.showStudents());

    }
}
