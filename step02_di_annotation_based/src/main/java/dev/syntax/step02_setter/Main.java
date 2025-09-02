package dev.syntax.step02_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * XML파일은 사용하지만, Annotation 문법이 적용되면서 보다 간소화된 설정 방식
 * step01에서는 의존성 주입 방식으로 field 기반으로 주입
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("annotation-config-setter.xml");

        // 스프링 컨테이너에서 TapeReader 의존성을 찾아서 초기화
        TapeReader reader = context.getBean(TapeReader.class);


        reader.test();

    }

}
