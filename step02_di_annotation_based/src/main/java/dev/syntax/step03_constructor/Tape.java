package dev.syntax.step03_constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

// 비디오 테이프 클래스
public class Tape {
    private String name;

    private boolean isWorked;

//    @Autowired
    public Tape(@Value("아일랜드") String name, @Value("true") boolean isWorked) {
        super();
        System.out.println("Tape(name, isWorked) 호출됨");
        this.name = name;
        this.isWorked = isWorked;
    }

    public String getName() {
        return name;
    }

    public boolean isWorked() {
        return isWorked;
    }

    @Override
    public String toString() {
        return "Tape{" +
                "name='" + name + '\'' +
                ", isWorked=" + isWorked +
                '}';
    }
}
