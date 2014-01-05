//method 1

public String stringSplosion(String str) {
  
  if(str.length()==0) return ""; 
  
  return stringSplosion(str.substring(0,str.length()-1))+str; 
  
  
  
}


//method 2

public String stringSplosion(String str) {
  
  
  String ret = ""; 
  
  for(int i = 1; i <= str.length(); i++){
  
     ret+=str.substring(0,i); 
  
  }
  
  
  return ret; 
  
  
  
}