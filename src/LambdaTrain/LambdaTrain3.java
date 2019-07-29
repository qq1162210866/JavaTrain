package LambdaTrain;


/**
 * LambdaTrain3.java
 * Description: 练习lambda表达式的方法引用的实例方法引用
 *
 * @author Peng Shiquan
 * @date 2019-07-27
 */
public class LambdaTrain3 {
    /**
     * 如果函数式接口的实现恰好可以通过调用一个实例的实例方法来实现，那么就可以使用实例方法引用
     * 语法： new instMethod()::method
     * 注意：后面不需要加括号也不需要加参数
     */

    String put() {
        return "hello";
    }

    public String toUpCase(String s) {
        //转换为大写
        return s.toUpperCase();
    }

    /**
     * Description: 主方法
     *
     * @param args
     * @return void
     * @Author: Peng Shiquan
     * @Date: 2019-07-27
     */
    public static void main(String[] args) {
        System.err.println("a"+100%3+100);
    }
}
