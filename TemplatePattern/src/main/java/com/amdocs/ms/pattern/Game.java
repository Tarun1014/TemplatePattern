package com.amdocs.ms.pattern;

public abstract class Game {  

	abstract void initialize();  
	abstract void start();  
	abstract void  end();  

	public final String play(){  

		initialize();  //initialize the game

		start();   //start game 

		end();  //end game
		
		return "success";
	}  
}
