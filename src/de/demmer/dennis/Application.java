package de.demmer.dennis;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public static void main(String[] args) {	
		
		//  "<>" Generics
		List<Hund> list = new ArrayList<Hund>();
		
//		ArrayList<Hund> list2 = new ArrayList<Hund>();
		
		Hund hund1 = new Hund(5, "Wuffi");
		Hund hund2 = new Hund(3, "Bello");
		Hund hund3 = new Hund(6, "Fiffi");
		
		
		list.add(hund1);
		list.add(hund2);
		list.add(hund3);
		
		System.out.println(list.size());
		
		
		for(Hund h : list) {
			int alter = h.getAlter();
			System.out.println("Alter: " + alter);
		}
		
		
		list.clear();
		
		System.out.println(list.size());
		

		
	}

}
