import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://myveggiekart.com/')

WebUI.click(findTestObject('single product/Page_veggiekart  myveggiekart/a_LogIn'))

WebUI.click(findTestObject('single product/Page_Account  myveggiekart/input_Email_customeremail'))

WebUI.setText(findTestObject('single product/Page_Account  myveggiekart/input_Email_customeremail'), 'jithin@mailinator.com')

WebUI.click(findTestObject('single product/Page_Account  myveggiekart/input_Password_customerpassword'))

WebUI.setText(findTestObject('single product/Page_Account  myveggiekart/input_Password_customerpassword'), '12345678')

WebUI.click(findTestObject('single product/Page_Account  myveggiekart/input_Password_btn'))

WebUI.click(findTestObject('single product/Page_Account  myveggiekart/a_Category'))

WebUI.click(findTestObject('single product/Page_Account  myveggiekart/a_Fruits'))

WebUI.click(findTestObject('single product/Page_Fruits  myveggiekart/div_Add to cart'))

WebUI.click(findTestObject('single product/Page_Fruits  myveggiekart/div_1'))

WebUI.click(findTestObject('single product/Page_Your Shopping Cart  myveggiekart/input_Shipping taxes and discounts will be calculated at checkout_checkPin'))

WebUI.setText(findTestObject('single product/Page_Your Shopping Cart  myveggiekart/input_Shipping taxes and discounts will be calculated at checkout_checkPin'), 
    '751007')

WebUI.click(findTestObject('single product/Page_Your Shopping Cart  myveggiekart/button_Check'))

WebUI.click(findTestObject('single product/Page_Your Shopping Cart  myveggiekart/button_Checkout'))

WebUI.closeBrowser()

