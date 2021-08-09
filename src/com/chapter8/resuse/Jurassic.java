package com.chapter8.resuse;

/**
 * final 类
 * 当一个类是 final 时，就意味着它不能被继承。
 */

class SmallBrain {

}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();

    void f() {

    }
}

//- class Further extentds Dinosaur {}
// error: Cannot extend final class 'Dinosaur'

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}
