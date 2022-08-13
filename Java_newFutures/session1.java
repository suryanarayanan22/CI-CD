//conscise code  (means litle line of code)
//they enabled functional programming 
//they only have oobs orianted

// i want to be storng in return type and static method

1.Lambda expersion
2.functioanl interface
3.default method and static method
4.predefined functional interface
5.Double colon operator(::)
6.streams
7.date and time
8.optional class
9.nashron javascirpt  engine


//The main advantage of lambda expersion in java
// to bring befints functional programming into java
//what is lamda expersion
// it is an anonymous fuction  (means name less)(without return type)(without modifiers)

//convert the normal method into lambda expersion
public static void m1(){
   System.out.println('');
   }
//converting this above method into lambda

()-> { System.out.println('');} //curly braces are madatory for 2 or more line
()->  System.out.println(''); //curly braces are option for one line code    
     
//convert the normal method into lambda expersion  
public static void m1(int 1, String name){
   System.out.println(1+nam);
   }
//converting this above method into lambda
(int 1, Stirng name)-> { System.out.println(1+name);} //if the compiler can able to gues the type(means int, string)
( 1, name)->  System.out.println(1+name);

//convert the normal method into lambda expersion  
public static sequareit m1(int n){
   return n*n
   }
//converting this above method into lambda
(int n) -> {return n*n;  } //as this in 1 line of code we can remove curly braces
(int n) ->  n*n; //without curly braces we should not use return type
 n ->  n*n; //if there is one paranmeter () this optional

// To call the method we should go for special word FI ==> Functional interface

FI
//if method as single abstruction method  is called as Functional interface
// if you want to invoke or call the lambda expresion then we need fucntional interface






