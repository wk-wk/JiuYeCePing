package 入门;

import java.util.ArrayList;
import java.util.Scanner;

/*
    编写一个命令行程序，从命令行输入一个字符串，程序做如下处理：
    1. 判断从命令行输入的字符串中是否包含括号，如果不包含，则在命令行输出"您输入的内容没有括号"；
    2. 如果包含括号，则判断括号"()"是否配对，如果配对，则在命令行输出"您输入的内容，括号完全配对"；如果不配对，则在命令行输出“您输入的内容，括号不配对”。
    注意：必须是英文括号！！！
    例如：
    1. 字符串"a(aadd(dss22244)"，则在控制台输出“您输入的内容，括号不配对”
    2. 字符串"a(aadd(dss222)44)"，则在控制台输出“您输入的内容，括号完全配对”
 */
public class S12_判断一个字符串中的括号是否配对 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList list = new ArrayList();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                flag = true;
                list.add("(");
            }
            if (ch == ')') {
                for (int j = 0; j < list.size(); j++) {
                    if ("(".equals(list.get(j))) {
                        list.remove(j);
                    }
                }
            }
        }
        if (flag) {
            if (list.size() == 0) {
                System.out.println("您输入的内容，括号完全配对");
            } else {
                System.out.println("您输入的内容，括号不配对");
            }
        } else {
            System.out.println("您输入的内容没有括号");
        }
    }
}

