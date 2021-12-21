package main.java.jp.ac.uryukyu.ie.e205515;

public class Report5 {
    public static void main(String[] args) {
    /*
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生！");
            System.out.println(e.getMessage());
        }
    */  
        try {
            String str = "百二十三";
            int value = Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.out.println("NumberFormatExceptionが発生！");
            System.out.println(e.getMessage());
        }
    }
}