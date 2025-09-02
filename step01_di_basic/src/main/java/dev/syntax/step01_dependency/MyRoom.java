package dev.syntax.step01_dependency;


// Tape와 TapeReader 클래스를 작성 루 테스트
/*
    Tape - 비디오 테이프
    TapeReader - 테이프 리더기

    TapeReader에 Tape를 넣고 테스트하는 프로그램
 */
public class MyRoom {
    public static void main(String[] args) {
        TapeReader reader = new TapeReader();
        Tape Tape = new Tape("아일랜드", true);

        // TapeReader는 Tape 타입에 의존하고 있음(dependent)
        // -> TapeReader.test()를 호출할 때 Tape 타이빙이 필요하기 때문에

        // setter를 통해 Tape타입에 대한 의존성을 TapeReader에게 주입
        reader.setTape(Tape);
        reader.test();
    }
}
