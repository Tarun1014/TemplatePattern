package com.amdocs.ms.pattern;

public class TemplatePatternDemo {

	public static void main(String[] args) {  

		//Class c=Class.forName(args[0]);  

		Game game =	new Chess();//(Game) c.newInstance();  

		game.play();     
	}

}
