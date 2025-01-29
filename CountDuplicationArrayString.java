// Problem: This program counts the duplicate occurrences
// of strings in an array and prints each string along with its frequency.
public class CountDuplicationArrayString {
    static String[] list = {"hitesh", "dinesh", "hargun", "hitesh", "hargun", "hitesh"};
    static int num = 0;

    public static void display() {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != null) {
                for (int x = i + 1; x < list.length; x++) {
                    if (list[i] == list[x]) {
                        num++;
                        list[x] = null;
                    }
                }
                if (num != 0) {
                    System.out.println(list[i] + " again " + num);
                    num = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        CountDuplicationArrayString.display();
    }
}