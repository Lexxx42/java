package java_gb.seminar3;

import java.util.ArrayList;
import java.util.List;

public class Ex001 {
    static public void main(String[] args) {
        int numA = 2;
        int numB = 11;
        int operationC = 1;
        int operationD = 2;
        List<String> arr = GetPath(numA, numB, operationC, operationD, "");
        System.out.println(arr);
    }

    public static ArrayList<String> GetPath(int a, int b, int c, int d, String e) {
        ArrayList<String> arr = new ArrayList<>();
        if (a == b) {
            arr.add(e);
        }
        if (a < b) {
            arr.addAll(GetPath(a + c, b, c, d, e + "1"));
            arr.addAll(GetPath(a * d, b, c, d, e + "2"));
        }
        return arr;
    }
}

