package com.firstbuild.learningspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.firstbuild.learningspringframework.game.GameRunner;
import com.firstbuild.learningspringframework.game.GamingConsole;
import com.firstbuild.learningspringframework.game.PacManGame;

@Configuration
public class GamingConfiguation {
	
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner =  new GameRunner(game);
		return gameRunner;
	}

}
