package com.lin.test;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Demo {

    public static void main(String[] args) {
        //1.构造一副扑克牌
        //先利用两个字符数组，存储52张牌，大小王后面想办法存储到集合
        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] paise = {"黑桃","红桃","梅花","方片"};

        ArrayList<String> poker = new ArrayList<>();
        for(int i = 0; i < paise.length ; i++) {

            for(int j=0 ; j < num.length ; j++) {
                poker.add(paise[i].concat(num[j]));
            }
        }

        poker.add("大王");
        poker.add("小王");
        //System.out.println(list);
        //System.out.println(list.size());

        //2.洗牌
        Collections.shuffle(poker);
        System.out.println("洗牌后：" + poker);

        //3.发牌
        ArrayList<String> zhangsan = new ArrayList<>();
        ArrayList<String> lisi = new ArrayList<>();
        ArrayList<String> wangwu = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for(int i = 0; i  < poker.size(); i++) {

            if( i >= poker.size() - 3) {
                dipai.add(poker.get(i));  //最后三张牌放入dipai集合
            }else if( i % 3 == 0) {
                zhangsan.add(poker.get(i));
            }else if (i % 3 == 1) {
                lisi.add(poker.get(i));
            }else {
                wangwu.add(poker.get(i));
            }
        }

        // 4.看每个人的牌
        System.out.println("--------------------------");
        System.out.println("zhangsan:"+zhangsan);
        System.out.println("lisi:"+lisi);
        System.out.println("wangwu:"+wangwu);
        System.out.println("dipai:"+dipai);

    }
}

