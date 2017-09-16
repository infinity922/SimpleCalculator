/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculatorv2;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class CalculatorRunningClass {
    
    public int add(Scanner scanner){
        int answer = 0;
        System.out.println("Enter 1st number followed by 2nd number");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        answer = n1+n2;
        return answer;
    }
    public CalculatorRunningClass(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Welcome to Calculator");
        System.out.println("Do you want to 1 Add 2 Subtract 3 Multiply or 4 Divide");
        int response = scanner.nextInt();
        int answer = 0;
        switch (response){
            case 1:
                answer = add(scanner);
        }
        System.out.println(answer);
    }
}
