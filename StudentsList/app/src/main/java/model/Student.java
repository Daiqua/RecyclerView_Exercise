package model;

public class Student {
    private int mStudentAge;
    private String mStudentName;
    private String mStudentSchool;

    public Student(String studentName, int studentAge, String studentSchool){
        this.mStudentAge=studentAge;
        this.mStudentName=studentName;
        this.mStudentSchool=studentSchool;
    }

    public int getStudentAge() {
        return mStudentAge;
    }

    public void setStudentAge(int studentAge) {
        mStudentAge = studentAge;
    }

    public String getStudentName() {
        return mStudentName;
    }

    public void setStudentName(String studentName) {
        mStudentName = studentName;
    }

    public String getStudentSchool() {
        return mStudentSchool;
    }

    public void setStudentSchool(String studentSchool) {
        mStudentSchool = studentSchool;
    }
}
