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

WebUI.navigateToUrl('https://patch-stage.medtel.com/login')

WebUI.click(findTestObject('Object Repository/Page_MedTel/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input_Email_email'), 'mbravo@wphospital.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MedTel/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_New Case'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PD-FN'), 'John')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PD-LN'), 'Smith')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PD-DOB'), '09/10/1990')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Primary Proceduralist_jss707'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Antonelle (Stage-WPH) Robert'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_ENDO'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_ENDO_1'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/button_Create Case'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Clinical'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Medical Clearance Required_jss1348'))

WebUI.click(findTestObject('Page_MedTel/div_No_Medical Clearance Required'))

