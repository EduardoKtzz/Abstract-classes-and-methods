package entities;

//USANDO HERANÇA
public class BusinessAccount extends Account {

	//Atributos
	private Double loanLimit;

	//Construtores
	public BusinessAccount() {

	}

	//Usando o "Super" para puxar os dados do outro construtor
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	//Get e set
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if (amount <= loanLimit)
			balance += amount - 10.0;
	}

	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

}	