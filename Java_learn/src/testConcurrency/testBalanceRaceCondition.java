package testConcurrency;

public class testBalanceRaceCondition {

	public static void main(String[] args) {
		Bank task = new Bank();
		task.setBalance(100);
		task.setwithDrawalAmount(75);


		Thread John = new Thread(task);
		Thread Bob = new Thread(task);

		John.setName("John");
		Bob.setName("Bob");

		John.start();
		Bob.start();
		
		
		
		


	}

}

class Bank implements Runnable{
	private int balance;
	private int withDrawalAmount;
	@Override
	public void run() {
		
		withDrawls(withDrawalAmount);
		System.out.println(Thread.currentThread().getName() + ": curent balance is " + getBalance());	
		if(balance<0){
			System.out.println("Money Overdrawn!!");
		}
	}

	public void setBalance(int balance){
		this.balance= balance;
	}

	public synchronized int getBalance(){
		return balance;
	}

	public void setwithDrawalAmount(int withDrawalAmount){
		this.withDrawalAmount= withDrawalAmount;
	}



	public synchronized void withDrawls(int amount){
		
		if(balance>=amount){
			System.out.println(Thread.currentThread().getName() + " withdrawing money");
			balance-=amount;
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount);
		}else{
			System.out.println( Thread.currentThread().getName() + " You dont have enough balance ");
		}
	}






}
