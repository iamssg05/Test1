import java.util.*;

public class Test1 {

    public static void main(String[] args){
        int[] arr;
        Scanner sc = new Scanner(System.in);
        arr = new int[5];
        try{
            for(int num=0; num < arr.length; num++){
                arr[num] = sc.nextInt();
            }
        }
        catch(Exception e){
//            System.out.println(e);
            System.out.println("Please enter a valid Input [Integer Expected]");
        }

        Arrays.sort(arr);

//        for(int num : arr){
//            System.out.print(num + " ");
//
//        }
        System.out.println(Arrays.toString(arr));
    }
}
