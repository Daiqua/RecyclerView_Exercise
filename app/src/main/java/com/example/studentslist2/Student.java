package com.example.studentslist2;

public class Student {
    private String mName;
    private String mAge;

    public Student(String name, String age) {
        this.mName = name;
        this.mAge= age;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAge() {
        return mAge;
    }

    public void setAge(String age) {
        mAge = age;
    }
}
