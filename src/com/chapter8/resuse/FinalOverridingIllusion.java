package com.chapter8.resuse;

class WithFinals {
    // Identical to "private" alone;
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    // Also automatically "final":
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverringPrivate.f()");
    }

    private void g() {
        System.out.println("OverringPrivate.g()");
    }
}

class OverringPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverringPrivate2.f()");
    }

    public void g() {
        System.out.println("OverringPrivate2.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverringPrivate2 op2 = new OverringPrivate2();
        op2.f();
        op2.g();
        // You can upcast:
        OverridingPrivate op = op2;
        // But you can't call the methods:
        //- op.f();
        //- op.g();
        // Same here:
        WithFinals wf = op2;
        //- wf.f();
        //- wf.g();
    }
}
