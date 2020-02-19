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

WebUI.setText(findTestObject('Page_MedTel/input_Email_email'), 'mbravo@wphospital.org')

WebUI.setEncryptedText(findTestObject('Page_MedTel/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span_Login'))

WebUI.click(findTestObject('Page_MedTel/button_New Case'))

WebUI.setText(findTestObject('Page_MedTel/input__PD-FN'), 'John')

WebUI.setText(findTestObject('Page_MedTel/input__PD-LN'), 'Smith')

WebUI.setText(findTestObject('Page_MedTel/input__PD-DOB'), '09/10/1990')

WebUI.click(findTestObject('Page_MedTel/div_Primary Proceduralist_jss707'))

WebUI.click(findTestObject('Page_MedTel/div_Antonelle (Stage-WPH) Robert'))

WebUI.setText(findTestObject('Page_MedTel/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/div_ENDO'))

WebUI.click(findTestObject('Page_MedTel/div_ENDO_1'))

WebUI.click(findTestObject('Page_MedTel/button_Create Case'))

WebUI.click(findTestObject('Page_MedTel/div_Gender'))

WebUI.click(findTestObject('Page_MedTel/div_M'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_State_jss1024'))

WebUI.setText(findTestObject('Page_MedTel/input_State_react-select-9-input'), 'New York')

WebUI.click(findTestObject('Page_MedTel/div_New York'))

WebUI.setText(findTestObject('Page_MedTel/input__CONT-ADD1'), '123 Address')

WebUI.setText(findTestObject('Page_MedTel/input__CONT-CITY'), 'New York')

WebUI.setText(findTestObject('Page_MedTel/input__CONT-ZIP'), '10016')

WebUI.setText(findTestObject('Page_MedTel/input__CONT-MOB'), '(555) 555-5555')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Primary Language'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Primary Language_jss1024'))

WebUI.setText(findTestObject('Page_MedTel/input_Primary Language_react-select-7-input'), 'english')

WebUI.click(findTestObject('Page_MedTel/div_English'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Patient has special needs_jss1024'))

WebUI.click(findTestObject('Page_MedTel/div_No'))

WebUI.click(findTestObject('Page_MedTel/span_Financial'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Insurance Type_jss1024'))

WebUI.click(findTestObject('Page_MedTel/div_SELF PAY'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Does Patient have Secondary Insurance_jss1024'))

WebUI.click(findTestObject('Page_MedTel/div_No_1'))

WebUI.click(findTestObject('Page_MedTel/div_Procedure Details'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Procedure Location_jss1024'))

WebUI.click(findTestObject('Page_MedTel/div_White Plains Hospital'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-PROD'), '')

WebUI.click(findTestObject('Page_MedTel/div_Colonoscopy'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-CPT'), '45379')

WebUI.click(findTestObject('Page_MedTel/div_45379 - Colonoscopy flexible with remov_2df904'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-DS'), 'k63.5')

WebUI.click(findTestObject('Page_MedTel/div_K635 - POLYP OF COLON'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/input__jss988 jss1100'))

WebUI.click(findTestObject('Page_MedTel/div_General'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Admission Type_jss1024'))

WebUI.click(findTestObject('Page_MedTel/div_Outpatient'))

WebUI.click(findTestObject('Page_MedTel/div_Scheduling'))

WebUI.setText(findTestObject('Page_MedTel/input__SCH-TIME'), '09:00 aM')

WebUI.setText(findTestObject('Page_MedTel/input__SCH-PRD-LENGTH'), '90')

WebUI.click(findTestObject('Page_MedTel/div_Implants and Products'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-ANC'), 'c-arm')

WebUI.click(findTestObject('Page_MedTel/div_C-Arm - Olympus Medical'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-ANC'), 'barrx')

WebUI.click(findTestObject('Page_MedTel/div_BARRX Radio Ablation - Olympus Medical'))

WebUI.click(findTestObject('Page_MedTel/label_Confirm Products Added'))

WebUI.click(findTestObject('Page_MedTel/div_Clinical'))

WebUI.setText(findTestObject('Page_MedTel/input__PRE-OP-PHY-FN'), 'Tom')

WebUI.setText(findTestObject('Page_MedTel/input__PRE-OP-PHY-LN'), 'Jones')

WebUI.setText(findTestObject('Page_MedTel/input__PRE-OP-PHY-PN'), '(222) 222-2222')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Medical Clearance Required_jss1262'))

WebUI.click(findTestObject('Page_MedTel/div_No_Medical Clearance Required'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Cardiac Clearance Required_jss1262'))

WebUI.click(findTestObject('Page_MedTel/div_No_Cardiac Clearance Required'))

WebUI.click(findTestObject('Page_MedTel/button_Save Case'))

WebUI.closeBrowser()

