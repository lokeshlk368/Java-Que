
*******************************************************************************/
import java.util.*;
public class Main
{
    public static void leftToBottomSum(int arr[][],int row,int col)
    {
        int countSum=0;
        int countSum1=0;
        int m=0;
        for(int i=m;i<col;i++)
        {
            int count=arr[0][i];
            countSum=countSum+count;
        }
        m=m+1;
        
        for(int i=m;i<row;i++)
        {
            int countRow=arr[m][row-1];
            countSum1=countSum1+countRow;
        }
        System.out.println(countSum1+countSum);
       
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		}
		leftToBottomSum(arr,row,col);
	}
}
