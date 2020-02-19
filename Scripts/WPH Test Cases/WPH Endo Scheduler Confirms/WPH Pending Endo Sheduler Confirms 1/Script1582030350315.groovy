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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://patch-stage.medtel.com/login')

WebUI.click(findTestObject('Page_MedTel/div_Email'))

WebUI.setText(findTestObject('Page_MedTel/input_Email_email'), 'lestrada@wphospital.org')

WebUI.setEncryptedText(findTestObject('Page_MedTel/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/button_Pending Endo Scheduler0'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/button_'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/button_'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/button__1'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MedTel/button__1_2'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/abbr_31'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/th_0900 amJohn Smith09101990Robert Antonell_0084be'))

WebUI.click(findTestObject('Page_MedTel/div_Scheduling'))

WebUI.click(findTestObject('Page_MedTel/div_Schedule Confirmed'))

WebUI.click(findTestObject('Page_MedTel/div_Schedule Confirmed'))

WebUI.click(findTestObject('Page_MedTel/div_Schedule Confirmed'))

WebUI.click(findTestObject('Page_MedTel/div_Schedule Confirmed'))

WebUI.click(findTestObject('Page_MedTel/div_Schedule Confirmed'))

WebUI.click(findTestObject('Page_MedTel/div_Schedule Confirmed'))

WebUI.click(findTestObject('Page_MedTel/div_Schedule Confirmed'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/button_Amend Case'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Schedule Confirmed_jss1332'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Confirmed'))

WebUI.setText(findTestObject('Page_MedTel/input__SCH-RM'), '22')

WebUI.click(findTestObject('Page_MedTel/div_Implants and Products'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Implants and ProductsImplant Data and P_9d9ef9'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/label_Confirm Products Added'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/label_Confirm Products Added'))

WebUI.click(findTestObject('Page_MedTel/button_Save Case'))

WebUI.closeBrowser()

