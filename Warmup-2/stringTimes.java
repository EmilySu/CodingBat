public String stringTimes(String str, int n) {
    
    if(n==0) return ""; 
    
    return str+stringTimes(str, n-1); 
    
    
}