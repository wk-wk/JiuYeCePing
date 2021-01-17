package 入门;

import java.util.Scanner;

/*
    编写一个命令行程序，从命令行输入一个整数，之后按照以下公式计算合计，并在命令行输出：
    y=x + xx + xxx + xxxx + xxxxx + xxxx + xxx + xx + x
    示例：
    命令行输入：2
    命令行输入：2+22+222+2222+22222+2222+222+22+2=27158
 */
public class S01_有规律的数字计算 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        int num = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            num = (int) (num + n * Math.pow(10, i));
            arr[i] = num;
            if (i < 4) {
                sum += num * 2;
            } else {
                sum += num;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i < 4) {
                System.out.print(arr[i] + "+");
            } else if (i < 8) {
                System.out.print(arr[8 - i] + "+");
            } else {
                System.out.print(arr[8 - i] + "=" + sum);
            }
        }
    }
}
