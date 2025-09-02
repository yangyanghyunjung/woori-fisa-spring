package dev.syntax.step02_factory;


/*
    Main도 클래스임
    Main이 동작하려면 TapeReader가 필요함(의존하고 있음)

    과제.
    1. Main이 TapeReader에 대한 의존도를 낮추려면?(Hint. 패키지명)
    -> 프로그램 코드 맥락에서 의존도란 무엇을 가리키는 것인가?

    현재 상황은 Main에서 TapeReader를 개발자가 직접 생성해서 사용하고 있음
    -> "new TapeReader()"
    따라서, Main에서 "new TapeReader()" 코드가 없어도 프로그램이 동일하게 동작하도록 변경
 */
public class Main {
    public static void main(String[] args) {
        // Before : 개발자가 직접 의존성을 생성해서 주입
        // 의존관계 : Main -> TapeReader

        // After : Factory 클래스를 통해 외부에서 의존성을 찾아서 해결(Dependcy Lookup)
        // 외부 : 현재 클래스(Main)를 제외한 모든 곳
        TapeReader reader = TapeReaderFactory.createTapeReader();
        // TapeReaderFactory는 Spring의 코드로 변경됨
        // ex. ApplicationContext.getBean(TapeReader.class);

        Tape Tape = new Tape("아일랜드", true);

        // TapeReader는 Tape 타입에 의존하고 있음(dependent)
        // -> TapeReader.test()를 호출할 때 Tape 타이빙이 필요하기 때문에

        // setter를 통해 Tape타입에 대한 의존성을 TapeReader에게 주입
        reader.setTape(Tape);
        reader.test();
        // 의존관계 : TapeReader -> Tape
    }
}
