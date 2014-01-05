//method 1: 

boolean doubleX(String str) {
  
    for(int i = 0 ; i < str.length()-1; i++){
    
       if(str.charAt(i)=='x'){
           
           if(str.charAt(i+1)=='x') return true; 
           
           else return false; 
       }
    
    }
    
    
    return false; 
 
}

//method 2:

boolean doubleX(String str) {
  
  
    int index = str.indexOf('x'); 
    
    if(index<str.length()-1) return str.charAt(index+1)=='x'; 
    
    
    return false; 
 
}
