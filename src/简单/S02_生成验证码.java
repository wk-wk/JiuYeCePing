package 简单;

import java.util.Random;
import java.util.Scanner;

/*
    编写一个命令行程序，只要从命令行输入的内容是GET，则取得6位的随机数作为验证码，并在命令行输入。
    示例：
    命令行输入：GET
    命令行输出：XXXXXX（自动生成的随机数）
 */
public class S02_生成验证码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if ("GET".equals(str)) {
            StringBuilder sb = new StringBuilder();
            Random r = new Random();
            for (int i = 0; i < 6; i++) {
                int n = (int) (Math.random() * 10);
                sb.append(n);
            }
            System.out.println(sb.toString());
        }
    }
}
