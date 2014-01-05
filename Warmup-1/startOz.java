public String startOz(String str) {
  
  if(str.length()==0) return ""; 
  
  String ret = ""; 
  
  if(str.charAt(0)=='o') ret+="o"; 
  
  if(str.length()==1) return ret; 
  
  if(str.charAt(1)=='z') ret+="z";
  
  return ret;  
  
  
}