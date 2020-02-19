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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://patch-stage.medtel.com/login')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/input_Email_email'), 'cathy@rycortho.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MedTel/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span_Login'))

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

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed_Type_JacksonCradle_WithPads_NYU_Spine'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed Type 1'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed_Type_JacksonCradle_WilsonFrame_NYU_Spine'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed Type 1'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed_Type_AndrewsFrame_NYU_Spine'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed Type 1'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed_Type_Amsco_MizuhoTable_NYU_Spine'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed Type 1'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed_Type_Skytron_NYU_Spine'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed Type 1'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed_Type_JacksonFlat_NYU_Spine'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed Type 1'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed_Type_Unknown_NYU_SPine'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed Type 1'))

WebUI.click(findTestObject('Page_MedTel/Bed Types NYU Spine/Bed_Type_AmscoTable_Reversed_NYU_Spine'))

