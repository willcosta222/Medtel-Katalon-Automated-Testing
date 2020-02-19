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

WebUI.setText(findTestObject('Page_MedTel/input__PD-FN'), 'Samantha')

WebUI.setText(findTestObject('Page_MedTel/input__PD-LN'), 'Jones')

WebUI.setText(findTestObject('Page_MedTel/input__PD-DOB'), '10/03/1950')

WebUI.click(findTestObject('Page_MedTel/div_Primary Surgeon_jss803'))

WebUI.click(findTestObject('Page_MedTel/div_Daigneault (Stage-MS) John'))

WebUI.setText(findTestObject('Page_MedTel/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/div_Site_jss803'))

WebUI.setText(findTestObject('Page_MedTel/input_Site_react-select-3-input'), 'spine')

WebUI.click(findTestObject('Page_MedTel/div_Spine'))

WebUI.click(findTestObject('Page_MedTel/button_Create Case'))

WebUI.click(findTestObject('Page_MedTel/div_Gender_jss1014'))

WebUI.click(findTestObject('Page_MedTel/div_F'))

WebUI.click(findTestObject('Page_MedTel/div_State_jss1014'))

WebUI.setText(findTestObject('Page_MedTel/input_State_react-select-10-input'), 'new york')

WebUI.click(findTestObject('Page_MedTel/div_New York'))

WebUI.setText(findTestObject('Page_MedTel/input__CONT-ADD1'), '123 address')

WebUI.setText(findTestObject('Page_MedTel/input__CONT-CITY'), 'new york')

WebUI.setText(findTestObject('Page_MedTel/input__CONT-ZIP'), '10016')

WebUI.setText(findTestObject('Page_MedTel/input__CONT-MOB'), '(555) 555-5555')

WebUI.click(findTestObject('Page_MedTel/div_Financial'))

WebUI.click(findTestObject('Page_MedTel/div_Insurance Type_MST'))

WebUI.click(findTestObject('Page_MedTel/div_SELF PAY'))

WebUI.click(findTestObject('Page_MedTel/div_Does Patient have Secondary Insurance_jss1014'))

WebUI.click(findTestObject('Page_MedTel/div_No'))

WebUI.click(findTestObject('Page_MedTel/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/div_MidState Medical Center'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-CPT'), '22558')

WebUI.click(findTestObject('Page_MedTel/div_22558 - Arthrodesis anterior interbody _852ab9'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-DS'), 's32')

WebUI.click(findTestObject('Page_MedTel/div_S32 - FRACTURE OF LUMBAR SPINE AND PELVIS'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-DS'), 's33')

WebUI.click(findTestObject('Page_MedTel/div_S33 - DISLOCATION AND SPRAIN OF JOINTS _e012c9'))

WebUI.click(findTestObject('Page_MedTel/Input_Anesthesia'))

WebUI.click(findTestObject('Page_MedTel/div_Spinal'))

WebUI.click(findTestObject('Page_MedTel/div_Admission Type'))

WebUI.click(findTestObject('Page_MedTel/div_Surgery Admit'))

WebUI.click(findTestObject('Page_MedTel/div_Scheduling'))

WebUI.setText(findTestObject('Page_MedTel/input__SCH-TIME'), '11:30 aM')

WebUI.click(findTestObject('Page_MedTel/div_Implants and Products'))

WebUI.click(findTestObject('Page_MedTel/div_Implant Type_jss1014'))

WebUI.click(findTestObject('Page_MedTel/div_No Implant Required'))

WebUI.click(findTestObject('Page_MedTel/div_Approach_Spine'))

WebUI.click(findTestObject('Page_MedTel/div_Posterior'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Laterality'))

WebUI.click(findTestObject('Page_MedTel/div_Left'))

WebUI.click(findTestObject('Page_MedTel/div_From_jss1014'))

WebUI.setText(findTestObject('Page_MedTel/input_From_react-select-25-input'), 'l5')

WebUI.click(findTestObject('Page_MedTel/div_L5'))

WebUI.click(findTestObject('Page_MedTel/div_To_jss1014'))

WebUI.click(findTestObject('Page_MedTel/div_S1'))

WebUI.click(findTestObject('Page_MedTel/button_Add Implant'))

WebUI.click(findTestObject('Page_MedTel/span_Confirm Implants Added'))

WebUI.click(findTestObject('Page_MedTel/div_Clinical'))

WebUI.setText(findTestObject('Page_MedTel/input__PRE-OP-PHY-FN'), 'tom')

WebUI.setText(findTestObject('Page_MedTel/input__PRE-OP-PHY-LN'), 'jones')

WebUI.setText(findTestObject('Page_MedTel/input__PRE-OP-PHY-PN'), '(222) 222-2222')

WebUI.click(findTestObject('Page_MedTel/div_Pre-admission Testing at Midstate Medic_8aeb6d'))

WebUI.click(findTestObject('Page_MedTel/div_No'))

WebUI.setText(findTestObject('Page_MedTel/input__PRE-OP-MED-FN'), 'tony')

WebUI.setText(findTestObject('Page_MedTel/input__PRE-OP-MED-LN'), 'stark')

WebUI.setText(findTestObject('Page_MedTel/input__PRE-OP-MED-PN'), '(444) 444-4444')

WebUI.click(findTestObject('Page_MedTel/button_Save Case'))

WebUI.closeBrowser()
