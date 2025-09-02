package dev.syntax.step06_java_based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Bean 설정정보를 담고 있는 java파일
// -> Bean에 대한 설정정보를 해당 틀래스 내에 정의
@Configuration // 이 파일은 설정 파일임을 명시
public class BeanConfiguration { // xml차일과 비교하면 <beans></beans> 부분
    // <bea>과 같이 개별 Bean들을 작성하는 부분

    @Bean // xml 파일과 비유하면 <bean>과 동일
    public TapeReader tapeReader(Tape tape) {
        // 빈을 생성하기 전에 별도의 로직을 작성할 수 있음
        return new TapeReader(tape);
    }

    @Bean
    public Tape tape() {
        return new Tape("아일랜드", true);
    }
}
