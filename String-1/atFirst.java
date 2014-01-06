public String atFirst(String str) {
  
  int len = str.length(); 
  
  if(len==0) return "@@"; 
  
  if(len==1) return str+"@"; 
  
  else return str.substring(0,2); 
  
  
}