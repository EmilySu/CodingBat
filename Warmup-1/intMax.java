public int intMax(int a, int b, int c) {
    
    int temp = helper(a,b); 
    
    return helper(temp,c); 
    

  
}

public int helper(int a, int b){

  if(a>b) return a; 
  else return b; 

}
