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

WebUI.navigateToUrl('https://stage.medtel.com/login')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'jkuehl@ct-ortho.com')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Login'))

CustomKeywords.'medtel.utilities.utilities.medtelfindCalendarDate'(GlobalVariable.CaseDate)

CustomKeywords.'medtel.utilities.utilities.medtelfindCase'(GlobalVariable.CaseNumber, true)

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Amend Case'))

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/Demographics/input__PD-MN'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-MN'), 'James')

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/Demographics/input__PD-MRN'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-MRN'), '1234')

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/INPUTS/input__SN-F-NUMBER'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__SN-F-NUMBER'), '1234')

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/INPUTS/input__CONT-ADD1'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ADD1'), '456 Main St')

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/INPUTS/input__CONT-ADD2'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ADD2'), 'APT 4A')

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/INPUTS/input__CONT-CITY'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-CITY'), 'Greenwich')

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/INPUTS/input__CONT-ZIP'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ZIP'), '06870')

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/INPUTS/input__CONT-HOME'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-HOME'), '(777) 777-7777')

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/INPUTS/input__CONT-EMAIL'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-EMAIL'), 'test@gmail.com')

CustomKeywords.'medtel.utilities.utilities.inputHeight'('6', '0')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_'))

WebUI.setText(findTestObject('Page_MedTel/span-p-li-misc/textarea__ANE-NOTES'), 'ANESTHESIA TEST')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_'))

WebUI.setText(findTestObject('Page_MedTel/span-p-li-misc/textarea__PRD-NOTE'), 'PROCEDURE TEST')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Scheduling'))

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/Schedule/input__SCH-PD'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PD'), '01/31/2021')

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-TIME (1)'), '10:00 AM')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__SCH-AD-DT'), '12/31/2020')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__SCH-COMMENTS'), 'SCHEDULING TEST')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__SCH-HOSPITAL-COMMENTS'), 'HOSPITAL SCHEDULING TEST')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Clinical'))

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-FN'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-FN'), 'Bob')

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-LN'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-LN'), 'Johnson')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Care First NamePrimary Care Las_6407b8'))

CustomKeywords.'medtel.utilities.utilities.clearTextField'(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-PN'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-PN'), '(333) 333-3333')

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.closeBrowser()

