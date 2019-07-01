package com.company.operations;

import com.company.MathUtil;

public abstract class Operation {
    private final String operationSymbol;
    private final String operationSplitSymbol;

    public Operation(String operationSymbol, String operationSplitSymbol) {
        this.operationSymbol = operationSymbol;
        this.operationSplitSymbol = operationSplitSymbol;
    }

    public double calculate(String expression) {
        String[] operands = expression.split(operationSplitSymbol);

        if (operands.length != 2) {
            throw new RuntimeException("Expression is not valid. Must be 2 operands");
        }

        if (MathUtil.isRoman(operands[0]) && !MathUtil.isRoman(operands[1])) {
            throw new RuntimeException("Expression is not valid. Mixed values");
        } else if (!MathUtil.isRoman(operands[0]) && MathUtil.isRoman(operands[1])) {
            throw new RuntimeException("Expression is not valid. Mixed values");
        }

        int operand1 = MathUtil.getIntegerValue(operands[0]);
        int operand2 = MathUtil.getIntegerValue(operands[1]);

        return doOperation(operand1, operand2);
    }

    public abstract double doOperation(int a, int b);

    public String getOperationSymbol() {
        return operationSymbol;
    }

    public String getOperationSplitSymbol() {
        return operationSplitSymbol;
    }
}
