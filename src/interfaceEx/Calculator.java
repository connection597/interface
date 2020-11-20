package interfaceEx; //인터페이스 구현하기

public abstract class Calculator implements Calc { // 추상클래스
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public int substract(int num1, int num2) {
		return num1- num2;
	}

}
