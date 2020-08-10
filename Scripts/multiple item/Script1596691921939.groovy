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

WebUI.click(findTestObject('multiple purchase/Page_veggiekart  myveggiekart/a_LogIn'))

WebUI.setText(findTestObject('multiple purchase/Page_Account  myveggiekart/input_Email_customeremail'), 'jithin@mailinator.com')

WebUI.setText(findTestObject('multiple purchase/Page_Account  myveggiekart/input_Password_customerpassword'), '12345678')

WebUI.click(findTestObject('multiple purchase/Page_Account  myveggiekart/input_Password_btn'))

WebUI.click(findTestObject('multiple purchase/Page_Account  myveggiekart/a_Category'))

WebUI.click(findTestObject('multiple purchase/Page_Account  myveggiekart/a_Vegetables'))

WebUI.click(findTestObject('multiple purchase/Page_Vegetables  myveggiekart/div_Add to cart'))

WebUI.click(findTestObject('multiple purchase/Page_Vegetables  myveggiekart/img_ 4 piece_productFeaturedImage-collection-template--31807496394'))

WebUI.click(findTestObject('multiple purchase/Page_Green Banana  Kachcha Kela  Kancha Kadali  myveggiekart/button_Add to Cart'))

WebUI.click(findTestObject('multiple purchase/Page_Your Shopping Cart  myveggiekart/a_Continue Shopping'))

WebUI.click(findTestObject('multiple purchase/Page_Products  myveggiekart/a_Cart 2'))

WebUI.setText(findTestObject('single product/Page_Your Shopping Cart  myveggiekart/input_Shipping taxes and discounts will be calculated at checkout_checkPin'), 
    '751007')

WebUI.click(findTestObject('single product/Page_Your Shopping Cart  myveggiekart/button_Check'))

WebUI.click(findTestObject('single product/Page_Your Shopping Cart  myveggiekart/button_Checkout'))

