/*
修改快捷键： file -->settings ---> keymap --->eclipse

系统快捷键：
    ctrl+c  复制
    ctrl+v  粘贴
    ctrl+Z  撤销
    ctrl+Y 取消撤销

 idea自带的快捷键：
   psvm 打印main方法（）；

   sout 快速输出语句

   shift+enter:快速到下一行

   ctrl +d :快速删除


   ctrl + alt + 下：快速复制  和intel的显卡快捷键冲突

   alt+上/下  快速移动代码

   ctrl + shift + f： 格式化代码  和搜狗输入法 简繁切换的快捷键冲突

 */

public class Test {
    public static void main(String[] args) {
        l:
        for (int i = 2; i < 200; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    continue l;
                }
            }
            System.out.println(i);
        }
    }

    private static int sum(int i) {
        return 10;

    }

    void eat(){


    }

}
