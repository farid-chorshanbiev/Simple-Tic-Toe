import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while(num >= 1)
        {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;

        }
        System.out.print(sum);
    }
}