package com.jayashree.java;

public class SharedJobWithLock  implements Runnable {
	
	BankAccount account = new BankAccount();
	
	
	/**
	 *  making this method synchronized that only one thread can handle this 
	 *  means if Rohit checked balance than Rohit could hold the money until he has withdrawn 
	 *  the amount 
	 *  that means Rohit is locking the money 
	 */
	private synchronized void makeWithDraw(int amount) {
		if(amount < account.getBalance()) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.withDraw(amount);
			System.out.println(" successfully withdrawn " + Thread.currentThread().getName());
			
			
		}else {
			System.out.println(" sorry " + Thread.currentThread().getName() +" insuficient balance");
		}
	}
	
	
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			makeWithDraw(10)
		;
			if( account.getBalance() < 0 ) {
				System.out.println(" Sorry "+ Thread.currentThread().getName());
			}
			
		}
	}
	
	
	
	public static void main(String arg[]) {
		SharedJobWithLock sbl = new SharedJobWithLock();
		Thread t1 = new Thread(sbl);
		Thread t2 = new Thread(sbl);
		t1.setName(" rupee");
		t2.setName(" Rohit");
		t1.start();
		t2.start();
	}

}


// OUTPUT we can see now there is no overdrawn is showing 

/*
 *  successfully withdrawn  rupee
 successfully withdrawn  rupee
 successfully withdrawn  rupee
 successfully withdrawn  rupee
 successfully withdrawn  rupee
 successfully withdrawn  rupee
 successfully withdrawn  rupee
 successfully withdrawn  rupee
 successfully withdrawn  rupee
 successfully withdrawn  rupee
 successfully withdrawn  Rohit
 successfully withdrawn  Rohit
 successfully withdrawn  Rohit
 successfully withdrawn  Rohit
 successfully withdrawn  Rohit
 successfully withdrawn  Rohit
 successfully withdrawn  Rohit
 successfully withdrawn  Rohit
 successfully withdrawn  Rohit
 successfully withdrawn  Rohit
*/
