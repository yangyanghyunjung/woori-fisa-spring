package dev.syntax.step02_setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

// 비디오 테이프 클래스
public class Tape {
    private String name;

    private boolean isWorked;

    public Tape() {
        System.out.println("Tape() 호출됨");
    }

    @Autowired
    public void setName(@Value("아일랜드") String name) {
        System.out.println("setName() 호출됨");
        this.name = name;
    }

    @Autowired
    public void setWorked(@Value("true") boolean isWorked) {
        System.out.println("setWorked() 호출됨");
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
