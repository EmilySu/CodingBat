//method 1

public String stringBits(String str) {
   
   if(str.length()<=0) return ""; 
   
   
   if(str.length()>2)
   return str.charAt(0)+stringBits(str.substring(2)); 
  
   else return str.charAt(0)+""; 
  
}


//method 2

public String stringBits(String str) {
   
 String ret = ""; 
 
 
 for(int i = 0; i < str.length(); i++){
    
    if(i%2==0) ret+=str.charAt(i); 
 
 
 }
 
 return ret; 
}
