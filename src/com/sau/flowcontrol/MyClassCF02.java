package com.sau.flowcontrol;

public class MyClassCF02 {
    public static void main(String[] args) {
        //พิสูจน์หลายครั้ง : if-else-if ใช้ได้ทุกกรณี
        //switch-case ใช้ได้เฉพาะพิสูจน์เท่ากันหรือไม่เท่ากัน
        int score = 75;

        if( score > 80){
            System.out.println("Grade A");
        } else if ( score > 70 ) {
            System.out.println("Grade B");
        } else if ( score >60) {
            System.out.println("Grade C");
        } else if (score >50) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade F");
        }
        System.out.println("------------------------");
        //switch-case ใช้ได้เฉาพะพิสูจน์เท่ากันหรือไม่เท่ากัน และใช้ไม่ได้กับทศนิยม
        int busNumber = 84;
        switch (busNumber){
            case 80 :
                System.out.println("Go to Pata mall");
                break;
            case 81 :
                System.out.println("Go to Siriraj");
                break;
            case 84 :
                System.out.println("Go to Wat rai khing");
                break;
            case 123:
                System.out.println("Go to Central Pinklo");
                break;
            default:
                System.out.println("Do not have Date T_T ");


        }
    }
}
