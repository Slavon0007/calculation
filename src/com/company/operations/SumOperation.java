package com.company.operations;

public class SumOperation extends Operation {

    public SumOperation() {
        super("+", "\\+");
    }

    @Override
    public double doOperation(int a, int b) {
        return a + b;
    }
}
