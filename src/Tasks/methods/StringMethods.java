package Tasks.methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale.Category;

public class StringMethods {

    public static void staticMethods() {
        { // String.copyValueOf(char[],offset,count);
            System.out.println("--- String.copyValueOf(char[],offset,count) ---");
            char c[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
            String alpha = "0123456789";
            int kth = 5;
            String str = String.copyValueOf(c, 2, 1);
            String str2 = String.copyValueOf(alpha.toCharArray(), kth, 1);
            System.out.println(str);
            System.out.println(str2);
            System.out.println("-".repeat(40));
            // ----------------------
        }
        {
            // String.format(strWithPlaceholder,arguments);
            System.out.println("--- String.format(strWithPlaceholder,arguments) ---");
            // Scanner sr = new Scanner(System.in);
            // System.out.print("Enter your name : ");
            String name = "thamizh";// sr.next();
            // System.out.print("Enter your Age : ");
            int age = 26;// sr.nextInt();
            // System.out.print("Enter your DOB : ");
            String date = "28-09-1998";// sr.next();
            String str = "Hi my name is %s, I\'m %d years old, Date of Birth is %s";
            // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            // String formatedDate = date.format(formatter);
            String ans = String.format(str, name, age, date);
            System.out.println(ans);
            System.out.println("%c unicode");
            int a = 97;
            int b = 98;
            String charFromInt = String.format("%c,%C", a, b);
            System.out.println(charFromInt);
            System.out.println("-".repeat(40));
            // ----------------------

        }

    }

}
