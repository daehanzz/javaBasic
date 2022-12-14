package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList original = new ArrayList<>(10);
		ArrayList copy = new ArrayList<>(10);
		ArrayList copy2 = new ArrayList<>(10);
		
		for(int i=0;i<10;i++)
			original.add(i+"");
		
		Iterator it = original.iterator();
		
		while(it.hasNext()) {
			copy.add(it.next());
		}
		
		System.out.println("== Original에서 copy로 복사(copy) ==");
		System.out.println("original : "+original);
		System.out.println("copy : "+copy);
		System.out.println();
		
		it = original.iterator();
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
		}
		
		System.out.println("== Original에서 copy2로 이동(move) ==");
		System.out.println("original : "+original);
		System.out.println("copy2 : "+copy2);
		System.out.println();
	}

}
