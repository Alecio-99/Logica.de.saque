package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exepitions.BusinessException;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Informe os dados da conta: ");
		System.out.println("Numero: ");
        int number = sc.nextInt();
        System.out.println("Titular");
        sc.nextLine();
        String holter = sc.next();	
        System.out.print("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.println("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();
        
        
        Account acc = new Account(number, holter, balance, withdrawLimit);
        
        System.out.println();
        System.out.println("Informe a quantidade para sacar: ");
        double amount = sc.nextDouble();
        
          try {
        	 acc.withdraw(amount);
        	 System.out.printf("Novo saldo: %2f%n", acc.getBalance());
         }
           catch (BusinessException e) {
        	   System.out.println(e.getMessage());  
          }
        
	}
}
