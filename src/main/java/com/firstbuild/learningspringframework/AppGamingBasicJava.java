package com.firstbuild.learningspringframework;

import com.firstbuild.learningspringframework.game.GameRunner;
import com.firstbuild.learningspringframework.game.MarioGame;
import com.firstbuild.learningspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
//		MarioGame marioGame = new MarioGame();
//		GameRunner gameRunner = new GameRunner(marioGame);
//		could be written in this way too, but that var makes it more concise(var is used for making a variable)
		
		
		gameRunner.run();
		
	}

}
