package com.use;
//Ŭ�����н��� ��ϵ� ���� ���丮���� ���!!
//�츮�� ��� bin������ Ŭ�����н��� ��ϵǾ��� ������ �������� ����� com.bank�� ����Ѵ�!!
import com.bank.Account; //��Ű���� �ٸ��� ������
class UseAccount{
	public static void main(String[] args) {

		Account account = new Account();
		account.money=-10000;
		System.out.println("��Ʈ���� �ܰ��"+account.money);
	}
}
