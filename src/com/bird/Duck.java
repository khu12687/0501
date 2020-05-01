package com.bird;
/*
상속관계에서 생성자에 대해 심도있게....
*/
public class Duck extends Bird{
	String name = "난 오리";
	public Duck(){

		//상속관계에서는 자식의 초기화보다 더 앞서서 부모가 먼저 존재하고
		//초기화 되어야 하므로, 개발자가 영시하지 않더라도 디폴트 생성자 안에는 super()부모 생성자 호출이 생략되어있다
		//name ="도날드" 에러난다 why? 상속관계에서 자식의 생성자에서 부모의 생성자 호출보다 앞서는 코드는 존재할수없다
		//즉 super() 위에 코드 작성불가!! 부모의 초기화가 언제나 자식보다 앞서야 하므로...
		super(5);
		name="도날드";
	}
	public void sound(){
		System.out.println("Quack");
	}

	public static void main(String[] args){
		new Duck();
	}
}
