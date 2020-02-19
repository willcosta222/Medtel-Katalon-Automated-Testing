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

WebUI.click(findTestObject('Page_MedTel/button_New Case'))

WebUI.setText(findTestObject('Page_MedTel/input__PD-MRN'), '42323')

WebUI.click(findTestObject('Page_MedTel/div_Primary Surgeon_jss765'))

WebUI.click(findTestObject('Page_MedTel/div_Quirno (Stage-NYU) Martin'))

WebUI.setText(findTestObject('Page_MedTel/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/div_Site'))

WebUI.click(findTestObject('Page_MedTel/div_Site_jss765'))

WebUI.setText(findTestObject('Page_MedTel/input_Site_react-select-3-input'), 'knee')

WebUI.click(findTestObject('Page_MedTel/div_Knee'))

WebUI.click(findTestObject('Page_MedTel/span_Create Case'))

WebUI.setText(findTestObject('Page_MedTel/input__PD-DOB'), '04/29/1947')

WebUI.click(findTestObject('Page_MedTel/div_Gender_jss987'))

WebUI.click(findTestObject('Page_MedTel/div_F'))

WebUI.click(findTestObject('Page_MedTel/div_Feet_css-amjubi-indicatorContainer'))

WebUI.click(findTestObject('Page_MedTel/Height-Feet Drop Down Menu/div_5_feet'))

WebUI.click(findTestObject('Page_MedTel/div_Inches_css-amjubi-indicatorContainer'))

WebUI.click(findTestObject('Page_MedTel/Height-inches Drop Down Menu/div_2_inches'))

WebUI.setText(findTestObject('Page_MedTel/input__jss951 jss936'), '140')

WebUI.click(findTestObject('Page_MedTel/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Page_MedTel/div_OTHER'))

WebUI.click(findTestObject('Page_MedTel/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/div_NYU Langone Orthopedic Hospital (LOH)'))

WebUI.click(findTestObject('Page_MedTel/input__PRD-PROD'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-PROD'), 'arthroplasty knee')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_ARTHROPLASTY KNEE TOTAL'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-CPT'), '27446')

WebUI.click(findTestObject('Page_MedTel/div_27446 - Arthroplasty knee condyle and p_36b54e'))

WebUI.click(findTestObject('Page_MedTel/div_Laterality'))

WebUI.click(findTestObject('Page_MedTel/div_Right'))

WebUI.click(findTestObject('Page_MedTel/div_Implants and Products'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-DESC'), 'legion (genesis) in')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_LEGION (GENESIS) Insert - Smith  Nephew_87b2d9'))

WebUI.click(findTestObject('Page_MedTel/span_Confirm Implants Added'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-ANC'), 'navio')

WebUI.click(findTestObject('Page_MedTel/div_NAVIO Surgical System - Smith  Nephew -_9e50fd'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Copy to EMR_1'))

WebUI.click(findTestObject('Page_MedTel/label_Confirm Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/button_Save Case'))

WebUI.closeBrowser()

