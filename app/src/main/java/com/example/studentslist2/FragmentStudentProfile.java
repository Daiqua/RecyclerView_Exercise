package com.example.studentslist2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentStudentProfile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentStudentProfile extends Fragment {
    private Student mStudent;
    private TextView mStudentName;
    private TextView mStudentAge;
    private Button mCancelButton;

    public FragmentStudentProfile() {
        // Required empty public constructor
    }

     public static FragmentStudentProfile newInstance(String title) {
        FragmentStudentProfile fragment = new FragmentStudentProfile();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_profile, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Get field from view
        mStudentName = view.findViewById(R.id.fragment_student_profile_name);
        mStudentAge = view.findViewById(R.id.fragment_student_profile_age);
        mCancelButton = view.findViewById(R.id.fragment_student_profile_cancel_button);
        // Fetch arguments from bundle and set title
        String title = getArguments().getString("title", "Enter Name");



    }

}