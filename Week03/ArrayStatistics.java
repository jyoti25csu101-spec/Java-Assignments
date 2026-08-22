import java.util.Scanner;
public class ArrayStatistics {

    public int sum(int[] values)
    {
        int sum=0;
        
        for(int i=0;i<values.length;i++)
        {
            sum +=values[i];        
        }
        return sum;
    }

    public double average(int[] values)
    {
        double average = sum(values) / values.length;
        return average;
    }
    
    public int minimum(int[] values)
    {
        int min=values[0];
        for(int i=1;i<values.length;i++)
        {
            if(values[0]>=values[i])
            {
                min=values[i];
            }
        }
        return min;
    }
    public int maximum(int[] values)
    {
        int max=values[0];
        for(int i=1;i<values.length;i++)
        {
            if(values[0]<=values[i])
            {
                max=values[i];
            }
        }
        return max;
    }
    int countEven(int[] values){
        int count=0;
        for(int i=1;i<values.length;i++)
        {
            if(values[i]%2==0){
                count++;
            }
        }
    return count;
    
}
    void printSignCounts(int[] values){
        int positive_count=0;
        int negative_count=0;
        int zero_count=0;
        for(int i=0;i<values.length;i++)
        { 
            if(values[i]<0){
              negative_count++;
            } 
            else if(values[i]>0){
              positive_count++;
            }
            else{
              zero_count++;
            }

        }
    }

}


