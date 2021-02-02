
public class Test {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,5,43,2,5,67,8,3,1,43};
        for (int i = arr.length-1; i >0 ; i--) {
            boolean isFlag=false;
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    isFlag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (!isFlag){
                break;
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
