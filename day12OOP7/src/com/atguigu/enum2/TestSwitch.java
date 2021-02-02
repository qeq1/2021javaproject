package com.atguigu.enum2;
/*
switch(表达式){
}
表达式：byte short int char String1.7 enum 1.5
 */
public class TestSwitch {

    public static void main(String[] args) {

        Gender gender = Gender.MAN;
        switch (gender){
            case MAN:
                System.out.println("顶天立地");
                break;
            case WOMAN:
                System.out.println("婀娜多姿");
                break;

        }
    }
}
