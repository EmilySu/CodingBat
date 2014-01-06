public boolean hasBad(String str) {
  
  if(str.length()<3) return false; 
     
  if(str.length()==3) return str.equals("bad");
     
  return str.startsWith("bad")||str.substring(1,4).equals("bad");
  

  
}
