package com.sau.flowcontrol;

public class MyClassCF01 {
    public static void main(String[] args) {
        //พิสูจน์ครั้งเดียวจริงทำ เท็จไม่ทำ
        int a = 50;
        if (a < 35) {
            System.out.println("Hello...");
        }
        System.out.println("---------------------");
        //พิสูจน์ครั้งเดียว จริงทำ เท็จก็ทำ : if-else
        String b = "XYZ";
        if (b.equals("SAU")) {
            System.out.println("Southease Asia University");
        } else {
            System.out.println("No no no");
        }
    }
}
