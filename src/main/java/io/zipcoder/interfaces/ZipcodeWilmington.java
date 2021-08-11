package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipcodeWilmington {
     Students students  = Students.getInstance();
     Instructors instructors = Instructors.getInstance();
     static ZipcodeWilmington INSTANCE = new ZipcodeWilmington();


    private ZipcodeWilmington(){

    }
    public static ZipcodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Educator teacher, double numberOfHours){
        teacher.lecture(students.toArray(),numberOfHours);

    }
    public void hostLecture(Long id, double numberOfHours){
        Teacher teacher =  instructors.findById(id);
        Learner[] learner = students.toArray();

        teacher.lecture(learner,numberOfHours);

    }

    public Map<Student,Double> getStudyMap(){
        Map<Student,Double> map = new HashMap<>();
        for (int i = 0; i < students.personList.size(); i++) {
            Student s = students.personList.get(i);
            map.put(s, s.getTotalStudyTime());
        }
        return map;
    }
}
