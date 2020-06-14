package paradigmtrain;

import java.time.LocalDate;

/**
 * ParadigmTrain1.java
 * Description:  范型练习类
 *
 * @author Peng Shiquan
 * @date 2020/5/15
 */
public class ParadigmTrain1 {
    public static void main(String[] args) {
        LocalDate[] dates = {LocalDate.of(1996, 12, 9), LocalDate.of(1997, 5, 15), LocalDate.of(1998, 5, 15)};
        Pair<LocalDate> result = minmax(dates);
        System.err.println(result.getFirst());
        System.err.println(result.getSecond());
    }

    /**
     * Description: 输入的参数必须要实现Comparable。
     *
     * @param a
     * @return paradigmtrain.Pair<T>
     * @Author: Peng Shiquan
     * @Date: 2020/5/15
     */
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        /**
         * 第一个范型是对参数进行限制，第二哥是返回的类型
         */
        if ((a == null) || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        int aLength = a.length;
        for (int i = 0; i < aLength; i++) {
            /**
             * 比较大小，通过compareTo方法
             */
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}

/**
 * ParadigmTrain1.java
 * Description:  范型类
 *
 * @author Peng Shiquan
 * @date 2020/5/15
 */
class Pair<T> {

    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
