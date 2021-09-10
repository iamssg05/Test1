import java.util.*;

public class Test1 {

    public static void main(String[] args){
        int[] arr;
        arr = new int[5];

        //Boolean Flag to check if everything went well
        boolean errFlag = false;

        //Scanner object to read from command line
        Scanner sc = new Scanner(System.in);

        //Try Catch block to catch input type error
        try{
            //Taking input in array
            for(int num=0; num < arr.length; num++){
                arr[num] = sc.nextInt();
            }
        }
        catch(Exception e){
//            System.out.println(e);
            errFlag = true;
            System.out.println("Please enter a valid Input [Integer Expected]");
        }

        if(errFlag){
            System.out.println("Something went wrong...");
        }
        else{
            Arrays.sort(arr);

//        for(int num : arr){
//            System.out.print(num + " ");
//
//        }
//            System.out.println("The Sorted Array : ");
            System.out.println("The Sorted Array : \t"+Arrays.toString(arr));
        }

    }
}
