Runnable ==>run()
Callable ==>call()
Comparable ==> compareTo()
ActionListener ==> actionPerformed()
// the above values contains single abstract methond  
//default method and static method  may have any number, but it should have only Functional interface
//The @ name came with  functional interface, when ever you want crate funcional interface you should use @FunctiaonInterface
 @FunctiaonInterface
  interface inter{
   public void m1(); //it should hav atleast one abstract method and it should not have more than 1 abstact method
  public static void m3(){ //the restriction is for only abstract method, not for default method and static method
   
  }
  
 @FunctiaonInterface
  interface interA{
     public void m1(); 
  }
  
   @FunctiaonInterface
  interface interB extends interA{
    //this valid because it contains the proerity of A, you do need to call any method it can  be empty
  }
  
   @FunctiaonInterface
  interface interB extends interA{
          public void m1();  //this is valid because m1 method is overiding the previous method
          public void m2(); //this is invalid coz there are two reason 1. it has 2 abstract method 2.it should not have different method name
   }
  
//Lambda expersion with functional interface
  
  @FunctiaonInterface
  interface interA{
     public void m1(); 
  }
  //without lambda expersion
  class demo implements self{
   public void m1(){
     system.out.printLn('hello');
  }
    
    public static void  main(String[] args){
      demo dm = new demo();
      d.m1();
     InterA dm = new demo(); //parent reference can be used to hold child object
      
      //write the lambda expersion for above code
      
     @FunctiaonInterface
  interface interA{
     public void m1(); 
  }
  //without lambda expersion
  class demo implements interA{
    
    public static void  main(String[] args){
      InterA dm = () ->{ system.out.printLn('hello');}
      d.m1();  
      
      
 //the type can be gused by compiler by the using the interface concepts, in interface type will be givven already based on that it complier will guse the type method
      
     @FunctiaonInterface
  interface interA{
     public void m1(int a,int b); 
  }
  //without lambda expersion
  class demo implements interA{
    
    public static void  main(String[] args){
      InterA dm = (a,b) ->{ system.out.printLn(a,b);}
      d.m1();  
          
      
      
      
      
  
  
  
