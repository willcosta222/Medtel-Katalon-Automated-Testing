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

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'mbravo@wphospital.org')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Login'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_New Case'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-FN'), 'John')

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-LN'), 'Smith')

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-DOB'), '09/10/1990')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Proceduralist_jss707'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Antonelle (Stage-WPH) Robert'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_ENDO'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_ENDO_1'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Create Case'))

GlobalVariable.CaseNumber = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Number'))

GlobalVariable.CaseDate = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Date'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Gender'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_M'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_State_jss1024'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_State_react-select-9-input'), 'New York')

WebUI.click(findTestObject('Page_MedTel/States/div_New York'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ADD1'), '123 Address')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-CITY'), 'New York')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ZIP'), '10016')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-MOB'), '(555) 555-5555')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Language'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Language_jss1024'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Primary Language_react-select-7-input'), 'english')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_English'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Patient has special needs_jss1024'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_No'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Financial'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_Insurance Type_jss1024'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_SELF PAY'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Does Patient have Secondary Insurance_jss1024'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_No_INS-HAS-SEC-INS'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Procedure Location_jss1024'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_White Plains Hospital'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-PROD (1)'), '')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Colonoscopy'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '45379')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_45379 - Colonoscopy flexible with remov_2df904'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-DS'), 'k63.5')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_K635 - POLYP OF COLON'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__jss988 jss1100'))

WebUI.click(findTestObject('Page_MedTel/Anesthesia Type/div_General'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Admission Type_jss1024'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Outpatient'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Scheduling'))

WebUI.click(findTestObject('Page_MedTel/Schedule/input__SCH-TIME (1)'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-TIME (1)'), '09:00 AM')

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PRD-LENGTH'), '90')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Implants and Products'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'), 'c-arm')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_C-Arm - Olympus Medical'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'), 'barrx')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_BARRX Radio Ablation - Olympus Medical'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/label_Confirm Products Added'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Clinical'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-FN'), 'Tom')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-LN'), 'Jones')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-PN'), '(222) 222-2222')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Medical Clearance Required_jss1262'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_No_Medical Clearance Required (1)'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Cardiac Clearance Required_jss1262'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_No_Cardiac Clearance Required'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.closeBrowser()

System.out.println(GlobalVariable.CaseNumber)
System.out.println(GlobalVariable.CaseDate)


