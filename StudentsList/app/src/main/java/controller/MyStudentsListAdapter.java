package controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.studentlist.R;

import java.util.List;

import model.Student;

public class MyStudentsListAdapter extends RecyclerView.Adapter<MyStudentsListAdapter.MyViewHolder> {

    private List<Student> studentsList;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView studentAge, studentName, studentSchool;

        public MyViewHolder(View view){
            super(view);
            studentAge=(TextView) view.findViewById(R.id.student_item_textview_name);
            studentName=(TextView) view.findViewById(R.id.student_item_textview_age);
            studentSchool=(TextView) view.findViewById(R.id.student_item_textview_school);
        }
    }

    public MyStudentsListAdapter (List<Student> studentsList){

        this.studentsList=studentsList;
        }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
        return new MyViewHolder(itemView); //pas compris item view ? Dois-je comprendre que c'est le layout à charger?
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        Student student=studentsList.get(position);
        holder.studentAge.setText(student.getStudentAge());
        holder.studentName.setText(student.getStudentName());
        holder.studentSchool.setText(student.getStudentSchool());
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }
}
