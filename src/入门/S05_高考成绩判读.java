package 入门;

/*
    请编写一个命令行程序，完成以下功能：
    假设某年的高考一本录取分数线为451分，而你的高考成绩为369分，请将一本分数线和你的高考成绩赋值给合适的数值类型，
    再使用三元运算符将你的高考成绩与一本分数进行比对，如果大于等于一本分数线则提示“通过一本录取分数线”，
    如果小于一本分数线则提示“未通过一本录取分数线”，并将结果按照以下格式在命令行输出：
    您的高考总分: XXX
    第一批本科录取分数线: XXX
    高考结果：XXXXXX
 */
public class S05_高考成绩判读 {
    public static void main(String[] args) {
        int scoreLimit = 451;
        int score = 369;
        String result = score >= scoreLimit ? "通过一本录取分数线" : "未通过一本录取分数线";
        System.out.println("您的高考总分: " + score);
        System.out.println("第一批本科录取分数线:" + scoreLimit);
        System.out.println("高考结果：" + result);
    }
}
