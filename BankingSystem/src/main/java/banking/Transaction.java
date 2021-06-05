package banking;

/**
 *
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction {
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *            The bank where the account is housed.
	 * @param accountNumber
	 *            The customer's account number.
	 * @param attemptedPin
	 *            The PIN entered by the customer.
	 * @throws Exception
	 *             Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		this.bank = bank;
		this.accountNumber = accountNumber;
		this.attemptedPin = attemptedPin;
	}

	public double getBalance() {
		// complete the function
        return -1;
	}

	public void credit(double amount) {
		 transactions.add(bank.credit(amount));
	}

	public boolean debit(double amount) {
		 transactions.add(bank.debit(amount));
        return true;
	}
	

}
