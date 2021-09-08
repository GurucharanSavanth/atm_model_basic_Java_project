package com.company;

import java.util.Scanner;

//create ATMExample class to implement the ATM functionality
public class ATM_Machine
{
    //main method starts
    public static void main(String args[] )
    {
        //declare and initialize balance, withdraw, and deposit
        int balance = 0, withdraw, deposit;

        //create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("ATM Machine\n");
            System.out.println("Select 1 for Withdraw");
            System.out.println("Select 2 for Deposit");
            System.out.println("Select 3 for Check Balance");
            System.out.println("Select 4 for EXIT\n");
            System.out.print("Select the operation:");

            //the user get to choose accordingly
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    //get the withdrawl money from user
                    withdraw = sc.nextInt();

                    //check whether the balance is greater than or equal to the withdrawal amount
                    if(balance >= withdraw)
                    {
                        //remove the withdrawl amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        //notify the error message from the system if ammout is not present
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    //get deposite amount from the person or the user like gurucharan=10,000 as shown
                    deposit = sc.nextInt();

                    //add the deposit amount to the total balanace as shown in the program and represent presented accordingly
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("");
                    break;

                case 3:
                    //displaying the total balance of the user
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    //exit from the the ATM menus
                    System.exit(0);
                    //reposetry in My github Gurucharan 
                    // https://github.com/GurucharanSavanth/atm_model_basic_Java_project/blob/ff8cacfcae7b580e8811271b9ec66795e48fee2c/ATM_Machine.java
            }
        }
    }
}
