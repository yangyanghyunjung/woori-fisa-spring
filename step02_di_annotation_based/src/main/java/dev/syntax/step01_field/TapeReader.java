package dev.syntax.step01_field;

import org.springframework.beans.factory.annotation.Autowired;

public class TapeReader {

    private Tape tape;

    @Autowired
    public void setTape(Tape tape) {
        System.out.println("setTape() 호출됨" + tape);
        this.tape = tape;
    }

    public TapeReader() {
        System.out.println("TapeReader() 기본 생성자 호출됨" );
    }

    public void test() {
        if (tape.isWorked()) {
            System.out.println("tape.getName() = " + tape.getName() + " 정상 동작!");
        } else {
            System.out.println("tape.getName() = " + tape.getName() + " 사기 당함");
        }
    }

}
