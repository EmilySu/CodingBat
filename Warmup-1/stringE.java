public boolean stringE(String str) {
  
  int ret = 0 ; 
  
  for(int i = 0; i < str.length(); i++){
  
       if(str.charAt(i)=='e') ret++; 
  }
  
  
  return ret>=1&&ret<=3; 
  
}
