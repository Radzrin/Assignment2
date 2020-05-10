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
 * @author Radzrin
 * @since 2020-05-06
 */
class Account{  
 int balance;  
 String name;  
 int savings;  
 
 /**
  * 
  * @param balance
  * @param name
  * @param savings 
  */ 
 Account(int balance, String name, int savings){  
 this.balance =balance;  
 this.name =name;  
 this.savings =savings;  
 } 
 
 /**
  *
  * @return 
  */
 @Override
  public String toString(){ 
  return balance+"      "+name+"      "+savings;  
 }  

/**
 * 
 * @param args 
 */
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
  String answer;
  String no = "no";
  String yes = "yes";
  int balance1 =999; 
  int balance2 =3405;
  int balance3 = 101;
  int savings1 =325; 
  int savings2 =600;
  int savings3 = 56;
  
  System.out.println("WELCOME BACK!!!"); 
  
    Scanner sc = new Scanner(System.in);

   System.out.println("Who might you be ? press 0 to exit");
   System.out.println("");
   System.out.println("1.You");
   System.out.println("");
   System.out.println("2.justin");
   System.out.println("");
   System.out.println("3.Matthew");
   System.out.println("");
   accounts = sc.nextInt();        
    
   int id = accounts;
   String person = Integer.toString(id);
    /**
     * choose an account
     */    
    switch(accounts) {
    case 1:
    System.out.println("accessing your account");
    System.out.println("");
    System.out.println("balance"+"||"+"name"+"||"+"savings");
    System.out.println(s1);
    break;
    case 2:
    System.out.println("accessing Matthew's account");
    System.out.println("");
    System.out.println("balance"+"||"+"name"+"||"+"savings");
    System.out.println(s2);
    break;
    case 3:
    System.out.println("accessing Justin's account");
    System.out.println("");
    System.out.println("balance"+"||"+"name"+"||"+"savings");
    System.out.println(s3);
    break;
    case 0:
    System.out.println("Goodbye");
    System.exit(0);
    break;
    } 
    /**
     * select a menu
     */
    System.out.println("");
    System.out.println("choose one of the menus"); 
    System.out.println("");
    System.out.println("________________"+"  "+"_____________________");
    System.out.println("| 1. Get cash  |"+"  "+"| 2. transfer money |");
    System.out.println("________________"+"  "+"_____________________");
    
    System.out.println("______________"+"   "+"________________");
    System.out.println("| 3. Deposit |"+"   "+"| 4. Payments  |");
    System.out.println("______________"+"   "+"________________");
    
    System.out.println("___________");
    System.out.println("| 0. exit |");
    System.out.println("___________");
    menus = sc.nextInt();
    
    /**
     * withdraw money from account
     */
    switch(menus) {
    case 1:
    System.out.println("");
    System.out.println("How much do you want to  withdraw ?");
    withdraw = sc.nextInt();
    
    System.out.println("You get "+"bill");
    break;
    /**
     * transfer money
     */
    case 2:
          
    System.out.println("How much do you want to tansfer");
    transfer = sc.nextInt();
    System.out.println("to whom?"+" You, Matthew or Justin?");
    give = sc.nextLine();
    if(id==1){ 
    
   
    /**
    * checks to see if you don't send more then you have 
    */ 
     while(transfer > balance1) {
      System.out.println("Error: you can't send more then you currently have");
      System.out.println("Please put another value");
       transfer = sc.nextInt();  
     }
     
       /**
     * check to see if you don't send money to yourself
     */
    while(give.equals(You)){
    System.out.println("Error: You cannot send money to yourself"); 
    give = sc.nextLine(); 
    }    
    if (give.equals(Matthew)){
    int remove = balance1 - transfer; 
    int add = balance2+ transfer;
    System.out.println("Now Matthew has"+add+"$"+" and You have "+remove+"$");
    }else{
    int remove = balance1 - transfer; 
    int add = balance3+ transfer;    
    System.out.println("Now Justin has "+add+"$"+" and you have "+remove+"$");    
    }
    }
    /**
     * transfer from Matthew
     */
    if(id==2){
    /**
    * checks to see if you don't send more then you have 
    */ 
     while(transfer > balance2) {
     System.out.println("Error: you can't send more then you currently have");
     System.out.println("Please put another value");
     transfer = sc.nextInt();  
     }   
     /**
     * check to see if you don't send money to yourself
     */
    while(give.equals(Matthew)){
    System.out.println("Error: You cannot send money to yourself"); 
    give = sc.nextLine(); 
    }    
    if (give.equals(You)){
    int remove = balance - transfer; 
    int add = balance2+ transfer;
    System.out.println("Now"+"Matthew has"+add+"$"+"and" +"name1"+"has"+remove+"$");
    }
    }
    /**
     * transfer from Justin 
     */
    if(id==3){
    /**
    * checks to see if you don't send more then you have 
    */ 
     while(transfer > balance3) {
     System.out.println("Error: you can't send more then you currently have");
     System.out.println("Please put another value");
     transfer = sc.nextInt();  
     }       
     /**
     * check to see if you don't send money to yourself
     */
    while(give.equals(Justin)){
    System.out.println("Error: You cannot send money to yourself"); 
    give = sc.nextLine(); 
    }    
    if (give.equals(You)){
    int remove = balance- transfer; 
    int add = balance3+ transfer;
    System.out.println("Now"+"Justin has"+add+"$"+"and" +"name1"+"has"+remove+"$");
    }
    }
    break;
    /**
     * deposit
     */
    case 3:
     if(id==1){   
    System.out.println("do you want to put it in your (1)balance or (2)savings account");
    choose = sc.nextInt();
    if(choose == 1 ){   
    System.out.println("How much do you want to deposit?");
    put = sc.nextInt();  
    int add = put + balance1; 
    System.out.println("your balance is "+add+"$"); 
    }else{
    put = sc.nextInt();     
    int add = put + savings1;
    System.out.println("your savings is "+add+"$");
    }
    }
    if(id==2){   
    System.out.println("do you want to put it in your (1)balance or (2)savings account");
    choose = sc.nextInt();
    if(choose == 1 ){   
    System.out.println("How much do you want to deposit?");
    put = sc.nextInt();  
    int add = put + balance2; 
    System.out.println("Matthew's balance is "+add+"$"); 
    }else{
    put = sc.nextInt();     
    int add = put + savings2;
    System.out.println("Matthew's savings is "+add+"$");
    }
    }
    if(id==3){   
    System.out.println("do you want to put it in your (1)balance or (2)savings account");
    choose = sc.nextInt();
    if(choose == 1 ){   
    System.out.println("How much do you want to deposit?");
    put = sc.nextInt();  
    int add = put + balance3; 
    System.out.println("Justin's balance is "+add+"$"); 
    }else{
    put = sc.nextInt();     
    int add = put + savings3;
    System.out.println("Justin's savings is "+add+"$");
    }
    }
    break;  
    /**
     * see payments
     */
    case 4:
    System.out.println("Accessing past purchases");
    if(id==1){
    System.out.println("items   ||     Price");   
    System.out.println("bag     ||     50$");
    }
    if(id==2){
    System.out.println("items   ||     Price");   
    System.out.println("Plane ticket || 1000$");
    System.out.println("apples || 10$");
    System.out.println("Crazy Glue || 15$");
    System.out.println("mc Donalds || 20$");
    }
    if(id==3){
    System.out.println("items   ||     Price");   
    System.out.println("No recent Purchases");
    }
    
    System.out.println("");
    break; 
    /**
     * end program
     */
    case 0:
    System.out.println("goodbye");
    System.exit(0);
    break;  
    }
}  
 
}
