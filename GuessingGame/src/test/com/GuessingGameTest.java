package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {
    @Test
    public void testWinSituation () {
        GuessingGame game = new GuessingGame();
        String result = game.quessEnteredNum(3);
        assertEquals("You got it", result);
    }
}
