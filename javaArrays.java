public class javaArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int length = numbers.length;
        char[] chars = new char[length];
        chars[numbers.length - 1] = 'y';
        System.out.println("Done!");
    }
}
