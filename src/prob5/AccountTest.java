package prob5;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("078-3762-293");
		account.getAccountNo();
		account.save(100);
		account.getAccountNo();
		account.deposit(30);
		account.getAccountNo();
		

	}

}
