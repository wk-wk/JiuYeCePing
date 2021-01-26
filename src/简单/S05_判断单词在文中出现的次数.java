package 简单;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
    请在你的电脑中创建一个文本文件，文件名为demo.txt，该文件内容为一段英文短文，具体内容自行定义。
    编写一个命令行程序，从命令行输入一个单词，之后程序需要判断该单词在文件demo.txt中出现的次数，并将结果在命令行输出：
    示例：
    短文内容：
    Hello, My name is johnny......
    命令行输入：johnny
    命令行输出：johnny在文件中出现了1次
 */
public class S05_判断单词在文中出现的次数 {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Test\\demo.txt"));
        char[] chs = new char[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = isr.read(chs)) != -1) {
            sb.append(chs);
        }
        isr.close();
        String text = sb.toString();
        String str = "son";
        String replaceText = text.replace(str, "");
        System.out.println(text.length());
        System.out.println(replaceText.length());
        System.out.println(str.length());
        int count = (text.length() - replaceText.length()) / str.length();
        System.out.println(count);
    }
}
