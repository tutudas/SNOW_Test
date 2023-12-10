package com.test.threadTest;

public class ThreadTest02 extends Thread {

	int thId =0;
	
	public ThreadTest02 (int Id)
	{
	thId = Id;
	}
	
    public void run() {
    	for (int x =0; x<10; x++){
    		
        System.out.println("Hello from a thread, thId =" +thId);
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    	}
    }

    public static void main(String args[]) {
       // (new Thread(new ThreadTest01())).start();
        Thread th1 = new ThreadTest02(1);
        Thread th2 = new ThreadTest02(2);
        th1.start();
        th2.start();
    }


}
	

