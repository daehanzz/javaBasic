package variable;

public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=0;
		int age=14;
		
		System.out.println(year);	//0
		System.out.println(age);	//14
		
		year=age+2000; // ���� age�� ���� 2000�� ���ؼ� ���� year�� ����
		age=age+1;	   // ���� age�� ����� ���� 1 ������Ų��.
		
		System.out.println(year);	//2014
		System.out.println(age);	//15
	}

}