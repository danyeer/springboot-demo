package com.ddzb.coppermall.portal.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class StringFormatUtils {
    private static final Map<String, String> chineseMap = new HashMap<String, String>();

    //    private static final String yearReg="[一|二|三|四|五|六|七|八|九|十|〇|○]{4}年";
//    private static final String monthReg="(([十][一|二])|([一|二|三|四|五|六|七|八|九|十]))月";
//    private static final String dayReg="(([十][一|二|三|四|五|六|七|八|九])|(一|二|三|四|五|六|七|八|九|十)|([一|二|三][十][一|二|三|四|五|六|七|八|九]))日";
    static {
        chineseMap.put("一", "1");
        chineseMap.put("元", "1");
        chineseMap.put("二", "2");
        chineseMap.put("三", "3");
        chineseMap.put("四", "4");
        chineseMap.put("五", "5");
        chineseMap.put("六", "6");
        chineseMap.put("七", "7");
        chineseMap.put("八", "8");
        chineseMap.put("九", "9");
        chineseMap.put("〇", "0");
        chineseMap.put("○", "0");
        chineseMap.put("十", "10");
        chineseMap.put("百", "100");
    }

    public static int chinese2intData(String value) {
        int sumNum = 0;
        int unitValue = 0;
        for (int i = 0; i < value.length(); i++) {
            char te = value.charAt(i);
            int temp = Integer.parseInt(chineseMap.get(String.valueOf(te)));
            switch (temp) {
                case 100:
                    if (unitValue == 0) {
                        unitValue = 1;
                    }
                    sumNum += unitValue * temp;
                    unitValue = 0;
                    break;
                case 10:
                    if (unitValue == 0) {
                        unitValue = 1;
                    }
                    sumNum += unitValue * temp;
                    unitValue = 0;
                    break;
                default:
                    unitValue += temp;
                    break;
            }
        }
        sumNum += unitValue;
        return sumNum;
    }


    public static String int2chineseNum(int src) {
        final String num[] = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        final String unit[] = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千"};
        String dst = "";
        int count = 0;
        while (src > 0) {
            dst = (num[src % 10] + unit[count]) + dst;
            src = src / 10;
            count++;
        }
        return dst.replaceAll("零[千百十]", "零").replaceAll("零+万", "万")
                .replaceAll("零+亿", "亿").replaceAll("亿万", "亿零")
                .replaceAll("零+", "零").replaceAll("零$", "");
    }

    /***
     * 生成流水单号
     */
    public static String generateTime() {
//        Random random = new Random();
//        String result="";
//        for(int i=0;i<8;i++){
//            //首字母不能为0
//            result += (random.nextInt(9)+1);
//        }
//        return result;
        LocalDateTime now = LocalDateTime.now();
        //年月日时分秒毫秒
        return now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));

    }

    public static String getSn(String str) {
        StringBuilder sb = new StringBuilder(str);
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        LocalDateTime now = LocalDateTime.now();
        sb.append(now.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        return sb.toString();

    }

    public static void main(String[] args) {
        Integer num = 100101;
//        System.out.println(num.toString().startsWith(chinese2intData("9")+""));
        System.out.println(Integer.parseInt(num.toString().replaceFirst(chinese2intData("一") + "", "")));

        System.out.println(Math.round(-1.5));
//        new ConcurrentHashMap<>();
//        new HashMap<>();
//
//        MyNumber myNumber = new MyNumber();
//
//        new Thread(() -> {
//            System.out.println(Thread.currentThread().getName() + "------- coming in");
//            try {
//                TimeUnit.SECONDS.sleep(3);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            myNumber.setNumber();
//            System.out.println(Thread.currentThread().getName() + "update number");
//
//        }, "A").start();
//
//        while (myNumber.number ==10){
//
//        }
//
//        System.out.println(Thread.currentThread().getName() + "mission is over");
//
//        List list = new CopyOnWriteArrayList();

        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println("size1:" + list.pollFirst());
//        list.remove();
        System.out.println("size2:" + list.getFirst());


    }

}

class MyNumber {
    volatile int number = 10;

    public void setNumber() {
        this.number = 100;
    }
}
