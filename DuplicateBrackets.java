import java.util.* ;
class DuplicateBrackets {
  public static void main(String[] args) {
    // System.out.println("Hello world!");

    String str = "(a+b)+((c+d))" ;
    Stack<Character> st = new Stack<>() ;
    for(int i=0 ;i< str.length() ;i++){
      char ch = str.charAt(i) ;
      if(ch !=')'){
        st.push(ch) ;
      }
      else{
        while(st.peek() !='('){
          st.pop() ;
        }
        st.pop() ;
      }
    }
    if(st.size()==0){
      System.out.println("true") ;
    }
    else{
      System.out.println("false") ;
    }
  }
}
