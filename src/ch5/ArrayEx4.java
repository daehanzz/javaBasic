package ch5;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        char[] abc  = {'A','B','C','D'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(abc);    // 예외적으로 char배열은 요소들을 전부 출력함.
        System.out.println(num);
 
        // 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);
 
        // 배열 abc를 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사.
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);
 
        // num의 인덱스6 위치에 3개를 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
