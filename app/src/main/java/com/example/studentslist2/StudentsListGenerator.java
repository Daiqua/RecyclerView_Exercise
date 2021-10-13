package com.example.studentslist2;

import java.util.ArrayList;
import java.util.List;

public class StudentsListGenerator {
    private Student tStudent;
    private List<Student> mStudentsList;

    public StudentsListGenerator(List<Student> studentsList) {
        this.mStudentsList = studentsList;
    }

    public List<Student> fillStudentsList(){

        tStudent = new Student("Joe", "15");
        mStudentsList.add(tStudent);

        tStudent = new Student("Bob", "18");
        mStudentsList.add(tStudent);

        tStudent = new Student("Jeanne", "13");
        mStudentsList.add(tStudent);

        tStudent = new Student("Serge", "19");
        mStudentsList.add(tStudent);

        tStudent = new Student("Paul", "89");
        mStudentsList.add(tStudent);

        tStudent = new Student("Anne", "25");
        mStudentsList.add(tStudent);

        tStudent = new Student("Joe2", "15");
        mStudentsList.add(tStudent);

        tStudent = new Student("Bob2", "18");
        mStudentsList.add(tStudent);

        tStudent = new Student("Jeanne2", "13");
        mStudentsList.add(tStudent);

        tStudent = new Student("Serge2", "19");
        mStudentsList.add(tStudent);

        tStudent = new Student("Paul2", "89");
        mStudentsList.add(tStudent);

        tStudent = new Student("Anne2", "25");
        mStudentsList.add(tStudent);

        tStudent = new Student("Joe3", "15");
        mStudentsList.add(tStudent);

        tStudent = new Student("Bob3", "18");
        mStudentsList.add(tStudent);

        tStudent = new Student("Jeanne3", "13");
        mStudentsList.add(tStudent);

        tStudent = new Student("Serge3", "19");
        mStudentsList.add(tStudent);

        tStudent = new Student("Paul3", "89");
        mStudentsList.add(tStudent);

        tStudent = new Student("Anne3", "25");
        mStudentsList.add(tStudent);

        return mStudentsList;
    }

    public List<Student> getMyStudentsList() {
        return mStudentsList;
    }

    public void setMyStudentsList(List<Student> myStudentsList) {
        mStudentsList = myStudentsList;
    }
}
