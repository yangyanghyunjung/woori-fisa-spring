package dev.syntax.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RaceResult {
    private final List<String> rankings = new ArrayList<>();

    public synchronized void recordFinish(String horseName) {
        rankings.add(horseName);
    }

    public void printRanking() {
        for (int i = 0; i < rankings.size(); i++) {
            System.out.printf("%2d등: %s\n", i + 1, rankings.get(i));
        }
    }
}
