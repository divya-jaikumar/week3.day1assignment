package overridingbank;

public class BankInfo {
	public void saving() {
		System.out.println("This is my saving()...");
	}
	public void fixed() {
		System.out.println("Iam in fixed()...");
	}
	public void deposit() {
		System.out.println("Iam in deposit()-Bank");
	}
	public static void main(String[] args) {
		BankInfo bank=new BankInfo();
		bank.saving();
		bank.fixed();
		bank.deposit();

	}

}
