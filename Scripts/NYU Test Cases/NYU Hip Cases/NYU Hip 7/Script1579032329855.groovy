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

WebUI.setText(findTestObject('Page_MedTel/input_Email_email'), 'cathy@rycortho.com')

WebUI.setEncryptedText(findTestObject('Page_MedTel/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span_Login'))

WebUI.click(findTestObject('Page_MedTel/span_New Case'))

WebUI.setText(findTestObject('Page_MedTel/input__PD-MRN'), '452341')

WebUI.click(findTestObject('Page_MedTel/div_Primary Surgeon_jss765'))

WebUI.click(findTestObject('Page_MedTel/div_Quirno (Stage-NYU) Martin'))

WebUI.setText(findTestObject('Page_MedTel/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/div_Site_jss765'))

WebUI.setText(findTestObject('Page_MedTel/input_Site_react-select-3-input'), 'hip')

WebUI.click(findTestObject('Page_MedTel/div_Hip'))

WebUI.click(findTestObject('Page_MedTel/button_Create Case'))

WebUI.setText(findTestObject('Page_MedTel/input__PD-DOB'), '07/26/1974')

WebUI.click(findTestObject('Page_MedTel/div_Gender_jss1002'))

WebUI.click(findTestObject('Page_MedTel/div_F'))

WebUI.click(findTestObject('Page_MedTel/div_Feet_css-amjubi-indicatorContainer'))

WebUI.click(findTestObject('Page_MedTel/Height-Feet Drop Down Menu/div_5_feet'))

WebUI.click(findTestObject('Page_MedTel/div_Inches_css-amjubi-indicatorContainer'))

WebUI.click(findTestObject('Page_MedTel/Height-inches Drop Down Menu/div_4_inches'))

WebUI.setText(findTestObject('Page_MedTel/input__jss966 jss951'), '0167')

WebUI.click(findTestObject('Page_MedTel/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Page_MedTel/div_OTHER'))

WebUI.click(findTestObject('Page_MedTel/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/div_NYU Langone Orthopedic Hospital (LOH)'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-PROD'), 'replacement hip total')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_REPLACEMENT HIP TOTAL'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-CPT'), '27132')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_27132 - Conversion of previous hip surg_ea03ce'))

WebUI.click(findTestObject('Page_MedTel/div_Approach_Hip'))

WebUI.click(findTestObject('Page_MedTel/div_Anterior'))

WebUI.click(findTestObject('Page_MedTel/div_Laterality'))

WebUI.click(findTestObject('Page_MedTel/div_Right'))

WebUI.click(findTestObject('Page_MedTel/div_Implants and Products'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-DESC'), 'g7 d')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_G7 Dual Mobility Acetabular System - Zi_9d789f'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-DESC'), 'wagner sl re')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Wagner SL Revision Hip Stem - Zimmer Bi_07e6ce'))

WebUI.click(findTestObject('Page_MedTel/span_Confirm Implants Added'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-ANC'), 'macaul')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_MacaulayVigdorchik Chik Hip Table'))

WebUI.click(findTestObject('Page_MedTel/div_Copy to EMR'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/input_Copy case details to clipboard_jss1147'))

WebUI.click(findTestObject('Page_MedTel/span_Save Case'))

WebUI.closeBrowser()

