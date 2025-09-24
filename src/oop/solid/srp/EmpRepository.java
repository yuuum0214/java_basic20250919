package oop.solid.srp;

//직원의 정보를 저장하고 관리하는데만 집중하자!
public class EmpRepository {

    // 책임 2 : 직원의 정보를
    public void saveToDatabase(Employee emp) {
        //데이터베이스 연결 로직
        //SQL 쿼리 작성 로직
        //데이터 저장 실행 로직
        System.out.println(emp.getName() + "직원의 정보를 DB에 저장했습니다.");
    }

}
