package com.imtiaz.mvc.example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.imtiaz.mvc.R;
import com.imtiaz.mvc.example.controller.ExampleController;
import com.imtiaz.mvc.example.model.ExampleModel;

import butterknife.BindView;

public class ExampleActivity extends AppCompatActivity {

    // Fields ======================================================================================
    // textViews
    @BindView(R.id.txt_example_number)
    public TextView txtExampleNumber;
    @BindView(R.id.txt_example_name)
    public TextView txtExampleName;

    private ExampleController exampleController;
    private ExampleModel exampleModel;
    //  ============================================================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        // instance of controller
        exampleController = new ExampleController();
        // getting model data by controller
        exampleModel =exampleController.loadExample();
        String exampleNumber  =  exampleModel.getExampleNumber();
        String exampleName  =  exampleModel.getExampleName();
        // setting data
        txtExampleNumber.setText(exampleNumber);
        txtExampleName.setText(exampleName);
    }
}
