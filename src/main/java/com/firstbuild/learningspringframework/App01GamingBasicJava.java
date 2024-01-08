package com.firstbuild.learningspringframework;

import com.firstbuild.learningspringframework.game.GameRunner;
import com.firstbuild.learningspringframework.game.MarioGame;
import com.firstbuild.learningspringframework.game.PacManGame;
import com.firstbuild.learningspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var game = new MarioGame();
		var game = new PacManGame(); //1 Object creation
//		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
//		2 object creation + wearing of dependencies 
//		game is a dependency of GameRunner class 
		
/*	MarioGame marioGame = new MarioGame();
		GameRunner gameRunner = new GameRunner(marioGame);
		could be written in this way too, 
		but that var makes it more concise(var is used for making a variable) */
		
		
		gameRunner.run();
		
	}

}
