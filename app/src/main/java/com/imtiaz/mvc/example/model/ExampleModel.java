package com.imtiaz.mvc.example.model;

public class ExampleModel {
    private String exampleNumber;
    private String exampleName;

    public ExampleModel(String exampleNumber, String exampleName) {
        this.exampleNumber = exampleNumber;
        this.exampleName = exampleName;
    }

    public String getExampleNumber() {
        return exampleNumber;
    }

    public void setExampleNumber(String exampleNumber) {
        this.exampleNumber = exampleNumber;
    }

    public String getExampleName() {
        return exampleName;
    }

    public void setExampleName(String exampleName) {
        this.exampleName = exampleName;
    }
}
