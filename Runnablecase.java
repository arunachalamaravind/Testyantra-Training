package com.te.maven;

public class Runnablecase  {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i+ "----->"+Thread.currentThread().getName());
			
		}
		};
		runnable.run();
		//System.out.println(runnable);
		
//	Runnable runnable2 = () -> {
//		for (char b = 'A'; b < 'J'; b++) {
//			try {
//				Thread.sleep(1000);
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//			System.out.println(b+ "----->"+Thread.currentThread().getName());
//			
//		}
//		
//	};
	
	//Thread thread = new  Thread(runnable2);
//	Thread thread2 = new Thread(runnable);
//	//thread.start();
//	thread2.start();
	
	}



}
