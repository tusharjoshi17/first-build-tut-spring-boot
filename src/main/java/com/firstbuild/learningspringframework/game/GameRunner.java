package com.firstbuild.learningspringframework.game;

public class GameRunner {
	
	MarioGame game;

	public GameRunner(MarioGame game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game"+game);
	}
}
