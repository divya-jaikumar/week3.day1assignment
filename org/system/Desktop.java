package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Typing my desktop size....");
	}

	public static void main(String[] args) {
		Desktop des=new Desktop();
		des.computerModel();
		des.desktopSize();

	}

}
