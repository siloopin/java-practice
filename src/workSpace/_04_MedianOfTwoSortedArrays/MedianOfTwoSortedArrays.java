package workSpace._04_MedianOfTwoSortedArrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
// Olog((n+m))보다 시간 복잡도가 작아야함 -> 이진 탐색
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 1. 항상 길이가 더 짧은 배열을 nums1로 만듭니다.
        // (이유: 짧은 쪽에서 이진 탐색을 해야 IndexOutOfBounds 에러가 안 나고 빠릅니다.)
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1); //일케 리턴으로 다시 배열 순서 바꾸는게 가능..ㄷㄷ
        }

        int x = nums1.length;
        int y = nums2.length;

        int low = 0;
        int high = x;

        // 2. 이진 탐색 시작
        while (low <= high) {
            // nums1의 칼질 위치 (가운데)
            int partitionX = (low + high) / 2;

            // nums2의 칼질 위치 (전체 절반 개수 - nums1에서 자른 개수)
            int partitionY = (x + y + 1) / 2 - partitionX;

            // 3. 경계선 주변의 4개 숫자 구하기
            // (칼질이 맨 끝에 도달했을 때를 대비해 가상의 -무한대, +무한대 값을 넣어줍니다)
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            // 4. 완벽한 칼질을 찾았는지 검사!
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // 전체 길이가 짝수일 때
                if ((x + y) % 2 == 0) {
                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                }
                // 전체 길이가 홀수일 때
                else {
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            }
            // 5. 완벽하지 않다면 칼질 위치를 이동시킵니다.
            else if (maxLeftX > minRightY) {
                // X의 왼쪽이 너무 크다 -> X의 칼질을 왼쪽으로 옮겨라!
                high = partitionX - 1;
            } else {
                // Y의 왼쪽이 너무 크다 -> X의 칼질을 오른쪽으로 옮겨라!
                low = partitionX + 1;
            }
        }

        // 문제 조건상 무조건 답이 있으므로 여기까지 올 일은 없습니다.
        throw new IllegalArgumentException("배열이 정렬되어 있지 않습니다.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a= new int[n];
        int [] b= new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(a,b));
    }
}
