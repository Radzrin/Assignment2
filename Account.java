import  java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher Benson
 * @since 2020-05-06
 */
class Account{  
 int balance;  
 String name;  
 int savings;  
  
 Account(int balance, String name, int savings){  
 this.balance =balance;  
 this.name =name;  
 this.savings =savings;  
 } 


 public static void main(String[] args){
     
  int accounts; 
  int menus;
     
    Scanner sc = new Scanner(System.in);
    
    accounts = sc.nextInt();
    
    /**
     * first loop
     */
    while (accounts !=0){ 
    
    /**
     * check accounts
     */    
    switch(accounts) {
    case 1:
    System.out.println("");
    break;
    case 2:
    System.out.println("");
    break;
    case 3:
    System.out.println("");
    break;
    }
    } 
    menus = sc.nextInt();
      
    switch(menus) {
    case 1:
    System.out.println("");
    break;
    case 2:
    System.out.println("");
    break;
    case 3:
    System.out.println("");
    break;    
    }
      
 }
}
