package org.phone;

public class Phone {
	public void phoneInfo(String city, int number) {
		System.out.println(city+"\t"+number);
	}
	public void phoneInfo(int number, String city) {
		System.out.println(number+"\t"+city);
	}

	public static void main(String[] args) {
		Phone p=new Phone();
		p.phoneInfo("Erode", 979149327);
		p.phoneInfo(1234558, "Salem");
		

	}

}
