package 简单;

import java.util.Scanner;

/*
    编写一个命令行程序，从命令行输入一个字符串，程序需要判断输入的字符串是否是一个回文数，如果是，
    则在命令行输出："该字符串是一个回文数"；如果不是，则在命令行输出：“该字符串不是一个回文数”。
    说明；
    回文数是指，一个字符串从前向后读和从后向前读，其内容都是一样的。
    示例：
    字符串"12321"，这就是一个回文数。
    字符串"ABCBA"，这也是一个回文数。
    字符串"ABCBC"，这就不是一个回文数。
 */
public class S07_回文数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) == str.charAt(j)) {
                continue;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("该字符串是一个回文数");
        } else {
            System.out.println("该字符串不是一个回文数");
        }
    }
}
