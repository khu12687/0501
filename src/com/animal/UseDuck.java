package com.animal;
class UseDuck {
	public static void main(String[] args) {
		/*Duck 클래스에 Duck()메서드를 명시한 적이 없음에도 호출시 에러가 발생하지 않는 이유가?
			답) 개발자가 정의하지 않으면 컴파일에 의해 기본생성자 즉 디폴트 생성자가 자동으로 명시된다!!
				따라서 생성자가 존재하는 것이다*/
		Duck d = new Duck();
		d.fly();
		d.walk();
	}
}
