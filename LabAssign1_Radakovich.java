
import java.util.Scanner;


/**
 *
 * @author Julie Radakovich
 * CIT 130 - Lab Assignment 1
 */
public class LabAssign1_Radakovich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        System.out.println("Enter first integer: ->");
            int num1 = calculator.nextInt();
        System.out.println("Enter second integer: ->");
            int num2 = calculator.nextInt();
        System.out.println("Enter operation of choice"
                + " 1 - addition "
                + " 2 - subtraction "
                + " 3 - multiplication "
                + " 4 - division "
                + " 5 - modulus "
                + " Choice: -> ");
            int num3 = calculator.nextInt();
            if (num3 == 1)
            {
                int sum = num1 + num2;
                System.out.println("Sum is " + sum);
            }
            else if (num3 == 2)
            {
                int dif = num1 - num2;
                System.out.println("Difference is " + dif);
            }
            else if (num3 == 3)
            {
                int mult = num1 * num2;
                System.out.println("Product is " + mult);
            }
            else if (num3 == 4)
            {
                double div = (double) num1/num2;
                if (num2 == 0)
                {
                    System.out.println("Division by zero is not allowed!");
                }
                else
                {
                    System.out.println("Quotient is " + div);
                }
            }
            else if (num3 == 5)
            {
                int mod = num1 % num2;
                if (num2 == 0)
                {
                    System.out.println("Division by zero is not allowed!");
                }
                else
                {
                    System.out.println("Remainder is " + mod);
                }
            }
            else
            {
                System.out.println("Incorrect option selection! Try again.");
            }
        }
        
    }
