public class Test {
    public static void main(String[] args) {


        System.out.println("eat(1) = " + eat(9));
    }

    public static int eat(int day){
        if(day==10){
            return 1;
        }
        return (eat(day+1)+1)*2;
    }
}
