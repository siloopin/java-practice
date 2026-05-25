package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {

        // 다차원 배열
        String[][] A = new String[10][10]; // 이렇게 다차원 배열 선언
        int[][] B = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};

        String[][] seats = new String[10][15];
        String[] eng = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"};
        for (int i=0;i<seats.length;i++){
            for (int j=0;j<seats[i].length;j++){
                seats[i][j]=eng[i]+(j+1); //자바의 문자열 결합법
            }
        }

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }
    }
}
