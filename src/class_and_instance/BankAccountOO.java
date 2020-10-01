package class_and_instance;

class BankAccount { // 클래스는 붕어빵의 틀이라고 생각하자.
    int balance = 0;

    public int deposit(int amount){ // 입금을 담당하는 메소드 - 인스턴스 메서드
        balance += amount;
        return balance;
    }

    public int withdraw(int amount){ // 출금을 담당하는 메소드
        balance -= amount;
        return balance;
    }

    public int checkMyBalance(){ // 예금 조회를 담당하는 메소드
        System.out.println("잔액 : " + balance);
        return balance;
    }
}

class BankAccountOO {
    public static void main(String[] args) {
        // 두 개의 인스턴스(객체) 생성
        BankAccount yoon = new BankAccount(); // 인스턴스는 클래스(붕어빵 틀)로 찍어낸 붕어빵이라고 생각하자.
        BankAccount park = new BankAccount(); // 클래스 BankAccount의 인스턴스화다. new를 인스턴스가 생성되고 인스턴스의 주소(참조 값)가 반환된다.

        // 위와 같이 클래스로 2개의 인스턴스를 생성했다.
        // 두 개의 인스턴스는 메모리에 있다.
        // 우리는 참조 변수를 통해 메모리에 있는 인스턴스에 접근할 수 있다.
        // 위에서 참조 변수는 yoon과 park다.


        // 각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);

        // 각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);

        // 각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();

    }
}
