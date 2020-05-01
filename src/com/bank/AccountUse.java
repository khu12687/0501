//다른 패키지에서는, 사용하고자하는 클래스의 맴버변수가 공개되지 않는한 접근할수 없다!!
//why? 우리가 평소에 변수 선언시 자료형 앞에 아무것도 붙이지 않는다고 하여 접근제한이 없는것이아니다
// 즉 개발자가 명시하지 않으면 Default 접근제한자가 자동으로 적용된다!!

/*
[자바의 접근제한자의 종류]
보안이 약한 순서
public(공개) < protected < default < private
1)public : 보안도 아니다. 그냥 모든 외부의 클래스들이 맘대로 접근함 즉 공개!!
2)protected : 상속관계에 있는 클래스들간에만 접근을 허용
3)defalt : 같은 패키지내에 있어야 접근이 가능
4)private : 나 이외는 아무도 못씀, 즉 아무도 접근못함!!
*/
package com.bank;
class AccountUse {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.money=-70000000;
		System.out.println(acc.money);
	}
}
