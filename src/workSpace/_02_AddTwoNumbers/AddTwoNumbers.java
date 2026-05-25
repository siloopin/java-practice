package workSpace._02_AddTwoNumbers;
import java.util.Scanner;

public class AddTwoNumbers {

    // 1. static 추가: main에서 부르기 위해
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 2. static 추가: main에서 객체 생성 없이 부르기 위해
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); //첫번째 칸을 잃지 않게 더미노드 생성
        ListNode curr = dummyHead; // curr는 현재 우리가 작업 중인 노드
        int carry = 0; // 넘겨줄 올림수

        // 노드가 한 칸이라도 남아있거나, 넘겨줄 올림수가 있다면 계속 반복
        while (l1 != null || l2 != null || carry != 0) {
            //노드 값 확인
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10; //올림 수 계산
            curr.next = new ListNode(sum % 10);

            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }

    // 입력을 받아서 노드로 연결해주는 메소드
    public static ListNode buildList(Scanner sc, int size) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            curr.next = new ListNode(val); // 새 칸을 만들어서 내 뒤에 연결
            curr = curr.next;              // 나는 방금 연결한 새 칸으로 이동
        }
        return dummy.next; // 더미 다음 칸부터 리턴
    }

    // 정답 노드를 화면에 출력해주는 메소드
    public static void printList(ListNode head) {
        System.out.print("[ ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next; // 다음 칸으로 이동하면서 출력
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("l1 노드 수 입력: ");
        int n1 = sc.nextInt();
        System.out.print("l1 숫자 " + n1 + "개 입력 (띄어쓰기): ");
        ListNode l1 = buildList(sc, n1);

        System.out.print("l2 노드 수 입력: ");
        int n2 = sc.nextInt();
        System.out.print("l2 숫자 " + n2 + "개 입력 (띄어쓰기): ");
        ListNode l2 = buildList(sc, n2);

        // 두 기차 더하기
        ListNode result = addTwoNumbers(l1, l2);

        // 결과 출력
        System.out.print("정답 노드: ");
        printList(result);

        sc.close();
    }
}