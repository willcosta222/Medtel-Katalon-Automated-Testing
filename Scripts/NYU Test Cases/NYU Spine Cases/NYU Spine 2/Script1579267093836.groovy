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

WebUI.sendKeys(findTestObject('Page_MedTel/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_MedTel/span_New Case'))

WebUI.setText(findTestObject('Page_MedTel/input__PD-MRN'), '54321')

WebUI.click(findTestObject('Page_MedTel/div_Primary Surgeon_jss765'))

WebUI.click(findTestObject('Page_MedTel/div_Quirno (Stage-NYU) Martin'))

WebUI.setText(findTestObject('Page_MedTel/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/div_Site_jss765'))

WebUI.setText(findTestObject('Page_MedTel/input_Site_react-select-3-input'), 'spine')

WebUI.click(findTestObject('Page_MedTel/div_Spine'))

WebUI.click(findTestObject('Page_MedTel/span_Create Case'))

WebUI.setText(findTestObject('Page_MedTel/input__PD-DOB'), '10/12/2001')

WebUI.click(findTestObject('Page_MedTel/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Page_MedTel/div_OTHER'))

WebUI.click(findTestObject('Page_MedTel/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/div_Surgical Location'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_NYU Medical Center (Tisch)'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-PROD'), 'fusion cervi')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_FUSION CERVICAL DISCECTOMY ANTERIOR MULTI'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-PROD'), 'fusion spinal cervical po')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_FUSION SPINAL CERVICAL POSTERIOR MULTI'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-CPT'), '22551')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_22551 - Arthrodesis anterior interbody _e3716c'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-CPT'), '22552')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_22552 - Arthrodesis anterior interbody _bb8463'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-CPT'), '22600')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_22600 - Arthrodesis posterior or poster_b590b3'))

WebUI.click(findTestObject('Page_MedTel/Patient Positions NYU Spine/Patient Position 1 NYU Spine'))

WebUI.click(findTestObject('Page_MedTel/Patient Positions NYU Spine/Patient_Position_Unknown_NYU_Spine'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed Type 1'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed_Type_Unknown_NYU_SPine'))

WebUI.click(findTestObject('Page_MedTel/div_Implants and Products'))

WebUI.click(findTestObject('Page_MedTel/div_Implant Type_jss987'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Fixation'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-DESC'), 'maxan anteri')

WebUI.click(findTestObject('Page_MedTel/input__IMP-DESC'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_MaxAn Anterior Cervical Plate (EBI) - Z_ee2f85'))

WebUI.click(findTestObject('Page_MedTel/div_Approach_Spine'))

WebUI.click(findTestObject('Page_MedTel/div_Anterior'))

WebUI.click(findTestObject('Page_MedTel/div_From_jss987'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_C3'))

WebUI.click(findTestObject('Page_MedTel/div_To_jss987'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_C4'))

WebUI.click(findTestObject('Page_MedTel/button_Add Implant'))

WebUI.click(findTestObject('Page_MedTel/div_Implant Type_jss987'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Interbody'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-DESC'), 'solitaire-c cervical spacer system ')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Solitaire-C Cervical Spacer System (Ant_10e5f7'))

WebUI.click(findTestObject('Page_MedTel/div_From_jss987'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_C3'))

WebUI.click(findTestObject('Page_MedTel/div_To_jss987'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_C5'))

WebUI.click(findTestObject('Page_MedTel/button_Add Implant'))

WebUI.click(findTestObject('Page_MedTel/span_Confirm Implants Added'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-ANC'), 'cell sav')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_CELL SAVER'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-ANC'), 'zeiss')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Zeiss'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-ANC'), 'cloward cervical')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_CLOWARD Cervical Retractor'))

WebUI.click(findTestObject('Page_MedTel/div_Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/span_Confirm Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/button_Save Case'))

WebUI.closeBrowser()

