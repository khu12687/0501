package com.use;
//클래스패스에 등록된 이하 디렉토리부터 명시!!
//우리의 경우 bin까지가 클래스패스로 등록되었기 때문에 그이하의 경로인 com.bank를 명시한다!!
import com.bank.Account; //패키지가 다른데 쓸려고
class UseAccount{
	public static void main(String[] args) {

		Account account = new Account();
		account.money=-10000;
		System.out.println("배트맨의 잔고는"+account.money);
	}
}
