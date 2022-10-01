package ch8;

public class NewExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			// TODO: handle exception
			System.out.println("에러 메세지 : "+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException e) {
			// TODO: handle exception
			System.out.println("에러 메세지 : "+e.getMessage());
			e.printStackTrace();
			System.gc();	// Garbage Collection을 수행하여 메모리를 늘려준다.
			System.out.println("다시 설치를 시도하세요");
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException , MemoryException {
		// 프로그램 설치에 필요한 준비를 하는 코드를 적는다
		
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
	}
	
	static void copyFiles() {
		// 파일들을 복사하는 코드를 적는다
	}
	
	static void deleteTempFiles() {
		// 임시파일들을 삭제하는 코드를 적는다
	}
	
	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
	}
	
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
		return true;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg){
		super(msg);
	}
}
