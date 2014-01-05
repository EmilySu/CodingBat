public String everyNth(String str, int n) {
 

    if(str.length()>n)
    
    return str.charAt(0)+everyNth(str.substring(n), n); 
    
    else return str.charAt(0)+""; 
    
    
    
  
}