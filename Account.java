import  java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * This program is used to simulate an ATM with 3 
 * different accounts and gives the user the least amount of
 * bills possible when withdrawing so lets say you want 90$
 * its supposed to give you a 50$ and two 20$ and not
 * 18 5$ bills
 * 
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
 
  public String toString(){ 
  return balance+" "+name+" "+savings;  
 }  


 public static void main(String[] args){
  /**
   * Variables
   */   
  Account s1=new Account(999,"you",325);  
  Account s2=new Account(3405,"Justin",600);
  Account s3=new Account(101,"Matthew",56);  
  int accounts; 
  int menus;
  int withdraw;
  int put;
  int transfer;
  int ammount;
  int ammountSave;
  int bill100;
  int bill50;
  int bill20;
  int bill10;
  int toonie;
  int loonie;
  int choose;
  String Matthew ="Matthew";
  String You ="You";
  String Justin ="Justin";
  String give;
  
    Scanner sc = new Scanner(System.in);
    
    accounts = sc.nextInt();
   
   System.out.println("Who might you be ?");
   System.out.println("");
   System.out.println("1.You");
   System.out.println("");
   System.out.println("2.justin");
   System.out.println("");
   System.out.println("3.Matthew");
   System.out.println("");
    
    
    /**
     * check accounts
     */    
    switch(accounts) {
    case 1:
    System.out.println("accessing your account");
    System.out.println("balance"+" "+"name"+" "+"savings");
    System.out.println(s1);
    break;
    case 2:
    System.out.println("accessing Matthew's account");
    System.out.println("balance"+" "+"name"+" "+"savings");
    System.out.println(s2);
    break;
    case 3:
    System.out.println("accessing Justin's account");
    System.out.println("balance"+" "+"name"+" "+"savings");
    System.out.println(s3);
    break;
    case 0:
    System.out.println("Goodbye");
    System.exit(0);
    break;
    } 
    menus = sc.nextInt();
      
    System.out.println("________________"+"  "+"_____________________");
    System.out.println("| 1. Get cash  |"+"  "+"| 2. transfer money |");
    System.out.println("________________"+"  "+"_____________________");
    
    System.out.println("______________"+"   "+"________________");
    System.out.println("| 3. Deposit |"+"   "+"| 4. Payments  |");
    System.out.println("______________"+"   "+"________________");
    
    System.out.println("___________");
    System.out.println("| 0. exit |");
    System.out.println("___________");


    switch(menus) {
    case 1:
    System.out.println("");
    System.out.println("How much do you want to  withdraw ?");
    withdraw = sc.nextInt();
    System.out.println("You get "+"bill");
    break;
    case 2:
    System.out.println("How much do you want to tansfer");
    transfer = sc.nextInt();
    System.out.println("to whom?");
    give = sc.nextLine();
    if (give.equals(You)){
    int remove = balance- transfer;    
    System.out.println("Now"+"you have"+"amm"+"$"+"and" +"name1"+"has"+"amm"+"$");
    }
    break;
    case 3:
    System.out.println("How much do you want to deposit?");
    System.out.println("do you want to put it in your (1)balance or (2)savings account");
    choose = sc.nextInt();
    if(choose == 1 ){
      int add = put + balance; 
     System.out.println("name"+ "balance is "+add+"$"); 
    }else{
    put=sc.nextInt();
    int add = put + savings;
    System.out.println("your savings is "+add+"$");
    }
    break;  
    case 4:
    System.out.println("");
    
    System.out.println("");
    break;  
    case 0:
    System.out.println("goodbye");
    break;  
    }
      
 }
}
