public boolean posNeg(int a, int b, boolean negative) {

    return (a*b<0 && !negative) || (negative&&a<0&&b<0); 
  
}
