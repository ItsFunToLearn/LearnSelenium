package xPathAndCss;

public class Xpath {
	
	/*
	IDENTIFYING WEB ELEMENT USING MULTIPLE ATTRIBUTES
	 input[@type='text' and @name='cars']
	 
	WHEN SAME WEB ELEMENT APPEARS MULTIPLE TIMES IN UI - IDENTIFY USING PARENT
	1 div[@class='rb']/input[@value='Buy Now']
	 parent -->     div[@class='rb']
	 child  -->		input[@value='Buy Now']
	 
	2 //tr[td[a[@href='http://msg0.com']]]/td[1]/input
	 
	 WORKING WITH SINGLE WEBTABLE
	 1st row 1st column 
	 //tr[1]/td[1]/a[@href='http://www.gmail.com']
	  
	 WORKING WITH MULTIPLE WEB TABLES
	 //table[@name='tab1']/tbody/tr[1]/td[2]/a
	 
	 XPATH FUNCTIONS
	 
	 text()
	 //h1[text()='Flipkart']
	 //h1[@class='header' and text()='Welcome to 2.2 million users' ]
	 
	 normalize-space()
	 //h2[normalize-space(text)='All brands']
	 //input[normalize-space(@value)='show']
	 //input[@id='name' and normalize-space(@placeholder)='Enter your name']
	 
	 contains()
	 //h1[contains(text, 'welcome to')]
	 //input[contains(@value, 'Rs')]

	 Following Sibling
	 //htmlTag/following-sibling::htmlTag
	 //img[@src='image3.png']/following-sibling::input[@type='button'] 
	 
	 Preceeding-sibling
	 //htmlTag/preceeding-sibling::htmlTag
	 //span[text()='Rs 1 - Rs 100']/preceeding-sibling::input[@type='checkbox']
	 
	 descendant
	 //htmltag/descendant::htmltag or //htmltag//htmltag
	 
	 Using Starts-With to find the elements:
	 Syntax: //tag[starts-with(attribute,‘value’)]
	 //legend[starts-with(text(), 'Radio Button Example')]
	 
	 
	************************************************************************************ 
	 
	 
	 
	 
	 
	 
	 */

}
