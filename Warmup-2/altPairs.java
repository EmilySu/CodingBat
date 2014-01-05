public String altPairs(String str) {
  
  
  String ret = ""; 
  
  for(int i = 0 ; i < str.length(); i++){
  
     if(i%4==0||i%4==1) ret+=str.charAt(i); 
  
  
  }
  
  
  return ret; 
  

}
