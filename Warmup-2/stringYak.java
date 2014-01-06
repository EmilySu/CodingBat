public String stringYak(String str) {

   String ret = ""; 
  
   for(int i = 0 ; i < str.length(); i++){
      
       if(str.charAt(i)=='y'&& i+2<str.length()&&str.charAt(i+2)=='k') 
       
           i+=2; 
           
       else ret+=str.charAt(i); 
   
   }

  
   return ret; 
}
