package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		System.out.println();

		//Account acc1 = new Account(1001, "Alex", 1000.0); - Aqui da erro por que na classe Account está com abstract
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

		//Aqui vamos utilizar o polimofismo para acessar todas contas independente da sbbclasse
		List<Account> clients = new ArrayList<>();

		clients.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		clients.add(new SavingsAccount(1002, "Bob", 1000.0, 0.01));
		clients.add(new BusinessAccount(1003, "Eduardo", 300.0, 500.0));
		clients.add(new BusinessAccount(1004, "Anna", 500.0, 400.0));

		//Para somar o saldo de todos na lista
		double sum = 0.0;
		for (Account acc : clients) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		//Adicionar um valor em todos clientes da lista
		for (Account acc : clients) {
			acc.deposit(10.0);
		}

		for (Account acc : clients) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}

	}

} 