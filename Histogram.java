import java.util.* ;
class Histogram {
  //O(n^2) time complexity
  public static void main(String[] args) {
    // System.out.println("Hello world!");

    int[] arr = {6 ,2 ,5 ,5 ,5 ,1 ,6} ;
    int maxArea = 0 ;
    int n = arr.length ;
    for(int i=0 ;i<n ;i++){
      int count=1 ,num = arr[i] ;
      int j=i-1;
      while(j>0 && num<=arr[j]){
        count++ ;
        j-- ;
      }
      j=i+1;
      while(j<n-1 && num<=arr[j]){
        count++ ;
        j++;
      }
      maxArea = Math.max(maxArea ,count*arr[i]) ;
    }
    System.out.println(maxArea);
  }
}
