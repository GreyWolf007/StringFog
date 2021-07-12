package com.github.megatronking.stringfog;

public class StringTest {
    public static final String finalStaticStr = "finalStaticStr";
    public final String finalStr = "finalStr";
    public static String staticStr = "staticStr";

    public static final String ss = System.currentTimeMillis() + " UNIX";

    private String prvStr = "prvStr";

    void m1() {
        System.out.println("m1");
    }


    class InternalCls {
        final static String sss = "ssss";
    }
}
