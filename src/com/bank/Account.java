/*
은행의 고객 계좌를 정의한다!!
*/
package com.bank;

public class Account{
	//아래의 맴버변수에 개발자가 접근제한자를 명시하지 않았으므로 Default 접근제한자 적용되어있다!!
	//default : 무조건 같은 패키지내에 있는 클래스만 접근이 가능!!
	String num = "987-2312456-27"; //계좌번호
	//이변수는 나의 인스턴스가 아니면, 한마디로 나 아니면 아무도 못씀
	//즉 나만 접근가능
	//아래의 변수를 private으로 설정해 놓으면 아무도 못쓰기 때문에
	//변수의 값을 외부에서 변경이 필요한 경우에도 접근이 불가능하다.
	//업무가 불가능.. 따라서 객체지향 언어에서는 데이터를 보호하고 
	//이 데이터를 제어할 수 있는 방법(method)을 메서드를 통해 제공하는데,
	//이러한 객체지향의 클래스 정의 기법을 가리켜 캡슐화(=은닉화)라고 한다!!
	//ex) 리모컨, TV, 등등 내용물이 보호된 모든 물건!!
	private int money = 20000; //잔고
	private String name ="배트맨";

	//사용 가능 메서드제공하자
	//사용이란 두가지로 분류 : 
	//값을 넣는것 : setter 메서드
	//값을 가져오는것 : getter 메서드

	//getter : 반환값이 있는 메서드, 즉 외부에서 값을 가져갈수 있도록 허용하는 메서드
	//getter/setter는 낙타기법으로 명시 단어와 단어가 만나면 뒷단어의 첫 절차를 대문자로하는 명명규칙!!
	//개발시 대부분은 변수는 보호하고, 이 변수에 대한 사용은 메서드로 제공되어야 한다..

	//getter
	public int getMoney(){
		return money;
	}
	//setter
	public void setMoney(int money){
		this.money=money;
	}

	public String getName(){
		return name;
	}

	public void getName(String name){
		this.name = name;
	}
}
