public boolean array123(int[] nums) {
  
  if(nums.length<3) return false; 
  
  int a = 0 ; 
  int b = 0 ; 
  int c = 0 ; 
  
  for(int i = 0 ; i < nums.length; i ++){
  
    if(nums[i]==1) a++; 
    if(nums[i]==2) b++; 
    if(nums[i]==3) c++; 
  
  
  }
  
  
  return a>0&&b>0&&c>0;  
  
  
}
