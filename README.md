
# Selenium Automation(NAGP) 







## Packages Description 
.Main- define Pages and Utilites 

.Test- define basepage and testcases

.drivers- contains all required drivers

.Test data- contains all csv files


## CSV File Description
Excellogin.xlsx- Contains data for signin functionality                                        
search.xlsx- Contains data for search 
## Configuration
config.properties-contains driver url ,firstname,lastname and email required to run selenium automation tool

*Note: User need to change the email everytime in order to run create account test(email is a mandatory field)
## Extent- Report and Screen-Shots capture
In order to view extent report and screenshot capture for the failed scenarios. He/She needs to refresh the project everytime after the execution of all test cases in the testng.xml
## BatchFile.bat
batchfile.bat- This file can be used to run all the test cases with a single click 
## Implemented features
1.	Create at least 8 test cases across different pages
2.	Create a Page Factory Framework using TestNG to implement these test cases. 
3.	The framework should have following features –
.	Test Data should be read from properties file
.	Use Maven as build execution tool
.	Implement proper waits.
.	The global configuration values like browser name, test site URL, global wait value etc. should be read from a properties file
.	The test should run on following browsers Chrome, FF, IE (Safari, in case using Mac machine)
.	Put proper assertions with error description and if any test cases fail take a screenshot with the name same as test case and appended by a brief description of error in the screenshot file name (For e.g., TestCase1_Invalid_Credentials).
.Create Extent report. Customize the report to append error screenshots. At the end of a test execution, move the results (the extent report and error screenshots) to a folder with the name “Current test results”. The folder name should reflect the date time of the run. At the start of the results the result of the current test result should move to a folder with the name “Archived test results” and clean the “Current test results” folder to store the new results.
4.	Create multiple testing.xml file e.g., implement parallel execution, grouping, listeners etc
5.	The tests should be runnable from command line
6.	Add Readme file to the project with proper instructions to be followed for setup and execution
7.	Create at least one test using Data provider. 
8.	Logging in the framework level using log4j  

