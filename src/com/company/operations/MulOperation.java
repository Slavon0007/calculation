package com.company.operations;

public class MulOperation extends Operation {

    public MulOperation() {
        super("*", "\\*");
    }

    @Override
    public double doOperation(int a, int b) {
        return a * b;
    }
}
