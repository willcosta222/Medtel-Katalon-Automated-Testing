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

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'jeffreyp@comcllc.com')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Login'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_New Case'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-FN'), 'Jane')

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-LN'), 'Doe')

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-DOB'), '04/08/1987')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Surgeon_jss803'))

WebUI.click(findTestObject('Page_MedTel/Primary Surgeon -Surgical Location/MST Primary Surgeons/div_Pravda (Stage-MS) Jeffrey'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Site_jss803'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Site_react-select-3-input'), 'SPine')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Spine'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Create Case'))

GlobalVariable.CaseNumber = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Number'))

GlobalVariable.CaseDate = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Date'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Gender_jss1014'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_F'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_State_jss1014'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_State'), 'new york')

WebUI.click(findTestObject('Object Repository/Page_MedTel/States/div_New York'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ADD1'), '123 address')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-CITY'), 'new york')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ZIP'), '10016')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-MOB'), '(555) 555-5555')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Financial'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Insurance Types/MST Insurance/div_Insurance Type_MST'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_MEDEX'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-PRIM-MED-POL-INS-NAME'), 'test insurance name')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Insurance NamePolicy NumberInsurance Au_032d92'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-PRIM-MED-POL-NUM'), '1234')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Insurance Authorization Provided_jss1014'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Yes-No Options/div_No'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Does Patient have Secondary Insurance_jss1014'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Yes-No Options/div_Yes'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Insurance_Second_Type_MST'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_SELF PAY'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_MidState Medical Center'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/Input surgical assistance'), 'shia')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Shia (Stage-MS) Derek - Orthopedics'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '22558')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_22558 - Arthrodesis anterior interbody _852ab9'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-DS'), 's32')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_S32 - FRACTURE OF LUMBAR SPINE AND PELVIS'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Anesthesia Type/Input_Anesthesia'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Anesthesia Type/div_Spinal'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Admission Type'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Outpatient (Same Day)'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Scheduling'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-TIME (1)'), '10:00 aM')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Implants and Products'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Implant Type_jss1014'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Fixation'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'cd horizon lega')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_CD Horizon Legacy 55 Spinal System - Me_816944'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_From_jss1014'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C1'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_To_jss1014'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C3'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Add Implant'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Confirm Implants Added'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Clinical'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Pre-admission Testing at Midstate Medic_8aeb6d'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Yes-No Options/div_No'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-MED-FN'), 'Tony')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-MED-LN'), 'Stark')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-MED-PN'), '(444) 444-4444')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Save Case'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/button_UserName'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/div_Logout'))

WebUI.closeBrowser()

