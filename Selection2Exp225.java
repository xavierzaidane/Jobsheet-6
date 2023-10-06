import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
import javax.lang.model.util.ElementScanner14;
public class Selection2Exp225 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        int angle1, angle2, angle3;
        int totalangle;

        System.out.println("Enter the first angle");
        angle1 = input25.nextInt();
        System.out.println("Enter the second angle");
        angle2 = input25.nextInt();
        System.out.println("Enter the third angle");
        angle3 = input25.nextInt();

        totalangle = angle1+angle2+angle3;

    if(totalangle == 180) {
        if(angle1==90 || angle2==90 || angle3==90) {
            System.out.println("Right triangle");
        }else {
            System.out.println("Not a right triangle");
        }
        System.out.println("Not a triangle"); 

    }else if(angle1 == angle2 && angle2 == angle3) {
        System.out.println("Equilateral triangle");
    }else if(angle1 == angle2 || angle2 == angle3 || angle3 == angle1)
        System.out.println("isosceles triangle");
    }
    
        
    
    }
        
    

