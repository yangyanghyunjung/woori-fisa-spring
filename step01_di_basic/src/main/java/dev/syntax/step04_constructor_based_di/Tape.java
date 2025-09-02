package dev.syntax.step04_constructor_based_di;

// 비디오 테이프 클래스
public class Tape {
    private String name; // 테이프 이름
    private boolean isWorked; // 테이프가 정상 동작하는지 여부

    public Tape(String name, boolean isWorked) {
        System.out.println("Tape() 생성자 호출");
        this.name = name;
        this.isWorked = isWorked;
    }


    public Tape() {
    }

    public String getName() {
        return name;
    }

    public boolean isWorked() {
        return isWorked;
    }

    public void setName(String name) {
        System.out.println("name = " + name);
        this.name = name;
    }

    public void setWorked(boolean worked) {
        System.out.println("worked = " + worked);
        isWorked = worked;
    }

    @Override
    public String toString() {
        return "Tape{" +
                "name='" + name + '\'' +
                ", isWorked=" + isWorked +
                '}';
    }

}
