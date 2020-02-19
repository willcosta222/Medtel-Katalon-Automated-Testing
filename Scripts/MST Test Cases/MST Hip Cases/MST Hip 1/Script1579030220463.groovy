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

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input_Email_email'), 'cathys@comcllc.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MedTel/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Object Repository/Page_MedTel/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/img_Rene Faticone (Stage-MS)_jss360'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_New Case'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PD-FN'), 'John')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PD-LN'), 'Smith')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PD-DOB'), '09/10/1990')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Primary Surgeon_jss835'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Daigneault (Stage-MS) John'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Site_jss835'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input_Site_react-select-3-input'), 'hip')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Hip'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Create Case'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Gender_jss1046'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_M'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/input__CONT-ADD1'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_State_jss1046'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input_State_react-select-10-input'), 'New York')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_New York'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__CONT-ADD1'), '123 Address')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__CONT-CITY'), 'New York')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__CONT-ZIP'), '10016')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__CONT-MOB'), '(555) 555-5555')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__CONT-EMAIL'), 'test@yahoo.com')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Primary Language_jss1046'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input_Primary Language_react-select-8-input'), 'english')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_English'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Feet_css-amjubi-indicatorContainer'))

WebUI.click(findTestObject('Page_MedTel/Height-Feet Drop Down Menu/div_5_feet'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Inches_css-amjubi-indicatorContainer'))

WebUI.click(findTestObject('Page_MedTel/Height-inches Drop Down Menu/div_9_inches'))

WebUI.click(findTestObject('Page_MedTel/div_Financial'))

WebUI.click(findTestObject('Page_MedTel/div_Insurance Type_MST'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_SELF PAY'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Does Patient have Secondary Insurance_jss1046'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_No'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Procedure Details'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Surgical Location'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_MidState Medical Center'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Input surgical assistance'))

WebUI.setText(findTestObject('Page_MedTel/Input surgical assistance'), 'shia')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Shia (Stage-MS) Derek - Orthopedics'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PRD-CPT'), '27130')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_27130 - Arthroplasty acetabular and pro_dd70c6'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PRD-DS'), 'm25.551')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_M25551 - PAIN IN RIGHT HIP'))

WebUI.click(findTestObject('Page_MedTel/div_Laterality'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Left'))

WebUI.click(findTestObject('Page_MedTel/Input_Anesthesia'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_General'))

WebUI.click(findTestObject('Page_MedTel/div_Admission Type'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Surgery Admit'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Scheduling'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__SCH-TIME'), '09:00 AM')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Implants and Products'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/input__IMP-DESC'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Accolade II Femoral Hip Stem - Stryker _284249'))

WebUI.click(findTestObject('Page_MedTel/span_Confirm Implants Added'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Clinical'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PRE-OP-PHY-FN'), 'Tom')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PRE-OP-PHY-LN'), 'Jones')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PRE-OP-PHY-PN'), '(222) 222-2222')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Pre-admission Testing at Midstate Medic_59e47d'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Yes'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/button_Save Case'))

WebUI.closeBrowser()

