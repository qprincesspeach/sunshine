class Main{
          public static void star(){
                  System.out.print("glitter");
          }
          public static void glitter(int temp){
                   if(temp>35){ //changed 25 to 35
                         System.out.println("*");
                          temp-=1;
                          glitter(temp);
                    }
          }
          public static void main (String[]args) {
    glitter(15);
    star();
  }
  }
