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

WebUI.sendKeys(findTestObject('Object Repository/Page_MedTel/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_MedTel/button_New Case'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PD-MRN'), '12345')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Primary Surgeon_jss765'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Quirno (Stage-NYU) Martin'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Site_jss765'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input_Site_react-select-3-input'), 'SPine')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Spine'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Create Case'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PD-DOB'), '09/10/1990')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_OTHER'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/div_Surgical Location'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_NYU Kimmel Pavilion'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/input__PRD-PROD'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PRD-PROD'), 'ml')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_MLD'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PRD-CPT'), '63030')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_63030 - Laminotomy (hemilaminectomy) wi_97fc56'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__PRD-CPT'), '69990')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_69990 - Microsurgical techniques requir_d2bfd3'))

WebUI.click(findTestObject('Page_MedTel/Patient Positions NYU Spine/Patient Position 1 NYU Spine'))

WebUI.click(findTestObject('Page_MedTel/Patient Positions NYU Spine/Patient_Position_Unknown_NYU_Spine'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed Type 1'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed_Type_Unknown_NYU_SPine'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Implants and Products'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/input__IMP-DESC'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Implant Type_jss987'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_No Implant Required'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Approach_Spine'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Posterior'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Laterality'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Left'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_From_jss987'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input_From_react-select-13-input'), 'l5')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_L5'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_To_jss987'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_S1'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/button_Add Implant'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Confirm Implants Added'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__IMP-ANC'), 'zeiss m')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Zeiss microscope - Zeiss'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input__IMP-ANC'), 'wilson fr')

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Wilson Frame'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/div_Copy to EMR'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Confirm Copy to EMR'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span_Save Case'))

WebUI.closeBrowser()

