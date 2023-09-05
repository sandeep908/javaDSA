import java.util.* ;
class NextGreaterEle {
  public static void main(String[] args) {
    // System.out.println("Hello world!");

    int[] arr = {2 ,5 ,9 ,3 ,1 ,12 ,6 ,8 ,7} ;
    Stack<Integer> st = new Stack<>() ;
    int n = arr.length ;
    int[] ans = new int[n] ;
    st.push(arr[n-1]) ;
    ans[n-1]=-1 ;
    for(int i=n-2 ;i>=0 ;i--){
      while(st.size()>0 && arr[i]>=st.peek()){
        st.pop() ;
      }

      if(st.size()==0){
        ans[i]=-1 ;
      }
      else{
        ans[i]=st.peek() ;  
      }
        st.push(arr[i]) ;
    }

    for(int j=0 ;j<n ;j++){
      System.out.print(ans[j]+" ") ;
    }
    System.out.println() ;
  }
}
