import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        //given number whose occurences we have to find
        int e = s.nextInt();
        occ(e, n, arr);
        dup(n, arr);
    }
    private static void occ(int e,int n,int[] arr){
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==e){
                System.out.println(i+" ");
                count = count + 1;
            }
        }
        if(count==0){
            System.out.println("no such element present in the given array.");
        }
    }

    private static void dup(int n,int[] arr){
        Set<Integer> duplicate = new HashSet<Integer>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    duplicate.add(arr[i]);
                }
            }
        }
        System.out.println(duplicate.toString());
    }
}
