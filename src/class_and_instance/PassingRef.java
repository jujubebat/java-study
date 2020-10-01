package class_and_instance;

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ref = new BankAccount();
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref); // '참조 값(인스턴스의 주소)'의 전달
    }

    public static void check(BankAccount acc){
        acc.checkMyBalance();
    }
}
