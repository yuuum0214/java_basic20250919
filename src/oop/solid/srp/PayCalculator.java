package oop.solid.srp;

public class PayCalculator {

    // 책임 1 : 직원 월급 계산
    public long claculatePay(Employee e){
        //복잡한 급여 계산 로직이 여기 존재함
        // 세금 계산, 보너스 계산, 연차-반차 체크
        return e.getBaseSalary();
    }

}
