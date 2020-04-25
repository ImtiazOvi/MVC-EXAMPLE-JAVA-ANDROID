package com.imtiaz.mvc.example.controller;

import android.app.Application;

import com.imtiaz.mvc.example.model.ExampleModel;

public class ExampleController extends Application {
    public ExampleModel exampleModel;

    public ExampleModel loadExample() {
        exampleModel = new ExampleModel("01", "1st example");
        return exampleModel;
    }
}
