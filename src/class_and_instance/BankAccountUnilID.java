package class_and_instance;

class BankAccount2{
    String accNumber;
    String ssNumber;
    int balance = 0;

    // 초기화를 위한 메서드
    public void initAccount(String acc, String ss, int bal){ // 인스턴스의 초기화를 위한 메서드다.
        accNumber = acc;
        ssNumber = ss;
        balance = bal; // 계좌 개설시 예금액으로 초기화
    }


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

public class BankAccountUnilID {
    public static void main(String[] args) {
        BankAccount2 yoon = new BankAccount2(); // 계좌 생성
        yoon.initAccount("12-34-89", "990990-9090990", 10000); // 초기화

        BankAccount2 park = new BankAccount2(); // 계좌 생성
        park.initAccount("33-55-09", "770088-5959007",10000); // 초기화

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
