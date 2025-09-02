package dev.syntax.controller;

import dev.syntax.model.Horse;
import dev.syntax.model.RaceResult;
import dev.syntax.movelogic.MoveLogic;
import dev.syntax.view.DisplayThread;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class RaceController {
    private final List<Horse> horses = new ArrayList<>();
    private final RaceResult raceResult;
    private final int horseCount;

    public RaceController(MoveLogic logic) {
//        this.horseCount = horseCount;
        this.raceResult = new RaceResult();

//        MoveLogic logic = new RandomMoveLogic();

        Scanner scanner = new Scanner(System.in);

        System.out.println("🐎 경마 게임에 오신 걸 환영합니다!");
        System.out.print("경주에 참가할 말의 수를 입력하세요: ");
        this.horseCount = scanner.nextInt();

        for (int i = 1; i <= horseCount; i++) {
            horses.add(new Horse(i, logic, raceResult));
        }
    }

    public void startRace() throws InterruptedException {
        DisplayThread display = new DisplayThread(horses);
        display.start();

        for (Horse h : horses) h.start();

        while (true) {
            if (raceResult != null && horses.stream().allMatch(Horse::isFinished)) {
                break;
            }
            Thread.sleep(1000);
        }

        display.interrupt();
        display.join();

        System.out.println("\n🏁 최종 순위 발표!");
        raceResult.printRanking();
    }
}
