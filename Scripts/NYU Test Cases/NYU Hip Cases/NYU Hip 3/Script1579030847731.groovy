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

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input_Email_email'), 'cathy@rycortho.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MedTel/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_New Case'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PD-MRN'), '643354')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Primary Surgeon_jss765'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Quirno (Stage-NYU) Martin'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Site_jss765'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input_Site_react-select-3-input'), 'hip')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Hip'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Create Case'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PD-DOB'), '07/19/1948')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Gender_jss987'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_M'))

WebUI.click(findTestObject('Page_MedTel/div_Feet_css-amjubi-indicatorContainer'))

WebUI.click(findTestObject('Page_MedTel/Height-Feet Drop Down Menu/div_5_feet'))

WebUI.click(findTestObject('Page_MedTel/div_Inches_css-amjubi-indicatorContainer'))

WebUI.click(findTestObject('Page_MedTel/Height-inches Drop Down Menu/div_10_inches'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__jss951 jss936'), '0209')

WebUI.click(findTestObject('Page_MedTel/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_MEDICARE'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/div_Surgical Location'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_NYU Langone Orthopedic Hospital (LOH)'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PRD-PROD'), 'arthroplasty hip ')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_HIP'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PRD-CPT'), '27130')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_27130 - Arthroplasty acetabular and pro_dd70c6'))

WebUI.click(findTestObject('Page_MedTel/div_Approach_Hip'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Anterior'))

WebUI.click(findTestObject('Page_MedTel/div_Laterality'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Right'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Implants and Products'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__IMP-DESC'), 'anthology hip ')

WebUI.click(findTestObject('Object Repository/Page_MedTel/strong_System (Stem) - Smith  Nephew - Larr_43b284'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__IMP-DESC'), 'biolox delta ceramic femoral head')

WebUI.click(findTestObject('Object Repository/Page_MedTel/strong_- Stryker - Shelby Dapuzzo (Stage-NY_5a8d22'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__IMP-DESC'), 'r3 multi hole acetabular')

WebUI.click(findTestObject('Object Repository/Page_MedTel/strong_Shell - Smith  Nephew - Larry Astwoo_a302b4'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__IMP-DESC'), 'synergy short')

WebUI.click(findTestObject('Object Repository/Page_MedTel/strong_Stem - Smith  Nephew - Larry Astwood_4d2e46'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Confirm Implants Added'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__IMP-ANC'), 'MIS retra')

WebUI.click(findTestObject('Object Repository/Page_MedTel/strong_ctors - Stryker'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__IMP-ANC'), 'R3 MIS in')

WebUI.click(findTestObject('Object Repository/Page_MedTel/strong_struments - Anterior approach reamer_40254c'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__IMP-ANC'), 'omni trac')

WebUI.click(findTestObject('Object Repository/Page_MedTel/strong_Femoral Elevator'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Copy to EMR'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Confirm Copy to EMR'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Save Case'))

WebUI.closeBrowser()

