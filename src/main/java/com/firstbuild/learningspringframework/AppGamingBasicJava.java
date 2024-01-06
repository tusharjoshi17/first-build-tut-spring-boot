package com.firstbuild.learningspringframework;

import com.firstbuild.learningspringframework.game.GameRunner;
import com.firstbuild.learningspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		
		gameRunner.run();
		
	}

}
