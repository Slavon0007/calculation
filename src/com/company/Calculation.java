package com.company;

import com.company.operations.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculation {
    private static final List<Operation> OPERATIONS =
            Arrays.asList(new SumOperation(), new SubOperation(), new DivOperation(), new MulOperation());

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input expression: ");
        String expression = in.nextLine();

        for (Operation operation : OPERATIONS) {
            if (expression.contains(operation.getOperationSymbol())) {
                System.out.println("Result is: " + operation.calculate(expression));
                break;
            }
        }
    }
}
