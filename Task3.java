import java.util.Scanner;
import java.util.Arrays;
public class Task3{
    static Scanner sc=new Scanner(System.in);
    static int ProductsCount[]={10,20,30,50};
    static String Products[]={"Mobiles","Laptops","Speakers","HeadPhones"};
    static int ProductsCost[]={12000,50000,1000,2000};
    static String ProductsSpecification[]={
        "5G mobile ,6GB RAM , 128GB ROM",
        "Intel i5 Processor , 8GB RAM , 512GB SSD",
        "Bluetooth Connected , 10 Watts Driver , Water Resistent",
        "Bluetooth or Wired , 50 Watts Drivers , Water Resistent IPX5"
    };
    static String Details[]={"Product List","Product Count","View Product Details","Update Product Specifications","Edit Product Quantity"};
    //method to edit count of Product
    static void EditCount(int n){
        if(n>4){
            System.out.println(" Product "+n+" not in List");
            return;
        
        }
        System.out.println();
        System.out.println("Enter count of product");
        int count;
        count=sc.nextInt();
        ProductsCount[n-1]=count;
        System.out.println("Quantity is updated");
    }
    //method to edit product specification
    static void EditProductDetails(){
        DisplayProducts();
        int r;
        String Str;
        System.out.println("Select Product option");
        r=sc.nextInt();
        if(r>4){
            System.out.println("Product "+r+" not in List");
            return;
        }
        sc.nextLine();
        System.out.println("Enter  Specifications");
        Str=sc.nextLine();
        ProductsSpecification[r-1]=Str;
        System.out.println("New Specifications  updated");
    }
    //method to display Products
    static void DisplayProducts(){
        for (int i=0;i<4;i++){
            System.out.println((i+1)+". "+Products[i]);
        }
    }
    //method to display product specifications
    static void DisplayProductSpecification(){
        DisplayProducts();
        int r;
        System.out.println("Select The Product option to get Details");
        r=sc.nextInt();
        System.out.println();
        System.out.println(Products[r-1]+"\n"+ProductsSpecification[r-1]+"\nEach Item Costs Rs."+ProductsCost[r-1]+"\nAvailable Items- "+ProductsCount[r-1]);
    }
    //method to display product count
    static void DisplayProductCount(){
        for (int i=0;i<4;i++){
            System.out.println((i+1)+". "+Products[i]+" - Available Items : "+ProductsCount[i]);
        }
    }
    //method to call the content in Menu
    static void Show(int n){
        System.out.println();
        if ((n-1)==0){
            DisplayProducts();
        }
        else if((n-1)==1){
            DisplayProductCount();
        }
        else if((n-1)==2){
            DisplayProductSpecification();
        }
        else if((n-1)==3){
            EditProductDetails();
        }
        else if((n-1)==4){
            System.out.println();
            DisplayProductCount();
            System.out.println("Select Any Option from above List of product to update Quantity");
            int r;
            r=sc.nextInt();
            EditCount(r);
        }
        if(Continue()) {
            System.out.println();
            for (int i=0;i<5;i++){
                System.out.println((i+1)+". "+Details[i]);
            }
            System.out.println();
            System.out.println("Select Any Option from above List");
            n=sc.nextInt();
            Show(n);
        }
        else return;
    }
    //method to display List of Menu
    static void Menu(){
        for (int i=0;i<5;i++){
            System.out.println((i+1)+". "+Details[i]);
        }
    }
    //base call to start
    static void Display(){
        System.out.println();
        Menu();
        if(Continue()) {
            System.out.println();
            System.out.println("Select Any Option from above List");
            int n=sc.nextInt();
            Show(n);
        }
        else return;
    }
    //method to continue or stop process
    static boolean Continue(){
        System.out.println();
        char ch;
        System.out.println("Press any Key to Continue or n to stop");
        ch=sc.next().charAt(0);
        if (ch=='n') return false;
        else {
                return true;
        }
    }
    public static void main(String args[]){
        Display();
    }
}