package com.game;
public class Mario extends GameObject{
	public void showMsg(){
		String name ="¸¶¸®¿À";
		System.out.println(name);
	}
	//±ÍÂú¾Æ¼­ µÒ..
	public static void main(String[] args){
		Mario mario = new Mario();
		mario.showMsg();
		
		System.out.println(mario.x);
		System.out.println(mario.y);
	}
}
