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
