public class Zadanie52 {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        for (int i=0;i<5;i++)
            numbers[i] = i+1;

        int sum = numbers[0] + numbers[2] + numbers[4];
        System.out.println(sum);

    }
}
