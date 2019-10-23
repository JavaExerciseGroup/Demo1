//package com.ydc.study.collection;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Text {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Dog dog = new Dog();
//        ArrayList<Dog> arrayList = new ArrayList<>();
//        Dog dogA = new Dog(1,"美美","雪纳瑞",'母',98,100);
//        Dog dogB = new Dog(2,"胖胖","雪纳瑞",'母',98,50);
//        arrayList.add(dogA);
//        arrayList.add(dogB);
//        System.out.println("欢迎来到兆隆宠物店！");
//        System.out.println("1.捡到一只流浪犬 \n2.给宠物改个名字 \n3.查看店内狗狗信息 \n4.领养一只小宠物 \n5.放生一只宠物");
//        System.out.println("请选择操作！\t");
//        int qq = scanner.nextInt();
//        switch (qq) {
//            case 1:
//
//                break;
//            case 2:
//                break;
//            case 3:
//                System.out.println("小店里一共有" + arrayList.size() + "只小狗!");
//                System.out.println("宠物名字\t宠物品种\t宠物性别");
//                for (Dog str : arrayList) {
//                    System.out.println(str.getName() + "\t\t" + str.getPingzhong()+"\t\t"+str.getSex());
//                }
//                break;
//            case 4:
//                System.out.println("亲！ 请选择你要领养的小狗狗！");
//                System.out.println("宠物编号\t宠物名字\t宠物品种\t宠物性别");
//                for (Dog str : arrayList) {
//                    System.out.println( str.getBiaohao()+"\t"+str.getName() + "\t\t" + str.getPingzhong()+"\t\t"+str.getSex());
//                }
//                int vv = scanner.nextInt();
//                if (arrayList.get(vv-1).getJiankangzhi()<=59)
//                {
//                    System.out.println("小狗的健康值小于60！ 领养失败！");
//                }else {
//                    arrayList.remove(vv - 1);
//                    System.out.println("恭喜你领养成功！");
//                    break;
//                }
//                System.out.println("您刚刚选择的是：");
//                arrayList.get(vv-1);
//                System.out.println("需要给狗狗喂食：");
//
//
//                break;
//            case 5:
//                System.out.println("亲！ 你想放生哪只狗？");
//                System.out.println("宠物编号\t宠物名字\t宠物品种\t宠物性别");
//                for (Dog str : arrayList) {
//                    System.out.println( str.getBiaohao()+"\t"+str.getName() + "\t\t" + str.getPingzhong()+"\t\t"+str.getSex());
//                }
//                int ss = scanner.nextInt();
//                arrayList.remove(ss-1);
//                System.out.println("成功放生了一只小狗！小店里一共还有" + arrayList.size() + "只小狗!");
//                break;
//        }
//    }
//}
