//Actions class user to perporm mouse over actions using selenium
//Actions class method contains following method
//1. clickAndHold() ==click (without releasing) at the current mouse location
//2.contextClick()== rightclick
//3.doubleClick()
//dragAndDrop(source, target)
//dragAndDropBy( source, X-offset, Y-offset)
//moveToElement(toElement)== move the element from scource to target
//release() == release the holded mouse

//mouseover operation == to keep the mouse on the top of the element so it will show the drop down values that is called mouse over actions

Actions act = new Actions(driver);
WebElements  admin = driver.finElement("");
WebElements  usermanagemt = driver.finElement("");
WebElements  user = driver.finElement("");

act.movetoElement(admin).perform(); //it will move the mouse to the specified location
act.movetoElement(usermanagment).perform(); //it will move the mouse to the specified location
act.movetoElement(user).click().perform(); // it will mouseover and click the the element
//instant of above three codes we can also right like this
act.movetoElement(admin).movetoElement(userman).movetoElement(user).perform();
movetoElement() ==> mouseover
contextclick() ==> rightclick

//right click

Action act = new Action(driver);
WebElement element =driver.findelement(By.xpath("");
act.contextClick(element).perform();
driver.findelement(By.xpath("")).click(); //click on copy element
 driver.switchTo().alert().getText(); //get text in alret
driver.switchTo().alert().accept();  // click on ok button in alert
                                       
//drap and drop

 Action act = new Action(driver);
WebElement sourceElement =driver.findelement(By.xpath("");  
WebElement TargetElement =driver.findelement(By.xpath("");   
 act.clickonHold(sourceElement).moveToElement(targetElement).release().perform(); //this is formal way
 act.dragAndDrop(source,target).perform(); //this is shortcut way
                                             
 //slider
 driver.switchTo().frame(0);
 Action act = new Action(driver);
  WebElement slider =driver.findelement(By.xpath("");                                             
 act.moveToElemnent(slider).dragandDropBy(slider,300,0).perform();
                                        
                                        
                                             
                                             
                                       
                                       
                                       
                   
