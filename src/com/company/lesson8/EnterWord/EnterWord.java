package com.company.lesson8.EnterWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EnterWord implements EnterUserWord {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        EnterWord enterWord = new EnterWord();
        System.out.println(enterWord.EnterWordTo(list));

    }
    @Override
    public ArrayList<String> EnterWordTo(ArrayList<String> arrayList) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            try {
                String number = reader.readLine();
                arrayList.add(number);
                if(number.equals("get")) {
                    System.out.println(arrayList.get(0));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}
