package com.game;
public class Mario extends GameObject{
	public void showMsg(){
		String name ="������";
		System.out.println(name);
	}
	//�����Ƽ� ��..
	public static void main(String[] args){
		Mario mario = new Mario();
		mario.showMsg();
		
		System.out.println(mario.x);
		System.out.println(mario.y);
	}
}
