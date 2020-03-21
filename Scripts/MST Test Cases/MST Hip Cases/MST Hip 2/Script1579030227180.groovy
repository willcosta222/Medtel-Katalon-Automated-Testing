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

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'cathys@comcllc.com')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Login'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_New Case'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PD-FN'), 'Jane')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PD-LN'), 'Doe')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PD-DOB'), '04/08/1987')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Surgeon_jss835'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Daigneault (Stage-MS) John'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Site_jss835'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Hip'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Create Case'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Gender_jss1046'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_F'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_State_jss1046'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_State'), 'New York')

WebUI.click(findTestObject('Page_MedTel/States/div_New York'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ADD1'), '123 Address')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-CITY'), 'New York')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ZIP'), '10016')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-MOB'), '(555) 555-5555')

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__jss1069'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-HOME'), '(333) 333-3334')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Language_jss1046'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Primary Language_react-select-8-input'), 'spanish')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Spanish'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Feet_css-amjubi-indicatorContainer'))

WebUI.click(findTestObject('Page_MedTel/Height and Weight/Height-Feet Drop Down Menu/div_5_feet'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Inches_css-amjubi-indicatorContainer'))

WebUI.click(findTestObject('Page_MedTel/Height and Weight/Height-inches Drop Down Menu/div_5_inches'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Financial'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/MST Insurance/div_Insurance Type_MST'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_MEDEX'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-PRIM-MED-POL-INS-NAME'), 'TEST')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-PRIM-MED-POL-NUM'), '1234')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Insurance Authorization Provided_jss1046'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_Yes'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-PRIM-MED-POL-AUTH-NUM'), '11111')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Does Patient have Secondary Insurance_jss1046'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_No'))

WebUI.click(findTestObject('Page_MedTel/SVGs/svg_Financial_jss915'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_MidState Medical Center'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-CPT'), '2713')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_27130 - Arthroplasty acetabular and pro_dd70c6'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-DS'), 'm25.55')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_M25551 - PAIN IN RIGHT HIP'))

WebUI.click(findTestObject('Page_MedTel/Hip Laterality/div_Laterality'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Right'))

WebUI.click(findTestObject('Page_MedTel/Anesthesia Type/Input_Anesthesia'))

WebUI.click(findTestObject('Page_MedTel/Anesthesia Type/div_General'))

WebUI.click(findTestObject('Page_MedTel/Anesthesia Type/Input_Anesthesia'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Regional'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Admission Type'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Surgery Admit'))

WebUI.click(findTestObject('Page_MedTel/SVGs/svg_Procedure Details_jss915'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__SCH-TIME'), '09:00 AM')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Implants and Products'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'bir')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_BIRMINGHAM HIP Resurfacing (BHR) System_ead24b'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Confirm Implants Added'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__IMP-MONITOR'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Fluoroscopy - Stryker - Jessa Camacho (_0c7e19'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_MAKO Robotic Arm Orthopedic System - St_d80eb8'))

WebUI.click(findTestObject('Page_MedTel/SVGs/svg_Implants and Products_jss915'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-FN'), 'Tom')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-LN'), 'Jones')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-PN'), '(222) 222-2222')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Pre-admission Testing at Midstate Medic_59e47d'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Pre-admission Testing at Midstate Medic_59e47d'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Pre-admission Testing at Midstate Med_b81e24'), 'no')

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_No'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-MED-FN'), 'tony')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-MED-LN'), 'Stark')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-MED-PN'), '(444) 444-4444')

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.closeBrowser()

