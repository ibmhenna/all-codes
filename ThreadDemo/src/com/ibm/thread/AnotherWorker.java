package com.ibm.thread;

public class AnotherWorker implements Runnable{
		@Override //to tell the compiler that we are overriding
		public void run() {
			System.out.println("in another worker threads"+Thread.currentThread()); //second thread created
		}


}
