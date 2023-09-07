import java.util.* ;
class SlidingWindowRec {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    int[] arr = {2 ,9 ,3 ,8 ,1 ,7 ,12 ,6 ,14 ,4 ,32 ,0 ,7 ,19 ,8 ,12 ,6} ;
    int k=4 ;
    int n = arr.length ;
    int[]  ans = new int[n] ;
    for(int i=0 ;i<n ;i++){
      int max =arr[i] ;
      for(int j=i ;(j<n && j<k+i) ;j++){
         if(max<arr[j]){
           max =arr[j] ;
         }
      }
      ans[i]=max ;
    }

    for(int i=0 ;i<n ;i++){
      System.out.print(ans[i]+" ");
    }
    System.out.println();
  }
}
