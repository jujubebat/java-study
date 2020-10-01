package class_and_instance;

public class DupRef {
    public static void main(String[] args) {
        BankAccount ref1 = new BankAccount();
        BankAccount ref2 = ref1; // ref1이 가리키는 인스턴스와 ref2가 가리키는 인스턴스가 같아진다.

        // 참조 변수에 null을 대입해서 참조를 끊을 수도 있다.

        ref1.deposit(3000);
        ref2.deposit(2000);
        ref1.withdraw(400);
        ref2.withdraw(300);
        ref1.checkMyBalance();
        ref2.checkMyBalance();
    }
}
