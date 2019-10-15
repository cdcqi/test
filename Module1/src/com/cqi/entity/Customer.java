package com.cqi.entity;

/**
 * @author luohai
 * @date 2019-10-10-16:44
 */
public class Customer {

    public static void main(String[] args) {

        System.out.println("你好!!!");

        String [] arr=new String[]{"1213","456","789"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
   
        for (String s : arr) {
            System.out.println(s);
        }


        for (String s : arr) {
            System.out.println("arr = " + arr);

        }



    }






}
