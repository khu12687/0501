/*자바로 상속을 구현해본다.
자바는 자바스크립트에 비해 체계적이고 규모가 큰 응응프로그램이라서, 상속과 관련된 복잡한 기능 및 규칙을 갖고있다*/
package com.game;

//게임겍체들 중 최상위 객체를 정의한다!!
public class GameObject{
	int x;
	protected int y; //상속관계에 있는 자식이 접근할 수 있도록 허용!!
	//주의 : 자식이 만일 다른 패키가 존재한다면?? 즉 위치가 외부에있다면 protected보다 강력한 default에걸림
	
	public void tick(){
		System.out.println("GameObject의 tick() 호출");
	}
	public void render(){
		System.out.println("GameObject의 render() 호출");
	}
}
