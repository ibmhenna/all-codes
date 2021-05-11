package com.ibm.thread;

public class Worker extends Thread{
	@Override //to tell the compiler that we are overriding
	public void run() {
		System.out.println("in worker threads"+Thread.currentThread()); //second thread created
	}

}
