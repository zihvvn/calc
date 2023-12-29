import.java.util.Scanner;
public class calculator {

    public static void main (String[] args) {
        int n1;
        int n2;
        int n3;
        int cal;
        int quotient;
        int remainder;

        system.out.printIn(x: "Enter 2 number: ");
        Scanner r=new Scanner(System.in);

        System.out.printIn(x: "Enter First Number: ");
        n1=r .nextInt();

        System.out.printIn(x: "Enter Second Number: ");
        n2=r .nextInt();

        System.out.printIn(x: "Select Operation: ");
        System.out.printIn(x: "1 -  Add");
        System.out.printIn(x: "2 -  Subtract");
        System.out.printIn(x: "3 -  Multiply");
        System.out.printIn(x: "4 -  Devide");
        System.out.printIn(x: "Enter Operation Number");

        Scanner s=new Scanner(system.in);
        n3=s .nextInt();

        if (n3==1) {
            cal=n1+n2;
            System.out.printIn(x: "Sum of two numbers: " +cal);
        }
        else if (n3==2) {
            cal=n1-n2;
            System.out.printIn(x: "Difference of two numbers: " +cal);
        }
        else if (n3==3) {
            cal=n1*n2;
            System.out.printIn(x: "Product of two numbers: " +cal);
        }
        else if (n3==4) {
            quotient=n1/n2;
            remainder=n1%n2;
            System.out.printIn(x: "Quotient of two numbers: " +quotient)
            System.out.printIn(x: "Remainder of two numbers: " +remainder);
        }
    }
}