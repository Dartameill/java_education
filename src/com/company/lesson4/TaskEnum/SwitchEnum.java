package com.company.lesson4.TaskEnum;

public class SwitchEnum {

        public void testSwitch(Months month) {
            switch (month) {
                case January:
                case February:
                case December:
                    System.out.println(Years.Winter);
                    break;
                case March:
                case April:
                case May:
                    System.out.println(Years.Spring);
                    break;
                case June:
                case July:
                case August:
                    System.out.println(Years.Summer);
                    break;
                case September:
                case October:
                case November:
                    System.out.println(Years.Autumn);
            }
        }
}
