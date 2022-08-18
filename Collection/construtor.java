//In constructor 
// once we created the object we are responsable to inizialisation, then only object creation is meaningfoul 
//constrcutor is responable for inizialisation , 
//what all the instance verable are there you provide as argurment/parameter to constructor method. The constructor name must be same as class name
//constructor is responsable to initsialsation of the object but not to create the object , New keyword is responsable to create teh object
//onve the object is created, for every object seprate copy of instance variable will be created, for every instance variable defualt value will be created by jvm
public class TC_ODR_008 extends ApplicationKeywords {
	BaseClass obj; //instance variable
	CommonUtilities utilities;//instance variable
	Login_Logout login_Logout;//instance variable
  
 public TC_ODR_008(BaseClass obj) { //constrcutor
		this.obj = obj;  //this keyword means what current object the given value in comutility will be called and it will be repalaced using this keyword
	}
		public void tC_ODR_008() {
		utilities = new CommonUtilities(obj); // new key is resposable to object creation
		login_Logout = new Login_Logout(obj); // Login_Logout(obj) this is called constructor call
    }
}

//for every object constructor will be executed if you create 10 object it will execute 10times
//default == which is accessable only with in same package
//protected == which is accessable within the same package, but outside only in the child class
//Rules of constructor 
1.return type is not available in constractor, if you give return type as void it will take as method
2. the modifiers only allowed in constrcutor are public , default, private, prodtucted

//default constructor

//if you dont add constructor in class compiler will add constructor for us that is called as default constructor
//default constructor is always NO arg constructor -- means inside the () there will be no value
//even if we write the constructor with with no arg constrcutor it is not default constructor
// access modifier of default constructor is same as class modifier, this rule is applicable only for public and default coz top level class cant be private and protectued 
// default constructor only one line of code that is super(); means no argument call to parent constructor
//the first line of code should be eithre super(); or this(); keywoard
//this(); mans calling current class cosntrucotr


//case study of super

1. call to constructor must be in first statement menas super(); or this(); must be in first line of construtor
2. you can use only super(); and this(); must be in constructor, out side of constructor we cant use we will get error

