package com.jayashree.java;
/**
 * 
 * @author jayashreedas
 *
 */
// problem statements: Rupee and Rohit both are married couple and both of them are sharing common 
// bank account , they both have decided not to withdraw about balance is less , that mean always 
// they gonna check balance before withdraw balance 
// but it could happen Rohit checks balance it's showing 2x , and Rohit wants x but after checking 
// balance Rohit falls sleep and by that time Rupee wants 2x and check the balance and withdraw 2x 
// amount , after getting up Rohit will be trying to withdraw balance it's showing Overdrawn .

public class SharedJob  implements Runnable  {

	private BankAccount account = new BankAccount();
	
	public static void main(String[] arg) {
		SharedJob sb = new SharedJob();
		Thread t2 = new Thread(sb);
		Thread t1 = new Thread(sb);
		t1.setName("rupee");
		t2.setName("Rohit");
		t1.start();
		t2.start();
	}
	
	
	public void run() {
		for(int i = 0 ; i < 10 ; i ++) {
			makeWithDraw(100);
			if(account.getBalance() < 0) {
				System.out.println(" Overdrawn");
			}
			
		}
	}


	private void makeWithDraw(int amount) {
		if(account.getBalance() >= amount) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(" woke up please " + Thread.currentThread().getName());
			account.withDraw(amount);
			System.out.println(" hello " + Thread.currentThread().getName() + " U have successfully withdrawn ");
			
		}else {
			System.out.println(" sorry "+ Thread.currentThread().getName());
		}
		
	}
	
	
	
}

/*
woke up please Rohit
woke up please rupee
hello Rohit U have successfully withdrawn 
hello rupee U have successfully withdrawn 
woke up please rupee
woke up please Rohit
hello Rohit U have successfully withdrawn 
hello rupee U have successfully withdrawn 
woke up please rupee
woke up please Rohit
hello rupee U have successfully withdrawn 
hello Rohit U have successfully withdrawn 
woke up please Rohit
woke up please rupee
hello Rohit U have successfully withdrawn 
hello rupee U have successfully withdrawn 
woke up please Rohit
hello Rohit U have successfully withdrawn 
woke up please rupee
hello rupee U have successfully withdrawn 
sorry rupee
sorry rupee
sorry rupee
sorry rupee
sorry rupee
woke up please Rohit
hello Rohit U have successfully withdrawn 
Overdrawn
sorry Rohit
Overdrawn
sorry Rohit
Overdrawn
sorry Rohit
Overdrawn
sorry Rohit
Overdrawn



output will be like this depends on system but here both of them are unaware about what's going on .
*/

