public String stringX(String str) {
  
  if(str.length()<=2) return str; 
  
  String ret = str.charAt(0)+""; 
  
  for(int i = 1; i < str.length()-1; i++){
     
     
     if(str.charAt(i)!='x')
       ret+=str.charAt(i); 
  
  }
  
  ret+=str.charAt(str.length()-1); 
  
  return ret; 
  
}