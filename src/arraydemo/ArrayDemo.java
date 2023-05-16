/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

import java.util.Scanner;
public class ArrayDemo {

   
    public static void main(String[] args) {
       /* char[] myLetters = new char[5];
        myLetters[0]='R';
        myLetters[1]='A';
        myLetters[2]='H';
        myLetters[3]='U';
        myLetters[4]='L';
        
        for(int i=0; i<myLetters.length; i++){
         System.out.print(myLetters[i]);
        }*/
       System.out.println("enter world");
       Scanner input = new Scanner(System.in);
       String myWorld = input.nextLine();
       char[] myLetters = new char[myWorld.length()];
       for( int i=0; i<myLetters.length; i++){
         myLetters[i]= myWorld.charAt(i);
         System.out.print(myLetters[i]);
       }
       System.out.println("printing in reverse");
       for(int i=myLetters.length-1; i>=0;i--)
           System.out.print(myLetters[i]);
    }
       
}
    
    

