import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter number of elements :: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Elements :: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        int[] arr = new int[n];
        for(i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(a[i]);
        }
        quicksort(arr,0,arr.length-1);
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static int partition(int[] arr,int low,int high){
        int i,j;
        int pivot = arr[high];
        i = low-1;
        for(j=low; j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
    public static void quicksort(int[] arr,int p,int r){
        if(p<r){
            int part = partition(arr,p,r);
            quicksort(arr,p,part-1);
            quicksort(arr,part+1,r);
        }
    }
}
