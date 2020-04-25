package com.imtiaz.mvc.test.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.imtiaz.mvc.R;
import com.imtiaz.mvc.test.controller.StudentController;
import com.imtiaz.mvc.test.model.ModelStudent;

import butterknife.BindView;

public class StudentActivity extends AppCompatActivity {

    View view;
    private String TAG = "MVCLog";
    public StudentController controller;
    @BindView(R.id.txt_name)
    public TextView txtName;
    @BindView(R.id.txt_roll_no)
    public TextView txtRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        ModelStudent model = retriveStudentFromDatabase();
        StudentActivity view = new StudentActivity();

        controller = new StudentController(model, view);
        controller.updateView(); }

    private ModelStudent retriveStudentFromDatabase() {
        ModelStudent student = new ModelStudent();
        student.setName("Md Imtiaz Uddin");
        student.setRollNo("0000120");
        return student;
    }

    public void printStudentDetails(String studentName, String studentRollNo) {
        // txtRoll.setText(studentRollNo);
        // txtName.setText(studentName);
        // Toast.makeText(StudentActivity.this,""+studentName,Toast.LENGTH_SHORT).show();

        Log.d(TAG, "printStudentDetails: " + "Name: " + studentName);
        Log.d(TAG, "printStudentDetails: " + "Roll No: " + studentRollNo);
    }

    public void btnUpdateUI(View view) {
        // update model data
        controller.setStudentName("Rusho");
        controller.setStudentRoll("12");
        controller.updateView();
    }

}
