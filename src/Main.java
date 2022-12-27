import java.util.Scanner;

/*
 *@Author Emircan Aktaş - 27.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, numeral, tempNumber, total = 0;
        System.out.print("Enter a number :");
        number = inp.nextInt();
        tempNumber = number;
        while (number > 0) {
            numeral = number % 10;
            total += numeral;
            number /= 10;
        }
        System.out.println("The sum of the digits of the number " + tempNumber + " :" + total);

    }
}