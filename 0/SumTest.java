import java.util.Scanner;    // Scannerを使うためのインポート宣言

class SumTest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int n1 = in.nextInt();
        System.out.print("Input number: ");
        int n2 = in.nextInt();
        System.out.print("Input number: ");
        int n3 = in.nextInt();
        int sum = n1+n2+n3;
        System.out.println("sum: " + sum);
        System.out.println("average: " + String.format("%.1f",(double)sum/3) );
        in.close();
    }
}