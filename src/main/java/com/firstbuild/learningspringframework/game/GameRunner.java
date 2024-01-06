package com.firstbuild.learningspringframework.game;

public class GameRunner {
	
//	MarioGame game;
	private SuperContraGame game;

	public GameRunner(SuperContraGame game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: "+ game);
		
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
