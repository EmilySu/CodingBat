int countXX(String str) {
  
  if(str.length()<2) return 0 ; 
  
  
  if(str.substring(0,2).equals("xx"))
       return countXX(str.substring(1))+1; 
       
  else return  countXX(str.substring(1)); 
  
  
}
