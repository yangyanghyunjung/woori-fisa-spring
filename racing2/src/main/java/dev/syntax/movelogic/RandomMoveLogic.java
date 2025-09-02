package dev.syntax.movelogic;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomMoveLogic implements MoveLogic {
    private final Random random = new Random();

    @Override
    public int move() {
        return random.nextInt(2);  // 0 또는 1
    }
}
