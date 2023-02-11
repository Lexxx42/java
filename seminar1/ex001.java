package java_gb.seminar1;

public class ex001 {
    public static void main(String[] args) {
        class MyList {
            int[] data = new int[0];

            public void append(int item) {
                int size = data.length;
                int[] temp = new int[size + 1];
                for (int i = 0; i < size; i++) {
                    temp[i] = data[i];
                }
                temp[size] = item;
                data = temp;
            }

            public int count() {
                return data.length;
            }

            public int getItemBy(int index) {
                return data[index];
            }
        }
        class Node {
            int value;
            Node next;
        }
    }
}
