package prob5;

public class Account {
	// 아래와 같은 두개의 데이터 가지고 있다.
	private String accountNo;
	private int balance;

	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
	}

	// 입금
	public void save(int money) {
		System.out.println(accountNo + " 계좌에 " + money + "만원이 입금되었습니다.");
		balance += money;
	}

	// 출금
	public void deposit(int money) {
		balance -= money;
		System.out.println(accountNo + " 계좌에 " + money + "만원이 출금되었습니다.");
	}

	public void getAccountNo() {
		System.out.println(accountNo + " 계좌의 잔고는 " + balance + "만원 입니다.");
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
