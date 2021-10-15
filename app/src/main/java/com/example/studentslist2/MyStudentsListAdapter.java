package com.example.studentslist2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyStudentsListAdapter extends RecyclerView.Adapter<MyStudentsListAdapter.MyViewHolder>{
    private List<Student> mMyStudentsList;
    public static int mAdapterPosition;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mStudentName;
        public TextView mListPosition;
        public TextView mStudentAge;
        public Button mDetailsButton;
        public int mAdapterPosition;



        public MyViewHolder (View view){
            super(view);
            mStudentName = view.findViewById(R.id.student_item_textview_name);
            mListPosition = view.findViewById(R.id.student_item_textview_position);
            mStudentAge = view.findViewById(R.id.student_item_textview_age);
            mDetailsButton = view.findViewById(R.id.student_item_button);
            mDetailsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Student student = mMyStudentsList.get(getAdapterPosition());

                    StudentProfileAlertDialog.setStudentProfileName(student.getName());
                    StudentProfileAlertDialog.setStudentProfileAge(student.getAge());
                    StudentProfileAlertDialog.setStudentProfileListPosition(getAdapterPosition());
                    StudentProfileAlertDialog studentProfileAlertDialog = new StudentProfileAlertDialog(view);


                }
            });
        }
    }

    public MyStudentsListAdapter(List<Student> myStudentsList) {this.mMyStudentsList = myStudentsList;}

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Student student = mMyStudentsList.get(position);
        holder.mStudentName.setText(student.getName());
        holder.mListPosition.setText("N°"+position); //pas compris pourquoi je ne pouvais pas mettre setText(position)
        holder.mStudentAge.setText(student.getAge());

    }

    public void onClick() {

    }

    @Override
    public int getItemCount() {
        return mMyStudentsList.size();
    }

    public static int getAdapterPosition() {
        return mAdapterPosition;
    }
}

