package Sololearn;//package com.javarush.task.task01.task0121;

/*
Контракт
*/

public class Contract { //public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String[] arr = new String[9];
        String name = "Амиго";
        arr[0] = "Меня зовут " + name + ".";
        arr[1] = "";
        arr[2] = "Я согласен на зарплату $800/месяц в первый год.";
        arr[3] = "Я согласен на зарплату $1500/месяц во второй год.";
        arr[4] = "Я согласен на зарплату $2200/месяц в третий год."  ;
        arr[5] = "Я согласен на зарплату $2700/месяц в четвертый год." ;
        arr[6] = "Я согласен на зарплату $3200/месяц в пятый год.";
        arr[7] = "";
        arr[8] = "Поцелуй мой блестящий металлический зад!";
        for(int i = 0; i<9; i++) {
            System.out.println(arr[i]);
        }

    }
}