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

WebUI.navigateToUrl('https://stage.medtel.com')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Email_email'), 'vianka.dejesus@nyumc.org')

not_run: WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Email_email'), 'anisha.chadda@nyumc.org')

not_run: WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Email_email'), 'candy.kraemer@nyumc.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_New Case'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-MRN'), '13412')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Surgeon_jss765'))

WebUI.click(findTestObject('Page_MedTel/Primary Surgeon -Surgical Location/NYU Primary Surgeons/div_Youm (Stage-NYU), Thomas'))

not_run: WebUI.click(findTestObject('Page_MedTel/Primary Surgeon -Surgical Location/NYU Primary Surgeons/div_Macaulay (Stage-NYU), William'))

not_run: WebUI.click(findTestObject('Page_MedTel/Primary Surgeon -Surgical Location/NYU Primary Surgeons/div_Slover (Stage-NYU), James'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Site_jss765'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Site_react-select-3-input'), 'HIP')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Hip'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Create Case'))

GlobalVariable.CaseNumber = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Number'))

GlobalVariable.CaseDate = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Date'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-DOB'), '11/15/2010')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Gender_jss987'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_F'))

CustomKeywords.'medtel.utilities.utilities.inputHeight'('5', '6')

WebUI.setText(findTestObject('Page_MedTel/Stats - Height and Weight/input__Weight'), '148')

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_OTHER'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/Primary Surgeon -Surgical Location/NYU Surgical Location/div_NYU Langone Orthopedic Hospital (LOH)'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-PROD (1)'), 'arthroplasty hip total')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_ARTHROPLASTY HIP TOTAL'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '27130')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_27130 - Arthroplasty acetabular and pro_dd70c6'))

WebUI.click(findTestObject('Page_MedTel/Procedure/Hip Laterality/div_Laterality'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Right'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Implants and Products'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'fmp acetabular')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_FMP Acetabular System - DJO Global - Pa_3ad1ed'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'r3 acetabular')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_R3 Acetabular System (Cup) - Smith  Nep_f96de4'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'synergy cementless')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_SYNERGY Cementless Stem - Smith  Nephew_24692c'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'wagner cone p')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Wagner Cone Prosthesis Hip Stem - Zimme_766898'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Confirm Implants Added'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Confirm Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/button_UserName'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/div_Logout'))

WebUI.closeBrowser()

