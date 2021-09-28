package Loops;

import java.util.Scanner;

public class StarPractice {
    public static void main(String[] args) {
        // user give you some number like 5===>
        //*
        //**
        //***
        //****
        //*****
       int a = 0;
       String star = " ";

        while (a<5){// we can here change
            star = star+"*";
            System.out.println(star);
            a++;
        }

        }
}
