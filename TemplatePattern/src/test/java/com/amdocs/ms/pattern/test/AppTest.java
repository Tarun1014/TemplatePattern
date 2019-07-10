package com.amdocs.ms.pattern.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.amdocs.ms.pattern.Chess;
import com.amdocs.ms.pattern.Game;

public class AppTest {

	@Test
	public void endTest() {
	
		Game game = new Chess();
		String result = game.play();
		assertEquals(result,"success");
	}
}
