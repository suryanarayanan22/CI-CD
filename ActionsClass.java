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

22 mins
