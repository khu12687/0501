/*�ڹٷ� ����� �����غ���.
�ڹٴ� �ڹٽ�ũ��Ʈ�� ���� ü�����̰� �Ը� ū �������α׷��̶�, ��Ӱ� ���õ� ������ ��� �� ��Ģ�� �����ִ�*/
package com.game;

//���Ӂ�ü�� �� �ֻ��� ��ü�� �����Ѵ�!!
public class GameObject{
	int x;
	protected int y; //��Ӱ��迡 �ִ� �ڽ��� ������ �� �ֵ��� ���!!
	//���� : �ڽ��� ���� �ٸ� ��Ű�� �����Ѵٸ�?? �� ��ġ�� �ܺο��ִٸ� protected���� ������ default���ɸ�
	
	public void tick(){
		System.out.println("GameObject�� tick() ȣ��");
	}
	public void render(){
		System.out.println("GameObject�� render() ȣ��");
	}
}
