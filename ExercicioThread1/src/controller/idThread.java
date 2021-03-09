package controller;

public class idThread extends Thread{

	@Override
	public void run() {
		System.out.println("id = " + getId());
	}
}
