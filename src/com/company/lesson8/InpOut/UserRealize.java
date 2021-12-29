package com.company.lesson8.InpOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UserRealize implements  InputAndOutput  {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        UserRealize user = new UserRealize();
        System.out.println(user.OutAndInt(arrayList));
        System.out.println(user.isEmptyArray(arrayList));
    }

    @Override
    public ArrayList<String> OutAndInt(ArrayList<String> list) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 7; i++) {
            try {
                list.add(reader.readLine());
                if(list.size() >= 5) {
                    list.remove(5);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public ArrayList<String> isEmptyArray(ArrayList<String> list) throws NullPointerException {
       if(list.isEmpty()) {
           throw new NullPointerException();
       }
       return list;
    }
}