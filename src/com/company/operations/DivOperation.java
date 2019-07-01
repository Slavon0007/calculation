package com.company.operations;

public class DivOperation extends Operation {

    public DivOperation() {
        super("/", "/");
    }

    @Override
    public double doOperation(int a, int b) {
        return a / b;
    }
}
