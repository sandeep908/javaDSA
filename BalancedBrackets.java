import java.util.* ;
class BalancedBrackets {
  public static void main(String[] args) {
    // System.out.println("Hello world!");

    String str = "(a+b)+((c+d))" ;
    Stack<Character> st = new Stack<>() ;
    for(int i=0 ;i< str.length() ;i++){
      char ch = str.charAt(i) ;
      
      if(ch=='(' || ch=='{' || ch=='['){
        st.push(ch) ;
      }
      else{
          if((st.peek()=='(' && ch==')') ||(st.peek()=='{' && ch=='}')||(st.peek()=='[' && ch==']') ){
            st.pop();
          }
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
