package com.chapter13.functional;

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}

/**
 * Lambda 表达式的基本语法是：
 *      1. 参数
 *      2. 接着 ->，可视为 “产出”
 *      3. -> 之后的内容都是方法体
 */
public class LambdaExpressions {
    static Body bod = h -> h + " No Parents!"; // [1] 当只用一个参数，可以不需要括号()。然而，这是一种特例。
    static Body bod2 = (h) -> "More details"; // [2] 正常情况下，使用括号 () 包裹参数。为了保持一致性，也可以使用括号 () 包裹单个参数，虽然这种情况并不常见
    static Description desc = () -> "Short info"; // [3] 如果没有参数，则必须使用括号 () 表示空参数列表
    static Multi mult = (h, n) -> h + n; // [4] 对于多个参数，将参数放在括号 () 中

    static Description moreLines = () -> { // [5] 如果 Lambda 表达式中确实需要多行，则必须将这些行放在花括号中。在这种情况下，需要使用 return
        System.out.println("moreLines");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("Pi! ", 3.14159));
        System.out.println(moreLines.brief());
    }
}
