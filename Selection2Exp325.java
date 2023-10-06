import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Selection2Exp325 {
        public static void main(String[] args) {
            Scanner input25 = new Scanner(System.in);
            String category;
            int income, netSalary;
            double tax = 0;

            System.out.println("Input category = ");
            category = input25.nextLine();
            System.out.println("Input income = ");
            income = input25.nextInt();

        if(category.equalsIgnoreCase("worker")) {
            if(income <= 2000000)
                tax = 0.1;
            else if(income <= 3000000)
                tax = 0.15;
            else
                tax = 0.25;
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett salary = "+netSalary);
        }else if(category.equals("businessman")) {
            if(income <= 2000000)
                tax = 0.15;
            else if(income <= 2000000)
                tax = 0.2;
            else 
                tax = 0.25;
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett salary = "+netSalary);
        }else 
            System.out.println("Invalid category");
            
        }
    }
