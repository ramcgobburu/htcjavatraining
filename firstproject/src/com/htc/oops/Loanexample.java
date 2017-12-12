package com.htc.oops;
import java.util.*;
public class Loanexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details");
		System.out.println("what kind of job? Permanent or Temporary, enter P for Permanenet , enter T for Temporary");
		String role = sc.nextLine();
		System.out.println("married or unmarried?, type M for married and U for unmarried");
		String status = sc.nextLine();
		System.out.println("how many years experience?");
		int experience = sc.nextInt();
		if(role.equals("P"))
		{
			if(status.equals("M")) {
				if(experience >= 30) {
					System.out.println("loan amount is 45000");
				}else {
					System.out.println("loan amount is 10000");
				}
			}else {
				if(experience >= 30) {
					System.out.println("loan amount is 90000");
				}else {
					System.out.println("loan amount is 20000");
				}
			}
					
		}else {
			if(status.equals("M")) {
				if(experience >= 50) {
					System.out.println("loan amount is 23000");
				}else {
					System.out.println("loan amount is 13000");
				}
			}else {
				if(experience >= 32) {
					System.out.println("loan amount is 2 rupees");
				}else {
					System.out.println("loan amount is 30 rupees");
				}
			}
		}
		
		
		

	}

}
