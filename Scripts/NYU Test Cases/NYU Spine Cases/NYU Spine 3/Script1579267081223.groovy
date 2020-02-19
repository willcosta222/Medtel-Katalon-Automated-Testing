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

WebUI.setText(findTestObject('Page_MedTel/input__PD-MRN'), '98765')

WebUI.click(findTestObject('Page_MedTel/div_Primary Surgeon_jss765'))

WebUI.click(findTestObject('Page_MedTel/div_Quirno (Stage-NYU) Martin'))

WebUI.setText(findTestObject('Page_MedTel/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/div_Site_jss765'))

WebUI.setText(findTestObject('Page_MedTel/input_Site_react-select-3-input'), 'spine')

WebUI.click(findTestObject('Page_MedTel/div_Spine'))

WebUI.click(findTestObject('Page_MedTel/span_Create Case'))

WebUI.setText(findTestObject('Page_MedTel/input__PD-DOB'), '04/03/1965')

WebUI.click(findTestObject('Page_MedTel/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Page_MedTel/div_OTHER'))

WebUI.click(findTestObject('Page_MedTel/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/div_NYU Kimmel Pavilion'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-PROD'), 'fusion scolios')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_FUSION SCOLIOSIS SPINE THORACO LUMBAR P_ccb09b'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-CPT'), '22802')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_22802 - Arthrodesis posterior for spina_0e6d7e'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-CPT'), '22848')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_22848 - Pelvic fixation (attachment of _c4536a'))

WebUI.setText(findTestObject('Page_MedTel/input__PRD-CPT'), '22843')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_22843 - Posterior segmental instrumenta_ea1c24'))

WebUI.click(findTestObject('Page_MedTel/Patient Positions NYU Spine/Patient Position 1 NYU Spine'))

WebUI.click(findTestObject('Page_MedTel/Patient Positions NYU Spine/Patient_Position_Unknown_NYU_Spine'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed Type 1'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed_Type_Unknown_NYU_SPine'))

WebUI.click(findTestObject('Page_MedTel/div_Implants and Products'))

WebUI.click(findTestObject('Page_MedTel/div_Implant Type_jss987'))

WebUI.click(findTestObject('Page_MedTel/div_Fixation'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-DESC'), 'xia spinal')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Xia Spinal System - Stryker - Matthew M_e82cee'))

WebUI.click(findTestObject('Page_MedTel/div_From_jss987'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_T10'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_T10_1'))

WebUI.click(findTestObject('Page_MedTel/div_To_jss987'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input_To_react-select-14-input'), 'pel')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Pelvis'))

WebUI.click(findTestObject('Page_MedTel/button_Add Implant'))

WebUI.click(findTestObject('Page_MedTel/span_Confirm Implants Added'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__IMP-BONE'), 'cancell')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Cancellous Chip Allograft'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-MONITOR'), 'fluo')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Fluo'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-MONITOR'), 'mep/s')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_MEPSSEP'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-ANC'), 'cell sav')

WebUI.click(findTestObject('Page_MedTel/div_CELL SAVER'))

WebUI.setText(findTestObject('Page_MedTel/input__IMP-ANC'), 'jackson')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Jackson Cradle'))

WebUI.click(findTestObject('Page_MedTel/div_Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/span_Confirm Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/span_Save Case'))

WebUI.closeBrowser()

