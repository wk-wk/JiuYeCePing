package 入门;

/*
    编写一个命令行程序，将0到30之间的奇数倒序排列，然后再将倒序后的前12个奇数依次存储到一个数组中，之后按照以下各种输出到命令行：
    30以内从大到小的前12个奇数为：
    29
    27
    25
    23
    21
    19
    17
    15
    13
    11
    9
    7
 */
public class S03_30以内的奇数 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        int j = 0;
        for (int i = 30; i >= 0; i--) {
            if (i % 2 == 1 && j < 12) {
                arr[j] = i;
                j++;
            }
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(arr[i]);
        }
    }
}
