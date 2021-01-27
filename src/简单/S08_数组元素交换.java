package 简单;

/*
    编写一个命令行程序，完成以下功能：
    1. 定义一个方法swap，方法有一个参数（整型数组），该方法可将传入的整型数组中一个最大元素的与第一个元素交换，
    最小元素的与最后一个元素交换，之后将元素交换后的数组内容输出到命令行
    2. 在main函数中，定义一个数组[3,1,9,8,0,4,6,7]，之后调用swap
    示例：
    原数组：[3,1,9,8,0,4,6,7]
    元素调换后：[9,7,3,8,0,4,6,1]
    输出到命令行：9,7,3,8,0,4,6,1
 */
public class S08_数组元素交换 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 8, 0, 4, 6, 7};
        arr = swap(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] swap(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        int temp;
        temp = arr[0];
        arr[0] = max;
        arr[maxIndex] = temp;
        temp = arr[arr.length - 1];
        arr[arr.length - 1] = min;
        arr[minIndex] = temp;
        return arr;
    }
}
