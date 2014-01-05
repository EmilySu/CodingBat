public String front22(String str) {
  int frontLength = 2; 
  
  if(str.length()<2) frontLength = str.length(); 
  
  String front = str.substring(0,frontLength); 
  return front+str+front; 
}