package com.chapter8.resuse;

/**
 * final 参数
 * 在参数列表中，将参数声明为 final 意味着在方法中不能改变参数下指向的对象或基本变量
 */

class Gizmo {
    public void spin() {
        System.out.println("spin");
    }
}

public class FinalArguments {
    void with(final Gizmo g) {
        //-g g = new Gizmoj(); // Illegal -- g is final
    }

    void without(Gizmo g) {
        g = new Gizmo(); // OK -- g is not final
        g.spin();
    }

    // void f(final int i) { i++; } // Can't change
    // You can only read from a final primitive
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
