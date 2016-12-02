import java.lang.reflect.Array;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by jasperhessellund on 16/09/16.
 */
public class Exercises {


    //Ex 1 *Done*
    public static void numberFormatException(String i) {
        try {
            int j = Integer.parseInt(i);
            System.out.println("(numberFormatException) String converted to int: " + j);
        } catch (NumberFormatException nfe) {
            System.out.println("(numberFormatException) String input is not a number");
        }
    }

    //Ex 2 *Done*
    public static void displaySum() {
        int x = 1;



        do{
            try {
                Scanner scan = new Scanner(System.in);

                System.out.println("This program will display the sum of two numbers.");
                System.out.println("Write the first of the two numbers:");
                int j = scan.nextInt();
                System.out.println("Write the second of the two numbers:");
                int i = scan.nextInt();
                System.out.println(j+i);
                x=2;

            } catch (InputMismatchException ime) {

                System.out.println("You need to write a number. Try again.");


            }
        } while (x==1);


    }

    //Ex 3 *Done*
    public static void arrayIndexOutOfBoundsException() {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[100];

        try {
            System.out.println("Please write your desired index:");
            int index = scan.nextInt();
            array[index] = index;
            System.out.println("The index is " + array[index]);


        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Out of Bounds");

        }
    }

    //Ex 4 *Done*
    public static void illegalArgumentException() {

        Loan loan = new Loan();

        loan.setAnnualInterestRate(1);
        loan.setNumberOfYears(2000);
        loan.setLoanAmount(1);
        if (loan.getLoanAmount() <= 0 || loan.getAnnualInterestRate() <= 0 || loan.getNumberOfYears() <= 0) {
            throw new IllegalArgumentException();
        } else {
            System.out.println("Loan.java is working");
        }


    }

    //Ex 5 k$
   /* public static void illegalTriangleException () {

    }
    */
    //Ex 6 *Done*
    public static void hex2Dec(String hex) {

        try {

            int value = Integer.parseInt(hex, 16);
            System.out.println(value);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
        }
    }

    //Ex 7 *Done*
    public static void bin2Dec (String binaryString) {


        try {
            int bin = Integer.parseInt(binaryString, 2);
            System.out.println(bin);
        }
        catch (NumberFormatException nfe) {
            System.out.println(nfe);
        }

    }

    //Ex 8 *Done*
    public static void hexFormatException (String hexx) throws HexFormatException{
        try{
            int value = Integer.parseInt(hexx, 16);
            hex2Dec(hexx);
        }
        catch(Exception Ignored) {
        try {
            throw new HexFormatException();
        }
        catch (Exception e){
            System.out.println(e+ hexx);

        }
        }
    }

    //Ex 9 *Done*
    public static void binaryFormatException (String bin) throws Exception {

        try{
            int value = Integer.parseInt(bin, 2);
            bin2Dec(bin);
        }
        catch(Exception Ignored) {
            try {
                throw new BinaryFormatException();
            }
            catch (Exception e){
                System.out.println(e+bin);

            }
        }
    }

    //Ex 10 *Done*
    public static void outOfMemoryError () {
        try {
            long[][] ary = new long[Integer.MAX_VALUE][Integer.MAX_VALUE];
        }
        catch (OutOfMemoryError error) {
            System.out.println(error);
        }
    }



}




