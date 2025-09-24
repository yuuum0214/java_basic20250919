package oop.solid.srp;

// 오직 직원의 정보를 담는 책임만 지자.
// 계산이나 정잦은 다른 역할을 맡은 애들한테 맡기자.
// DTO (Data Transfer Object) 또는 도메인 객체 라고 부름
public class Employee {

    private String name;
    private long baseSalary;

    public Employee(String name, long baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }
}
