package entities;

public abstract class Account {

	//Atributos
	private Integer number;
	private String holder;
	protected Double balance; //Utilizando protected por que ela fica visivel em outras clasess com extends

	//Construtores
	public Account() {

	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	//Get e set
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void withdraw(Double amount) {
		balance -= amount + 5.0;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

}