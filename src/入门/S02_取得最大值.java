package 入门;

/*
    编写一个命令行程序，定义一个类Demo，类中定义4个重载方法，用于取得从参数传入的多个值中的最大值并返回，详细如下：
    方法1: 传入两个整型值，将最大的值返回；
    方法2: 传入三个整型值，将最大的值返回；
    方法3: 传入两个双精度值，将最大的值返回；
    方法4: 传入三个双精度值，将最大值返回。
    在main函数中，调用Demo类中的合适方法，依次进行以下逻辑操作：
    （1）取得6和12的最大值，并在命令行输出：
    6, 12的最大值为：XXX
    （2）调用适合的重载方法，取得6, 12, 10三者的最大值，并在命令行输出：
    6, 12, 10的最大值为：XXX
    （3）调用适合的重载方法，取得19.35, 28.99, 65.99三者的最大值，并在命令行输出：
    19.35, 28.99, 65.99的最大值为：XXX
    （4）调用适合的重载方法，取得9.58, 18.65三者的最大值，并在命令行输出：
    9.58, 18.65的最大值为：XXX
 */
public class S02_取得最大值 {
    public static void main(String[] args) {
        System.out.println("6, 12的最大值为：" + Demo.findMax(6, 12));
        System.out.println("6, 12, 10的最大值为：" + Demo.findMax(6, 12,10));
        System.out.println("19.35, 28.99, 65.99的最大值为：" + Demo.findMax(19.35, 28.99, 65.99));
        System.out.println("9.58, 18.65的最大值为：" + Demo.findMax(9.58, 18.65));
    }
}

class Demo {
    public static int findMax(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }

    public static int findMax(int a, int b, int c) {
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }

    public static double findMax(double a, double b) {
        double max = a > b ? a : b;
        return max;
    }

    public static double findMax(double a, double b, double c) {
        double temp = a > b ? a : b;
        double max = temp > c ? temp : c;
        return max;
    }
}
