package chap_07;
class BankAccount {
    private int balance; // 외부에서 직접 수정 불가능

    // Setter: 마이너스 입금을 막는 필터링 가능
    public void setBalance(int balance) {
        if (balance >= 0)
            this.balance = balance;
    }

    // Getter
    public int getBalance() {
        return this.balance;
    }
}

public class _04_GetterAndSetter {
    public static void main(String[] args) {
        BankAccount a=new BankAccount();
        a.setBalance(10);
        // a.balance=10; private라 변경 불가

        System.out.println(a.getBalance());
    }
}
