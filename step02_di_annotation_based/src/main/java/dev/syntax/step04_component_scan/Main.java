package dev.syntax.step04_component_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 여전히 XML 파일은 가용하지만, Annotation 문법을 보다 추상화하여,
 * 개발자가 xml파일에 <bean></</bean>을 직접 명시하지 않고,
 *
 * 각 클래스 파일에 명시하여 스프링 컨테이너의 빈을 구성하는 방식
 * -> Component scan
 * 스프일이 프로젝트 내 특정 패키지 경로에 존재하는
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("component-scan-config.xml");

        // 스프링 컨테이너에서 TapeReader 의존성을 찾아서 초기화
        TapeReader reader = context.getBean(TapeReader.class);


        reader.test();
        // 의존관계: TapeReader -> Tape


    }

}
