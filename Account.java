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
 public int balance;  
 public String name;  
 public int savings;  
 
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
  int choose;
  int b5=0;
  int b10=0;
  int b20=0;
  int b50=0;
  int b100=0;
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
     * challenge
     */
    switch(menus) {
    case 1:
    System.out.println("");
    System.out.println("How much do you want to  withdraw ?");
    withdraw = sc.nextInt();
    /**
     * makes sure you don't withdraw more than you have
     */
    while(id==1 && withdraw> balance1){
    System.out.println("Error: you can't pull out more than what you have");     
    }
    while(id==2 && withdraw> balance2){
    System.out.println("Error: you can't pull out more than what you have");     
    }
    while(id==3 && withdraw> balance3){
    System.out.println("Error: you can't pull out more than what you have");     
    }
    /**
     * challenge part
     */
    int div5 = withdraw%5;    
    while (div5!=0){
    System.out.println("please put in a number divisible by 5");
    withdraw =sc.nextInt();
    div5 = withdraw%5;
    }   
    int idk = withdraw/100;
    while(idk>=1){
    idk--;
    b100++;
    }
    int remainings = withdraw - (b100*100);
    int idk2 = remainings/50;
    while(idk2>=1){
    idk2--;
    b50++;
    }   
    int remainings1 = remainings - (b50*50);   
    int idk3 = remainings1/20;
    while(idk3>=1){
    idk3--;
    b20++;
    }       
    int remainings2 = remainings1 - (b20*20);    
    int idk4 = remainings2/10;
    while(idk4>=1){
    idk4--;
    b10++;
    }   
    int remainings3 = remainings2 - (b10*10);
    
    int idk5 = remainings3/5;
    while(idk5>=1){

    idk5--;
    b5++;
    }
    
    String  total ="you recieve "+b100+" 100$ bills + "+b50+" 50$ bills + "
    +b20 +" 20$ bills + "+ b10+" 10$ bills + "+b5+ " 5$ bill";
    System.out.println(total.trim()); 

    
    System.out.println("");
    System.out.println("You get "+"bill");
    break;
    /**
     * transfer money
     */
    case 2:
    System.out.println("");    
    System.out.println("How much do you want to tansfer");
    transfer = sc.nextInt();
    System.out.println("to whom?"+" You, Matthew or Justin?");
    give = sc.nextLine();
    if(id==1){ 
    
   
    /**
    * checks to see if you don't send more then you have 
    */ 
     while(transfer > balance1) {
      System.out.println("");    
      System.out.println("Error: you can't send more then you currently have");
      System.out.println("Please put another value");
       transfer = sc.nextInt();  
     }
     
       /**
     * check to see if you don't send money to yourself
     */
    while(give.equals(You)){
    System.out.println("");     
    System.out.println("Error: You cannot send money to yourself"); 
    give = sc.nextLine(); 
    }    
    if (give.equals(Matthew)){
    int remove = balance1 - transfer; 
    int add = balance2+ transfer;
    System.out.println("");
    System.out.println("Now Matthew has"+add+"$"+" and You have "+remove+"$");
    }else{
    int remove = balance1 - transfer; 
    int add = balance3+ transfer; 
    System.out.println(""); 
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
     System.out.println("");    
     System.out.println("Error: you can't send more then you currently have");
     System.out.println("Please put another value");
     transfer = sc.nextInt();  
     }   
     /**
     * check to see if you don't send money to yourself
     */
    while(give.equals(Matthew)){
    System.out.println("");    
    System.out.println("Error: You cannot send money to yourself"); 
    give = sc.nextLine(); 
    }    
    if (give.equals(You)){
    int remove = balance2 - transfer; 
    int add = balance1+ transfer;
    System.out.println("");
    System.out.println("Now You have "+add+"$"+" and Matthew has "+remove+"$");
    }
    if (give.equals(Justin)){
    int remove = balance2 - transfer; 
    int add = balance3+ transfer;
    System.out.println("");
    System.out.println("Now Justin have "+add+"$"+" and Matthew has "+remove+"$");
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
     System.out.println("");    
     System.out.println("Error: you can't send more then you currently have");
     System.out.println("Please put another value");
     transfer = sc.nextInt();  
     }       
     /**
     * check to see if you don't send money to yourself
     */
    while(give.equals(Justin)){
    System.out.println("");    
    System.out.println("Error: You cannot send money to yourself"); 
    give = sc.nextLine(); 
    }    
    if (give.equals(You)){
    int remove = balance3- transfer; 
    int add = balance1+ transfer;
    System.out.println("");
    System.out.println("Now You have "+add+"$"+" and Justin has "+remove+"$");
    }
    if (give.equals(Matthew)){
    int remove = balance3- transfer; 
    int add = balance2+ transfer;
    System.out.println("");
    System.out.println("Now Matthew has "+add+"$"+"and Justin has "+remove+"$");
    }
    }
    break;
    /**
     * deposit
     */
    case 3:
     if(id==1){ 
    System.out.println("");     
    System.out.println("do you want to put it in your (1)balance or (2)savings account");
    choose = sc.nextInt();
    if(choose == 1 ){   
    System.out.println("");
    System.out.println("How much do you want to deposit?");
    put = sc.nextInt();  
    int add = put + balance1; 
    System.out.println("");
    System.out.println("your balance is "+add+"$"); 
    }else{
    put = sc.nextInt();     
    int add = put + savings1;
    System.out.println("");
    System.out.println("your savings is "+add+"$");
    }
    }
    if(id==2){ 
    System.out.println("");    
    System.out.println("do you want to put it in your (1)balance or (2)savings account");
    choose = sc.nextInt();
    if(choose == 1 ){ 
    System.out.println("");    
    System.out.println("How much do you want to deposit?");
    put = sc.nextInt();  
    int add = put + balance2; 
    System.out.println("");
    System.out.println("Matthew's balance is "+add+"$"); 
    }else{
    put = sc.nextInt();     
    int add = put + savings2;
    System.out.println("");
    System.out.println("Matthew's savings is "+add+"$");
    }
    }
    if(id==3){   
    System.out.println("");    
    System.out.println("do you want to put it in your (1)balance or (2)savings account");
    choose = sc.nextInt();
    if(choose == 1 ){ 
    System.out.println("");    
    System.out.println("How much do you want to deposit?");
    put = sc.nextInt();  
    int add = put + balance3; 
    System.out.println("");
    System.out.println("Justin's balance is "+add+"$"); 
    }else{
    put = sc.nextInt();     
    int add = put + savings3;
    System.out.println("");
    System.out.println("Justin's savings is "+add+"$");
    }
    }
    break;  
    /**
     * see payments
     */
    case 4:
    System.out.println("");    
    System.out.println("Accessing past purchases");
    if(id==1){
    System.out.println("items___||_____Price");   
    System.out.println("bag     ||     50$");
    }
    if(id==2){
    System.out.println("items________||_Price");   
    System.out.println("Plane ticket || 1000$");
    System.out.println("apples       || 10$");
    System.out.println("Crazy Glue   || 15$");
    System.out.println("mc Donalds   || 20$");
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
