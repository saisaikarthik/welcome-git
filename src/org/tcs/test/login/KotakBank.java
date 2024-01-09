package org.tcs.test.login;

public class KotakBank implements ICICbank {

	@Override
	public void savings() {
		System.out.println("%4  bank interst");
	}

	@Override
	public void deposite() {
		System.out.println("%7 bank interst");
	}

	@Override
	public void loan() {
		System.out.println("%1.2 bank interst");
		
	}
	
	@Override
	
	public void widthDraw() {
     
		System.out.println("cash collection from machine");
	}
public static void main(String[] args) {
	KotakBank k =new KotakBank();
	  k.deposite();
      k.loan();
      k.savings();
      k.widthDraw();
}


	
	
}
