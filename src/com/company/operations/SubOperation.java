package com.company.operations;

public class SubOperation extends Operation {

    public SubOperation() {
        super("-", "-");
    }

    @Override
    public double doOperation(int a, int b) {
        return a - b;
    }
}
