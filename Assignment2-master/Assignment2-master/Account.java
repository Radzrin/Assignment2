import  java.util.Scanner;
import java.util.InputMismatchException;
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
 public int accNum;
 public String credit;
 public String card;
         
 
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
  Account s1=new Account(105075,"you",3250);  
  Account s2=new Account(340595,"Matthew",6000);
  Account s3=new Account(90255,"Justin",5600);  
  int accounts; 
  int menus;
  int withdraw;
  int put;
  int transfer;
  int choose;
  int choise;
  String answ;
  int b5=0;
  int b10=0;
  int b20=0;
  int b50=0;
  int b100=0;
  String Matthew="Matthew";
  String You="You";
  String Justin="Justin";
  String answer;
  int balance1=105075; 
  int balance2=340595;
  int balance3= 90255;
  int savings1=3250; 
  int savings2=6000;
  int savings3=5600;
  
   System.out.println("WELCOME BACK!!!"); 
  
   Scanner sc = new Scanner(System.in);
   try{
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
    do{
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
    System.out.println("Take from 1 account or 2 savings?");
    choise = sc.nextInt();
    if(choise == 1){
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
    if(choise==2){
    while(id==1 && withdraw> savings1){
    System.out.println("Error: you can't pull out more than what you have");     
    }
    while(id==2 && withdraw> savings2){
    System.out.println("Error: you can't pull out more than what you have");     
    }
    while(id==3 && withdraw> savings3){
    System.out.println("Error: you can't pull out more than what you have");     
    }
    /**
     * makes sure you want to send all of your money
     */
    if(choise==1){
    while(id==1 && withdraw==balance1){
    System.out.println("are you sure you want to pull out all your money?"); 
    answ = sc.nextLine();
    if (answ.equals("no")){
    System.out.println("chose another amount ");   
    withdraw = sc.nextInt();
    }else{
    continue;   
    }
    }
    while(id==2 && withdraw==balance2){
    System.out.println("are you sure you want to pull out all your money?"); 
    answ = sc.nextLine();
    if (answ.equals("no")){
    System.out.println("chose another amount ");   
    withdraw = sc.nextInt();
    }else{
    continue;   
    }
    }   
    while(id==3 && withdraw==balance3){
    System.out.println("are you sure you want to pull out all your money?"); 
    answ = sc.nextLine();
    if (answ.equals("no")){
    System.out.println("chose another amount ");   
    withdraw = sc.nextInt();
    }else{
    continue;   
    }
    }
    }    
    /**
     * makes sure if you want to take everything out of your savings account
     */
    if(choise==2){
    while(id==1 && withdraw==savings1){
    System.out.println("are you sure you want to pull out all your money?"); 
    answ = sc.nextLine();
    if (answ.equals("no")){
    System.out.println("chose another amount ");   
    withdraw = sc.nextInt();
    }else{
    continue;   
    }
    }
    }
    while(id==2 && withdraw==savings2){
    System.out.println("are you sure you want to pull out all your money?"); 
    answ = sc.nextLine();
    if (answ.equals("no")){
    System.out.println("chose another amount ");   
    withdraw = sc.nextInt();
    }else{
    continue;   
    }
    }   
    while(id==3 && withdraw==savings3){
    System.out.println("are you sure you want to pull out all your money?"); 
    answ = sc.nextLine();
    if (answ.equals("no")){
    System.out.println("chose another amount ");   
    withdraw = sc.nextInt();
    }else{
    continue;   
    }
    }
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
    /**
     * challenge part
     */
    div5 = withdraw%5;    
    while (div5!=0){
    System.out.println("please put in a number divisible by 5");
    withdraw =sc.nextInt();
    div5 = withdraw%5;
    }   
    idk = withdraw/100;
    while(idk>=1){
    idk--;
    b100++;
    }
    remainings = withdraw - (b100*100);
    idk2 = remainings/50;
    while(idk2>=1){
    idk2--;
    b50++;
    }   
    remainings1 = remainings - (b50*50);   
    idk3 = remainings1/20;
    while(idk3>=1){
    idk3--;
    b20++;
    }       
    remainings2 = remainings1 - (b20*20);    
    idk4 = remainings2/10;
    while(idk4>=1){
    idk4--;
    b10++;
    }   
    remainings3 = remainings2 - (b10*10);
    
    idk5 = remainings3/5;
    while(idk5>=1){
    idk5--;
    b5++;
    } 
    int rest =savings1-withdraw;
    int rest1 =savings2-withdraw;
    int rest2 =savings3-withdraw;
    int rest3 =balance1-withdraw;
    int rest4 =balance2- withdraw;
    int rest5 =balance3-withdraw;
    
    String  total ="you recieve "+b100+" 100$ bills + "+b50+" 50$ bills + "
    +b20 +" 20$ bills + "+ b10+" 10$ bills + "+b5+ " 5$ bill";
    System.out.println(total.trim()); 
    if(choise==2){
    if(id==1){  
    System.out.println(""); 
    System.out.println("you now have "+rest+" in your account");
    }
    if(id==2){  
    System.out.println(""); 
    System.out.println("you now have "+rest1+" in your account");
    }
    if(id==3){  
    System.out.println(""); 
    System.out.println("you now have "+rest2+ " in your account");
    }
    }else{
    if(id==1){    
    System.out.println("");  
    System.out.println("you now have "+rest3+ " in your account");
    }
    if(id==2){ 
    System.out.println("");  
    System.out.println("you now have "+rest4+ " in your account");
    }
    if(id==3){ 
    System.out.println("");  
    System.out.println("you now have "+rest5+ " in your account");
    }
    }
    
    break;
    }
    
    /**
     * transfer money
     */
    case 2:
    System.out.println("");    
    System.out.println("How much do you want to tansfer");
    transfer = sc.nextInt();
    System.out.println("to whom?"+" You, Matthew or Justin?");
    String give = sc.nextLine();
    give = sc.nextLine();
      /**
     * makes sure you want to send all of your money
     */
    while(id==1 && transfer==balance1){
    System.out.println("are you sure you want to pull out all your money?"); 
    answ = sc.nextLine();
    if (answ.equals("no")){
    System.out.println("chose another amount ");   
    transfer = sc.nextInt();
    }else{
    continue;   
    }
    }
    while(id==2 && transfer==balance2){
    System.out.println("are you sure you want to pull out all your money?"); 
    answ = sc.nextLine();
    if (answ.equals("no")){
    System.out.println("chose another amount ");   
    transfer = sc.nextInt();
    }else{
    continue;   
    }
    }   
    while(id==3 && transfer==balance3){
    System.out.println("are you sure you want to pull out all your money?"); 
    answ = sc.nextLine();
    if (answ.equals("no")){
    System.out.println("chose another amount ");   
    transfer = sc.nextInt();
    }else{
    continue;   
    }
    }
        
  
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
    System.out.println("Now Matthew has "+add+"$"+" and You have "+remove+"$");
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
    System.out.println("Now Justin has "+add+"$"+" and Matthew has "+remove+"$");
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
    break;
    }
    /**
     * deposit
     */
    case 3:
     if(id==1){ 
    System.out.println("");     
    System.out.println("do you want to put it in your (1)balance or "
            + "(2)savings account");
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
    /**
     * if you are Matthew
     */
    if(id==2){ 
    System.out.println("");    
    System.out.println("do you want to put it in your (1)balance or "
            + "(2)savings account");
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
    System.out.println("do you want to put it in your (1)balance or "
            + "(2)savings account");
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
     * see ecent transactions
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
    System.out.println("Are you sure you want to leave? yes/no");
    answer = sc.nextLine();
    answer = sc.nextLine();
   }while(answer.equals("no"));
    /**
     * catch mistake
     */
   }catch(InputMismatchException e) {
   System.out.println("Error something went wrong");  
   
   }
   }
}  


