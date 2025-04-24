package org.MachineCodingInterview;

import org.MachineCodingInterview.services.GameService;
import org.MachineCodingInterview.services.impl.GameServiceImpl;

public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameServiceImpl();
        gameService.initialize();
        gameService.startNewGame();
    }
}