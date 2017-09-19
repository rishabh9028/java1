package com.cg.main;

public class EmpImp implements IEmployee {

	   public void display() {
	      System.out.println("Display data");
	   }

	   public void insert() {
	      System.out.println("Insert data");
	   } 
	   public void retrive() {
		      System.out.println("Retrive data");
		   } 

	   

	   public static void main(String args[]) {
	      EmpImp m = new EmpImp();
	      m.display();
	      m.insert();
	      m.retrive();
	   }
	} 