2 FILE CHANGE NEEDED TO WORK PROPERLY

map.java

save mapp.html file to any location on pc and copy file path into line 65
[browser.navigation().loadUrl("C:\\Users\\chris\\Desktop\\mapp.html");]


LoginPageUI.java


in line 157 update file path to Login Database with correct path for user
[FileInputStream file = new FileInputStream(new File("C:/Users/Chris/Documents/NetBeansProjects/DED/src/ded/UserLogins.xlsx"));]