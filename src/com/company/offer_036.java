package com.company;

import java.util.LinkedList;

public class offer_036 {
    public static void main(String[] args) {
        String[] arr=new String[]{"4","13","5","/","+"};
        int i = evalRPN(arr);
        System.out.println(i);
    }
    public static int evalRPN(String[] tokens) {
        LinkedList<Integer> list=new LinkedList<>();
        for(String str:tokens){
            switch(str){
                case "+":
                case "-":
                case "*":
                case "/":
                    int b=list.pop();
                    int a=list.pop();
                    int re=cal(a,b,str);
                    list.push(re);
                    break;
                default:
                    list.push(Integer.parseInt(str));
            }
        }
        return list.pop();
    }
    public static int cal(int a,int b,String op){
        int re=0;
        switch(op){
            case "+":
                re=a+b;
                break;
            case "-":
                re=a-b;
                break;
            case "*":
                re=a*b;
                break;
            case "/":
                re=a/b;
                break;

        }
        return re;
    }
}
