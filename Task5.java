import java.io.BufferedReader;  
import java.io.FileReader;  
public class Task5
{  
    public static void main(String[] args)   
    {  
        try{
            String line="";
            int NoOfTransactions=0;
            double minCost=50000000.00;
            double maxCost=0.00;
            double TotalCost=0;
            BufferedReader br = new BufferedReader(new FileReader("emp.csv"));  
            while ((line=br.readLine())!=null)    
            {  
                String[] Transaction=line.split(","); 
                double Cost=Double.parseDouble(Transaction[3]);
                TotalCost+=Cost;
                if (Cost>maxCost){
                    maxCost=Cost;
                }
                if(Cost<minCost){
                    minCost=Cost;
                }
                NoOfTransactions+=1;  
            }  
            System.out.println("Total number of Transactions (bills) : "+NoOfTransactions);
            System.out.println("Total Bill amount  : "+TotalCost);
            System.out.println("Maximum Bill amount : "+maxCost);
            System.out.println("Minimum Bill amount : "+minCost);
        }   
        catch (Exception e)   
            {  
                System.out.println("Try Block is not Executed");  
            }  
    }  
}  