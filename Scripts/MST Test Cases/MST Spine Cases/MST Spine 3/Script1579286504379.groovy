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

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'cathys@comcllc.com')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Login'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_New Case'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-FN'), 'Tim')

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-LN'), 'Cook')

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-DOB'), '07/03/1990')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Surgeon_jss803'))

WebUI.click(findTestObject('Page_MedTel/Primary Surgeon -Surgical Location/MST Primary Surgeons/div_Pravda (Stage-MS) Jeffrey'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Site_jss803'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Site_react-select-3-input'), 'spine')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Spine'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Create Case'))

GlobalVariable.CaseNumber = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Number'))

GlobalVariable.CaseDate = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Date'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_First NameMiddle NameLast NameDate Of B_4e1c68'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Gender_jss1014'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_M'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_State_jss1014'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_State'), 'new york')

WebUI.click(findTestObject('Object Repository/Page_MedTel/States/div_New York'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ADD1'), '123 address')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-CITY'), 'new york')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-ZIP'), '10016')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__CONT-MOB'), '(555) 555-5555')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Financial'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Insurance Types/MST Insurance/div_Insurance Type_MST'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Insurance Types/div_SELF PAY'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Does Patient have Secondary Insurance_jss1014'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Yes-No Options/div_No'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_MidState Medical Center'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '22558')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_22558 - Arthrodesis anterior interbody _852ab9'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-DS'), 's32')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_S32 - FRACTURE OF LUMBAR SPINE AND PELVIS'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-DS'), 's33')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_S33 - DISLOCATION AND SPRAIN OF JOINTS _e012c9'))

WebUI.click(findTestObject('Page_MedTel/Patient Positions NYU and MST Spine/Patient Position 1 Spine'))

WebUI.click(findTestObject('Page_MedTel/Patient Positions NYU and MST Spine/Patient_Position_Prone'))

WebUI.click(findTestObject('Page_MedTel/Patient Positions NYU and MST Spine/Bed Type 1 Spine'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/li_STILLE AB imagiQ'))

CustomKeywords.'medtel.utilities.utilities.addPositionBedType'(findTestObject('Page_MedTel/Patient Positions NYU and MST Spine/Patient_Position_Supine'), 
    findTestObject('Page_MedTel/span-p-li-misc/li_Maquet Meera Mobile Operating Table'), '2')

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__jss978 jss1084'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Anesthesia Type/Input_Anesthesia'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_General'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Admission Type'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Outpatient (Same Day)'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Scheduling'))

WebUI.click(findTestObject('Page_MedTel/Schedule/input__SCH-TIME (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-TIME (1)'), '10:30 AM')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Implants and Products'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Implant Type_jss1046'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Interbody'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_4WEB Anterior Spine Truss System (ALIF _d11b31'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Approach_Spine'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine Approach/div_ALIF'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_From_jss1046'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C4'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_To_jss1046'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C8'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Add Implant'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Confirm Implants Added'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Clinical'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-FN'), 'Tom')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-LN'), 'Jones')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRE-OP-PHY-PN'), '(222) 222-2222')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Pre-admission Testing at Midstate Medic_8aeb6d'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Yes-No Options/div_Yes'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/button_UserName'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/div_Logout'))

WebUI.closeBrowser()

