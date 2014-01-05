public String frontTimes(String str, int n) {
  
  String ret = ""; 
  
  int front = str.length(); 
 
  if(front>3) front = 3; 
  
  
  String sub = str.substring(0,front); 
  
  for(int i = 0 ; i < n; i++){
  
     ret+=sub; 
  
  }
   
   
  return ret; 
  
}