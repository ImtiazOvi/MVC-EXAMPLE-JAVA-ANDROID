package com.imtiaz.mvc.test.controller;

import com.imtiaz.mvc.test.model.ModelStudent;
import com.imtiaz.mvc.test.view.StudentActivity;

public class StudentController {
    private ModelStudent model;
    private StudentActivity view;
    public StudentController(ModelStudent model, StudentActivity view) {
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentRoll(String roll){
        model.setRollNo(roll);
    }
    public String getStudentRoll(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(),model.getRollNo());
    }

}
