public boolean in3050(int a, int b) {
  
   return helper(a,b,30,40)||helper(a,b,40,50); 
  
}

public boolean helper(int a, int b, int start, int end){

return (a>=start&&a<=end) && (b>=start&&b<=end); 

}