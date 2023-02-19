package java_gb.seminar4;

public class FindWay {
    public static void main(String[] args) {

        int a = 2;
        int b = 6;
        int c = 1; // + 1
        int d = 2; //2

        System.out.println(findWay(a, b, c, d));
    }

    public static int findWay(int a, int b, int c, int d) {
        int[] way = new int[b + 1];
        way[a] = 1;
        for (int i = a + c; i <= b; i++) {
            way[i] = i % d == 0 ? way[i - c] + way[i / d] : way[i - c];
        }
        return way[b];
    }

}
