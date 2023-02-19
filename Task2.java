import java.util.Scanner;
import java.util.Arrays;
class Task2{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if (a[i]!=-1){
                for(int j=i;j<n;j++){
                    if (i!=j && a[i]==a[j]) a[j]=-1;
                }
                System.out.printf(a[i]+" ");
            }
        }
    }
}