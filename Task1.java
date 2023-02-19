import java.util.Scanner;
class Task1{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        //System.out.println("Enter Size");
        n=sc.nextInt();
        int arr[]=new int[n];
        //System.out.println("Enter  Elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //System.out.println("Missing Elements are : ");
        for (int i=1;i<=arr[n-1];i++){
            int fl=0;
            for(int j=0;j<n;j++){
                if (i==arr[j]) fl=1;
            }
            if (fl==0) System.out.printf(i+" ");
        }
    }
}