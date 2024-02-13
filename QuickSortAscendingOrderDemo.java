public class QuickSortAscendingOrderDemo
{
public static void main(String args[])
{
//Numbers which need to be sorted
int n[] = {23,5,23,1,7,12,3,34,0,-2,4,2,1222,2,0};
//Displaying the numbers before sorting
System.out.print("Before sorting, numbers are ");
for(int i = 0; i< n.length; i++)
{
System.out.print(n[i]+" ");
}
System.out.println();
//Sorting in ascending order using bubble sort
quickSortInAscendingOrder(n,0,n.length-1);
//Displaying the numbers after sorting
System.out.print("Before sorting, numbers are ");
for(int i = 0; i<n.length; i++)
{
System.out.print(n[i]+" ");
}
}
//This method sorts the input array in ascecnding order using quick sort
static void quickSortInAscendingOrder (int[] n, int low, int high)
{
int i=low;
int j=high;
int temp;
int middle=n[(low+high)/2];
while (i<j)
{
while (n[i]<middle)
{
i++;
}
while (n[j]>middle)
{
j--;
}
if (i<=j)
{
temp=n[i];
n[i]=n[j];
n[j]=temp;
i++;
j--;
}
}
if (low<j)
{
quickSortInAscendingOrder(n, low, j);
}
if (i<high)
{
quickSortInAscendingOrder(n, i, high);
}
}
}
