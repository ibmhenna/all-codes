package com.ibm.thread;

public class Application {
	public static void main(String[] args) {
		Thread t1 =new Worker(); //main thread created
		t1.start(); //string created
//		Thread t2 = Thread(new AnotherWorker()); //another method for thread creation. Runnable is preferred over thread
//		t2.start(); 
		System.out.println("in main thread");
	} //after execution both threads are destroyed
}
