package com.example.studentslist2;

import android.view.View;

import androidx.appcompat.app.AlertDialog;

public class StudentProfileAlertDialog {
    private static String mStudentProfileName;
    private static String mStudentProfileAge;
    private static int mStudentProfileListPosition;



    public StudentProfileAlertDialog(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(view.getContext());
        // Setting Alert Dialog Title
        alertDialogBuilder.setTitle("Profil de "+ mStudentProfileName);
        // Setting Alert Dialog Message
        alertDialogBuilder.setMessage(mStudentProfileName+" a "+mStudentProfileAge+" ans./nPosition dans la liste: "+mStudentProfileListPosition);
        alertDialogBuilder.setCancelable(true);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

    public static void setStudentProfileName(String studentProfileName) {
        mStudentProfileName = studentProfileName;
    }

    public static void setStudentProfileAge(String studentProfileAge) {
        mStudentProfileAge = studentProfileAge;
    }

    public static void setStudentProfileListPosition(int studentProfileListPosition) {
        mStudentProfileListPosition = studentProfileListPosition;
    }
}
