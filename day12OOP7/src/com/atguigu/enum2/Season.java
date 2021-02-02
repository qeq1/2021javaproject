package com.atguigu.enum2;

/*
版本迭代后
1.构造器默认私有
2.枚举中的属性 必须位于 枚举元素的下面
3.所有的自定义枚举 默认继承自Enum类

 */
public enum Season {

    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "白雪皑皑");
    private String des;
    private String name;

    Season() {
    }

    Season(String name, String des) {
        this.des = des;
        this.name = name;
    }
/*
    @Override
    public String toString() {
        return "Season{" +
                "des='" + des + '\'' +
                ", name='" + name + '\'' +
                '}';
    }*/
}