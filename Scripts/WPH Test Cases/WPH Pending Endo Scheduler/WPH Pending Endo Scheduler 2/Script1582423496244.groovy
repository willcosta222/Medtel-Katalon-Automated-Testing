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

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'mbravo@wphospital.org')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Login'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_New Case'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-FN'), 'Jane')

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-LN'), 'Doe')

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-DOB'), '04/08/1987')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Proceduralist_jss707'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Antonelle (Stage-WPH) Robert'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_ENDO'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_ENDO_1'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Create Case'))

GlobalVariable.CaseNumber = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Number'))

GlobalVariable.CaseDate = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Date'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Gender'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_F'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_State_jss1024'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_State_react-select-9-input'), 'new york')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_New York'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ADD1'), '123 address')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-CITY'), 'new york')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ZIP'), '10016')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-MOB'), '(555) 555-5555')

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__jss1047'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-HOME'), '(333) 333-3334')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Language_jss1024'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Primary Language_react-select-7-input'), 'spanish')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Spanish'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Patient has special needs_jss1024'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_Yes'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__SN-SPECIAL-NEEDS-OPTS'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Group home'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__SN-SPECIAL-NEEDS-OPTS'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Hearing impaired'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Financial'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_Insurance Type_jss1024'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_MEDEX'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-PRIM-MED-POL-NUM'), '1234')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Insurance Authorization Required_jss1024'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_Yes_Insurance Authorization Required'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-PRIM-MED-POL-AUTH-NUM'), '111111')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Does Patient have Secondary Insurance_jss1024'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_Yes_Does Patient Have Secondary Insurance'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_ option AUTO INSURANCE focused 1 of 8 8_d9b649'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_SELF PAY'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Procedure Location_jss1024'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_White Plains Hospital'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-PROD (1)'), 'flexible ')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Flexible Sigmoidoscopy'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-PROD (1)'), 'dilation')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Dilation'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_ProcedureProcedureFlexible Sigmoidoscop_9ce48d'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '45379')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_45379 - Colonoscopy flexible with remov_2df904'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '45340')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_45340 - Sigmoidoscopy flexible with tra_50b2a3'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-DS'), 'k63.5')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_K635 - POLYP OF COLON'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-DS'), 'd12.6')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_D126 - BENIGN NEOPLASM OF COLON UNSPECIFIED'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__jss988 jss1131'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_MAC'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Admission Type_jss1024'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Inpatient'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-ADM-FLOOR'), '1')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Admission Bed_jss1024'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Procedure to be done in OR'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Scheduling'))

WebUI.click(findTestObject('Page_MedTel/Schedule/input__SCH-TIME (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-TIME (1)'), '09:00 AM')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Implants and Products'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'), 'ercp scope')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_ERCP Scope - Olympus Medical'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'), 'mini probe')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Mini Probe - Olympus Medical'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'), 'spy glass')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_SPY Glass - Olympus Medical'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/label_Confirm Products Added'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Clinical'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-FN'), 'Tom')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-LN'), 'Jones')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-PN'), '(222) 222-2222')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Medical Clearance Required_jss1314'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_Yes_Medical Clearance Required'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-MED-FN'), 'Tony')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-MED-LN'), 'Stark')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-MED-PN'), '(444) 444-4444')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Cardiac Clearance Required_jss1314'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_Yes_Cardiac Clearance Required'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-CARD-FN'), 'Will')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-CARD-LN'), 'Smith')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-CARD-PN'), '(777) 777-7777')

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.closeBrowser()

