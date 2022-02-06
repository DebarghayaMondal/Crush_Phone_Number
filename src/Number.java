import java.io.*;
import java.util.Arrays;

public class Number {
    public static void main(String args[]) throws IOException
    {
        InputStreamReader br =  new InputStreamReader(System.in);
        BufferedReader in =  new BufferedReader(br);
        int i,j,x=10,s=0,c;
        int [] ak = new int[9];
        int [] an = new int[10];
        System.out.print("Enter no. of known digits = ");
        int k = Integer.parseInt(in.readLine());
        System.out.println("Enter known digits");
        for (i=0;i<k;i++)
        {
            ak[i]=Integer.parseInt(in.readLine());
        }
        System.out.print("Sum of all digits = ");
        int n= Integer.parseInt(in.readLine());
        for (i=0;i<k;i++)
        {
            an[i] = ak[i];
            s=s+ak[i];
        }
        n=n-s;
        for(i=k;i<10;i++)
        {
            c= (int)Math.floor(Math.random() * 10);
            for (j=(x-1);j>=0;j--)
            {
                if (c+j<=n)
                {
                    an[i]=c;
                    n=n-c;
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(an));
    }
}
