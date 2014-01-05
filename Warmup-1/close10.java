public int close10(int a, int b) {
  
  int A = Math.abs(a-10); 
  int B = Math.abs(b-10); 
  
  if(A<B) return a; 
  else if (A>B) return b; 
  else return 0; 
  
    
}
