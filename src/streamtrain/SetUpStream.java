package streamtrain;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * SetUpStream.java
 * Description:
 *
 * @author Peng Shiquan
 * Copyright  2018-2019  创捷运维智能科技有限公司
 * All rights reserved.
 * @version: 1.0
 * Reversion:
 * 1.0 - 新建
 */
public class SetUpStream {
    public static void main(String[] args) {

        String[] arrayString = {"aaaa", "bbbb", "ccc", "ddd"};

        /**
         * Stream方法创建流
         */
        Stream<String> stringStream = Stream.of(arrayString);
        Stream<String> stringStream1 = Stream.of("hahah", "aaaa", "bbb", "dddd");

        /**
         * Array.stream(array,from,to)可以创建一个流，从数组中的from到to
         */
        Stream<String> stringStream2 = Arrays.stream(arrayString, 1, 3);

        /**
         * Stream.empty()用来创建一个不包含任何元素的流
         */
        Stream<String> stringStream3 = Stream.empty();

        /**
         * Stream两个创建无限流的方法
         */
        //使用lambda表达式重写Supplier<T>函数表达式
        Stream<String> stringStream4 = Stream.generate(() -> "HELLO");
        //lambda表达式中的实例方法引用
        Stream<Double> stringStream5 = Stream.generate(Math::random);
        // 前面是种子，反复调用函数，应用到之前到结果上    顺序如下： 0，1，2，3，4
        Stream<BigInteger> integerStream = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
        System.err.println(integerStream.toString());
    }
}
