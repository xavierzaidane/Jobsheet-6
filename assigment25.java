import java.util.Scanner;
public class assigment25 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    boolean menu = true;
    boolean login = true;
    
     while (login) {
        System.out.println("Masukkan nama");
        String u = scan.next();
        System.out.println("Masukkan password");
        int pass = scan.nextInt();
            if (u.equals("Majid") && pass == 123){
             login = false;
             menu = true;
        }
        else {
            System.out.println("Wrong user");
            login = true;
            menu = false;
        }
        }
        
        while (menu) {
                    System.out.println("====================================");
                    System.out.println("------ Welcome to Bank Qwerty ------");
                    System.out.println("====================================");
                    System.out.println("1. Withdraw");
                    System.out.println("2. Top up");
                    System.out.println("3. Transfer");
                    System.out.println("4. Payment");
                    System.out.println("5. Cash Deposit");
                    System.out.println("6. Balance Info");
                    System.out.println("7. Bill"); 
                    int choice = scan.nextInt();
        switch (choice){
        case 1 :
        System.out.println("Your withdraw is 2003");
        menu = false;
        System.out.println("you want back to menu ? (y/n)");
        String back = scan.nextLine();
        if (back.equals("y")) {
            
        }
        break;

        case 2 :
        System.out.println("Your top up");
        }
        }
                    
        }

        
        
     
    
    
    
    
    
        

        }   

 

    
