package org.college;

public class College {
	public void collegeName() {
		System.out.println("College name is ACT");
	}
	public void collegeCode() {
		System.out.println("College code is 1316");
	}
	public void collegeRank() {
		System.out.println("College ranks 5th");
	}

	public static void main(String[] args) {
		College colg=new College();
		colg.collegeName();
		colg.collegeCode();
		colg.collegeRank();
		

	}

}
