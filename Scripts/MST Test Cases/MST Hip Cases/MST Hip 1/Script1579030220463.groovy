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

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'Shirley.Warner@hhchealth.org')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Login'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_New Case'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-FN'), 'John')

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-LN'), 'Smith')

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-DOB'), '09/10/1990')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Surgeon_jss835'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Daigneault (Stage-MS) John'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Site_jss835'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Site_react-select-3-input'), 'hip')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Hip'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Create Case'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Gender_jss1046'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_M'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__CONT-ADD1'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_State_jss1046'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_State'), 'New York')

WebUI.click(findTestObject('Object Repository/Page_MedTel/States/div_New York'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ADD1'), '123 Address')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-CITY'), 'New York')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ZIP'), '10016')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-MOB'), '(555) 555-5555')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-EMAIL'), 'test@yahoo.com')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Language_jss1046'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_English'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__Height Feet'), '5')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__Height Inches'), '9')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Financial'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Insurance Types/MST Insurance/div_Insurance Type_MST'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_SELF PAY'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Does Patient have Secondary Insurance_jss1046'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Yes-No Options/div_No_INS-HAS-SEC-INS'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_MidState Medical Center'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/Input surgical assistance'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/Input surgical assistance'), 'shia')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Shia (Stage-MS) Derek - Orthopedics'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '27130')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_27130 - Arthroplasty acetabular and pro_dd70c6'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-DS'), 'm25.551')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_M25551 - PAIN IN RIGHT HIP'))

WebUI.click(findTestObject('Page_MedTel/Procedure/Hip Laterality/div_Laterality'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Left'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Anesthesia Type/Input_Anesthesia'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Anesthesia Type/div_General'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Admission Type'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Surgery Admit'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Scheduling'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-TIME (1)'), '09:00 AM')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Implants and Products'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Accolade II Femoral Hip Stem - Stryker _284249'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Confirm Implants Added'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Clinical'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-FN'), 'Tom')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-LN'), 'Jones')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-PN'), '(222) 222-2222')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Pre-admission Testing at Midstate Medic_59e47d'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Yes-No Options/div_Yes'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.closeBrowser()

