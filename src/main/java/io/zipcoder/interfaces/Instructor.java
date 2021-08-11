package io.zipcoder.interfaces;

class Instructor extends Person implements Teacher {




    Instructor(long id, String name) {
        super(id, name);
    }



    @Override
    public void teach(Learner learn, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learner, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learner.length;
        for (Learner l:learner) {
            l.learn(numberOfHours);

        }

    }
}


