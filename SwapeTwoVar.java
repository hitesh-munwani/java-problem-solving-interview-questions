public class SwapeTwoVar {
    static int a = 5;
    static int b = 10;

    public static void swipeVar() {
        System.out.println("Original values: \na = " + a + "\nb = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap variable: \na = " + a + "\nb = " + b);
    }

    public static void main(String[] args) {
        SwapeTwoVar.swipeVar();
    }
}
