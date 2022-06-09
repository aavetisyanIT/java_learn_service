package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testWinSituation () {
        String result = game.guessEnteredNum(3);
        assertEquals("You got it", result);
    }

    @Test
    public void testRandomNumberGeneration () {
        int[] rndNumMap = new int[10];
        for(int i = 1; i <= 100; i++) {
            int randomNum = game.generateRandomNum();
            rndNumMap[randomNum-1] = 1;
        }
        int sum = IntStream.of(rndNumMap).sum();
        assertEquals(10, sum);
    }
}
