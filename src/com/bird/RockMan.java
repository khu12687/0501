package com.game;
/*
아래의 클래스는 부모가 이미 있다!!
개발자가 명시하지 않더라도 이미 내부적으로 최상위 객체를 상속받는다
지렁이 -> ...->객체
최상위 객체인 Object 클래스의 위치는 java.lang 패키지에 위치하고있으며
java.lang 패키지는 개발자가 import할 필요없다
why? lang 프로그래밍 시 필수적인 클래스들이 위치하는 곳이기 때문에 기본 import가 되어있다
그래서 String도 따로 import 할 필요가없었다!!
*/
public class RockMan{
	public void test(){
		//현재의 록맨이 보유하지 않는 메서드를 사용해보았을때
		//에러가 안난다면, 오브젝트 클래스에서 상속받은 것임
	}
	public static void main(String[] args){
		RockMan r = new Rockman();
		r.test();
		r.aa(); //에러
		//toString()은 현재 클래스에서 보유한 적이 없음에도
		//왜 에러가 안날까?? 답 - 자바의 모든클래스를 개발자가 명시하지않아도
		//이미 최상위 객체인 Object 클래스를 자동으로 상속받게 되어 있다..
		//따라서 아래의 toStirng()은 부모인 Object 클래스의 메서드 중 하나였다!!
		//개발자가 정의한 클래스가 아닌, sun에서 제공하는 기본 API를 참고하려면 어떻게하나???
		//설명서는 언제나 벤더사가 제공한다!!

		//toString() 메서드는, 객체를 문자열로 표현해주는 메서드!!
		
		System.out.println(r.toString());
	}
}

