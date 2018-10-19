/*
 * Peter Horne-Deus
 * forLoops.java
 * demos for loops
 * October 19,2018
 */

package forloops;

import java.util.Scanner;

public class ForLoops {

    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int choice;
        int number = 0;
        
        System.out.println("--Program For Counting--\n");
        
        System.out.println("Choose One Of Four Options: ");
        System.out.println("1..... 0 - 10 by 1");
        System.out.println("2..... 100 - 0 by 10");
        System.out.println("3..... 50 - 500 by 50");
        System.out.println("4..... 6000 - 1000 by 1000");
        System.out.println("Enter Choice: ");
        
        choice = keyedInput.nextInt();
        
        if (choice == 1){
            
            number = -1;
            
            System.out.println("You choose option 1: ");
            System.out.println("-------------------------");
            for (int i = 0; i <= 10; i++){
                number ++;
                System.out.println(number);
            }
        }
        else if (choice == 2){
            
            number = 110;
            
            System.out.println("You choose option 2: ");
            System.out.println("-------------------------");
            
            for (int i = 0; i <= 10; i++){
                number = number - 10;
                System.out.println(number);
            }
        }
        else if (choice == 3){
            
            number = 0;
            
            System.out.println("You choose option 3: ");
            System.out.println("-------------------------");
            for (int i = 0; i <= 9; i++){             
                number = number + 50;
                System.out.println(number);
            }
        }
        else if (choice == 4){
            
            number = 7000;
            
            System.out.println("You choose option 4: ");
            System.out.println("-------------------------");
            
            for (int i = 0; i <= 5; i++){
                number = number - 1000;
                System.out.println(number);
            }
        }
        
    }
    
}
