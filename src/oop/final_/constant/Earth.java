package oop.final_.constant;

public class Earth {

    //상수란 고정된 불변의 값.
    //상수는(static final은) 대문자로 표기하는 것이 관례임.
    static final double RADIUS = 6400.0; //지구반지름

    static final double SURFACE_AREA; //지구 표면적

    static {
        //정적 초기화자(static initializer)
        // -> static쪽의 생성자 느낌
        // 정적 변수 등을 자동으로 초기화해주는 static 블록임
        //정적 초기화자는 내가 호출하는 것이 아닌, 클래스가 로딩되면 자동 호출됨.
        //클래스 로딩? 클래스의 이름으로 static 멤버를 호출 또는 참조하거나 객체가 생성되면 로딩됨
        //정적 초기화자는 클래스 로딩 시 최초 1회만 호출됨.
        SURFACE_AREA = 4 * Math.pow(RADIUS, 2) * Math.PI;
    }
}
