package com.bird;
/*
��Ӱ��迡�� �����ڿ� ���� �ɵ��ְ�....
*/
public class Duck extends Bird{
	String name = "�� ����";
	public Duck(){

		//��Ӱ��迡���� �ڽ��� �ʱ�ȭ���� �� �ռ��� �θ� ���� �����ϰ�
		//�ʱ�ȭ �Ǿ�� �ϹǷ�, �����ڰ� �������� �ʴ��� ����Ʈ ������ �ȿ��� super()�θ� ������ ȣ���� �����Ǿ��ִ�
		//name ="������" �������� why? ��Ӱ��迡�� �ڽ��� �����ڿ��� �θ��� ������ ȣ�⺸�� �ռ��� �ڵ�� �����Ҽ�����
		//�� super() ���� �ڵ� �ۼ��Ұ�!! �θ��� �ʱ�ȭ�� ������ �ڽĺ��� �ռ��� �ϹǷ�...
		super(5);
		name="������";
	}
	public void sound(){
		System.out.println("Quack");
	}

	public static void main(String[] args){
		new Duck();
	}
}
