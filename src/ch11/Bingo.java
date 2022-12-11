package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * HashSet 은 같은 숫자가 비슷한 위치에 출력됨
		 * 자체적인 저장방식에 따라 순서가 결정되기 때문
		 * 이 경우엔 LinkedHashSet을 쓰는게 더 나음
		 * */
		
		
		Set set = new HashSet<>();
//		set set = new LinkedHashSet<>();
		int[][] board = new int[5][5];
		
		for(int i=0; set.size()<25; i++) {
			int num = (int)(Math.random()*50)+1;
			
			set.add(num);
		}
		
		Iterator it = set.iterator();

		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				board[i][j] = Integer.parseInt(String.valueOf(it.next()));
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			} // for문 끝(int j)
			System.out.println();
		} // for문 끝(int i)
	}

}
