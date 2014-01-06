public String firstTwo(String str) {
  int first = 2; 
  
  if(str.length()<2) first = str.length(); 
  
  
  return str.substring(0,first); 
}
