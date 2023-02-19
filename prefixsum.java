import java.util.Arrays;
class Pre
{
   public static void main(String args[ ])
   {
     
      int x[ ]={12,34,23,1,8};
      int[] prefixSum = new int[x.length];
      prefixSum[0] = x[0];
      for(int i=1;i<x.length;i++)
      {
         prefixSum[i] = prefixSum[i - 1] + x[i];
         
      }
      System.out.println(Arrays.toString(prefixSum));

   }
}