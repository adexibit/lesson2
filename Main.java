import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] punktONEarray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int[] punktTWOarray =new int [8];
        int[] punktTHREEarray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] punktFOURarray = new int [5][5];
        int[] punktFIVEarray = {1,4,7,4,4,7,8,44,213,23,7,8,3,-3,-54,3};
        int[] punktSIXarray = {1,2,5,4,7,8,11};
        int[] punktSevenarray = {1,2,3,4,5};

        changeZeroToOne(punktONEarray);
        System.out.println(Arrays.toString(punktONEarray));
        fillArr(punktTWOarray);
        System.out.println(Arrays.toString(punktTWOarray));
        lesserThanSix(punktTHREEarray);
        System.out.println(Arrays.toString(punktTHREEarray));
        for (int i = 0; i <fillDiag(punktFOURarray).length ; i++)
        System.out.println(Arrays.toString(fillDiag(punktFOURarray)[i]));
        findMaxElement(punktFIVEarray);
        System.out.println(checkBalance(punktSIXarray));
        shiftArray(punktSevenarray,2);


    }

    private static void changeZeroToOne(int[] arr) {
        for (int i = 0 ; i <arr.length ; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
    }

    private static void fillArr(int[] arr){
        for (int i = 0 ; i<arr.length ; i++){
        arr[i] = i*3;
        }
    }

    private static void lesserThanSix(int[]arr){
     for (int i = 0 ; i<arr.length ; i++){
         if (arr[i]<6) arr[i]=arr[i]*2;
     }


    }
    private static int[][] fillDiag(int[][]arr){
       for (int i = 0; i <arr.length ; i++) {
          arr[i][i]=1;
            }
       int x = 0;
       for (int i = arr.length-1; i >= 0 ; i--) {
           arr[i][x]=1;
           x++;
        }
        return arr;
        }

    private static void findMaxElement(int[]arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];

        }
        System.out.println("Максимальное " + max + " Минимальное " + min);
    }

    private static boolean checkBalance(int[]arr){
        int leftsum = 0;
        int rightsum =0;
        boolean result = false;
        for (int i = 0; i <arr.length ; i++) {
            leftsum=leftsum+arr[i];
            rightsum =0;
            for (int j = arr.length-1; j>i ; j--) {
            rightsum=rightsum+arr[j];
            if (leftsum==rightsum) return true;
            }
        }

        return false;


    }


        private static void shiftArray(int[]arr,int shift){

            int[] reordered = new int[arr.length];
            if (shift>=0) {

                for (int i = 0; i < arr.length; i++) {
                    reordered[i] = arr[(shift + i) % arr.length];

                }
            }
            else {
                shift = shift * -1;
            }
                for (int i = arr.length-1; i >=0; i--) {
                    reordered[i] = arr[(shift + i) % arr.length];
            }


            System.out.println(Arrays.toString(reordered));

            }




}
