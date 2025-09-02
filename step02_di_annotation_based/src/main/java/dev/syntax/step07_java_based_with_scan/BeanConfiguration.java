package dev.syntax.step07_java_based_with_scan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Bean 설정정보를 담고 있는 java파일
// -> Bean에 대한 설정정보를 해당 틀래스 내에 정의
@Configuration
@ComponentScan(basePackages = "dev.syntax.step07_java_based_with_scan")
// -> 설정 파일의 클래스 레벨에 컴포넌트 스캔 대상이 될 기본 패키지 경로 명시
public class BeanConfiguration { // xml차일과 비교하면 <beans></beans> 부분
    // <bea>과 같이 개별 Bean들을 작성하는 부분

    @Bean // xml 파일과 비유하면 <bean>과 동일
    public TapeReader tapeReader(Tape tape) {
        // 빈을 생성하기 전에 별도의 로직을 필요하기 때문에 @Component를 사용하지 않고, @Bean을 통해 생성해야 하는 상황

        // 빈 생성 전 별도의 로직..
        return new TapeReader(tape);
    }

    // Tape클래슨는 빈 생성 전 별도의 로직이 따로 없기 때문에
    // 일반적인 컴포넌트 스캔으로 생성되도록 적용하고 싶을ㅇ 경우?
//    @Bean
//    public Tape tape() {
//        return new Tape("아일랜드", true);
//    }
}
