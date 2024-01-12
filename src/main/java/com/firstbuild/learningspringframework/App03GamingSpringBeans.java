package com.firstbuild.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.firstbuild.learningspringframework.game.GameRunner;
import com.firstbuild.learningspringframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var game = new MarioGame();
//		var game = new PacManGame(); //1 Object creation
//		var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
//		2 object creation + wearing of dependencies 
//		game is a dependency of GameRunner class 
		
/*	MarioGame marioGame = new MarioGame();
		GameRunner gameRunner = new GameRunner(marioGame);
		could be written in this way too, 
		but that var makes it more concise(var is used for making a variable) */
		
		
//		gameRunner.run();
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(GamingConfiguation.class)){
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
			
		}
	 
	}

}
