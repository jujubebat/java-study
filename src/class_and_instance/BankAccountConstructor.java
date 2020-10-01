package class_and_instance;


class BankAccount3{
    String accNumber;
    String ssNumber;
    int balance = 0;

   public BankAccount3(String acc, String ss, int bal){ // 생성자.
       accNumber = acc;
       ssNumber = ss;
       balance = bal;
   }

    // 생성자는 인스턴스 생성 마지막 단계에서 호출된다.
    // 인스턴스 생성의 마지막 단계는 생성자 호출이다.
    // 어떠한 이유로든 생성자 호출이 생략된 인스턴스는 인스턴스가 아니다.
    // 만약 생성자를 정의하지 않았을 경우  자바 컴파일러는 '디폴드 생성자'라는 것을 클래스에 넣어준다.

    // 디폴트 생성자 예시
    /*
    *
    * public BankAccount3(){
    *
    * }
    *
    * */

    public int deposit(int amount){
        balance += amount;
        return balance;
    }

    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    public int checkMyBalance(){
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호 : " + ssNumber);
        System.out.println("잔 액 : " + balance + '\n');
        return balance;
    }
}

public class BankAccountConstructor {
    public static void main(String[] args) {
        BankAccount3 yoon = new BankAccount3("12-34-89", "990990-9090990", 10000); // 계좌 생성
        BankAccount3 park = new BankAccount3("33-55-09", "770088-5959007",10000); // 계좌 생성

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
