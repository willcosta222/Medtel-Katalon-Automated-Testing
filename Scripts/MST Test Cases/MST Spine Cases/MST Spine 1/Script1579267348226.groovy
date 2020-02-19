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

WebUI.setText(findTestObject('Page_MedTel/input_Email_email'), 'cathys@comcllc.com')

WebUI.setEncryptedText(findTestObject('Page_MedTel/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.sendKeys(findTestObject('Page_MedTel/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_MedTel/span_New Case'))

WebUI.setText(findTestObject('Page_MedTel/input__PD-FN'), 'John')

WebUI.setText(findTestObject('Page_MedTel/input__PD-LN'), 'Smith')

WebUI.setText(findTestObject('Page_MedTel/input__PD-DOB'), '09/10/1990')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Primary Surgeon_jss803'))

WebUI.click(findTestObject('Page_MedTel/div_Daigneault (Stage-MS) John'))

WebUI.setText(findTestObject('Page_MedTel/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/div_Site_jss803'))

WebUI.setText(findTestObject('Page_MedTel/input_Site_react-select-3-input'), 'spine')

WebUI.click(findTestObject('Page_MedTel/div_Spine'))

WebUI.click(findTestObject('Page_MedTel/span_Create Case'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Gender_jss1014'))

WebUI.click(findTestObject('Page_MedTel/div_M'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_State_jss1014'))

WebUI.setText(findTestObject('Page_MedTel/input_State_react-select-10-input'), 'new york')

WebUI.click(findTestObject('Page_MedTel/div_New York'))

WebUI.setText(findTestObject('Page_MedTel/input__CONT-ADD1'), '123 adress')

WebUI.setText(findTestObject('Page_MedTel/input__CONT-CITY'), 'new york')

WebUI.setText(findTestObject('Page_MedTel/input__CONT-ZIP'), '10016')

WebUI.setText(findTestObject('Page_MedTel/input__CONT-MOB'), '(555) 555-5555')

WebUI.click(findTestObject('Page_MedTel/div_Financial'))

WebUI.click(findTestObject('Page_MedTel/div_Insurance Type_MST'))

WebUI.click(findTestObject('Page_MedTel/div_SELF PAY'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Does Patient have Secondary Insurance_jss1014'))

WebUI.click(findTestObject('Page_MedTel/div_No'))

WebUI.click(findTestObject('Page_MedTel/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/div_MidState Medical Center'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-CPT'), '22558')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_22558 - Arthrodesis anterior interbody _852ab9'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-DS'), 's32')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_S32 - FRACTURE OF LUMBAR SPINE AND PELVIS'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-DS'), 's33')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_S33 - DISLOCATION AND SPRAIN OF JOINTS _e012c9'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_CPT CodesCPT Codes22558 - Arthrodesis a_25b174'))

WebUI.click(findTestObject('Page_MedTel/Input_Anesthesia'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Spinal'))

WebUI.click(findTestObject('Page_MedTel/div_Admission Type'))

WebUI.click(findTestObject('Page_MedTel/div_Surgery Admit'))

WebUI.click(findTestObject('Page_MedTel/div_Scheduling'))

WebUI.setText(findTestObject('Page_MedTel/input__SCH-TIME'), '09:00 aM')

WebUI.click(findTestObject('Page_MedTel/div_Implants and Products'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Implant Type_jss1014'))

WebUI.click(findTestObject('Page_MedTel/div_Fixation'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-DESC'), 'cd horizon legacy 5.5 ')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_CD Horizon Legacy 55 Spinal System - Me_816944'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_From_jss1014'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_C1'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_To_jss1014'))

WebUI.click(findTestObject('Page_MedTel/div_C3'))

WebUI.click(findTestObject('Page_MedTel/button_Add Implant'))

WebUI.click(findTestObject('Page_MedTel/span_Confirm Implants Added'))

WebUI.click(findTestObject('Page_MedTel/div_Clinical'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Pre-admission Testing at Midstate Medic_8aeb6d'))

WebUI.click(findTestObject('Page_MedTel/div_Yes'))

WebUI.click(findTestObject('Page_MedTel/button_Save Case'))

WebUI.closeBrowser()

