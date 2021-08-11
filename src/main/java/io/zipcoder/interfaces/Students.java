package io.zipcoder.interfaces;

public class Students extends People<Student> {
    private static final Students INSTANCE = new Students();
    public Instructors elementList;

    Students() {
        //Student student = new Student(3L,"Sean");
        //this.add(student);
        add(new Student(4L,"George"));
        add(new Student(5L,"John"));
        add(new Student(6L,"Joe"));
    }

    public Student[] toArray(){

        return personList.toArray(new Student[0]);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}

