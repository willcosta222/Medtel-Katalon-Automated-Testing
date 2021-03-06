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

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'cathy@rycortho.com')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.sendKeys(findTestObject('Page_MedTel/INPUTS/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_New Case'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-MRN'), '54321')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Surgeon_jss765'))

WebUI.click(findTestObject('Page_MedTel/Primary Surgeon -Surgical Location/NYU Primary Surgeons/div_Quirno (Stage-NYU) Martin'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Site_jss765'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Site_react-select-3-input'), 'spine')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Spine'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Create Case'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-DOB'), '10/12/2001')

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_OTHER'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_NYU Medical Center (Tisch)'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-PROD (1)'), 'fusion cervi')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_FUSION CERVICAL DISCECTOMY ANTERIOR MULTI'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-PROD (1)'), 'fusion spinal cervical po')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_FUSION SPINAL CERVICAL POSTERIOR MULTI'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '22551')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_22551 - Arthrodesis anterior interbody _e3716c'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '22552')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_22552 - Arthrodesis anterior interbody _bb8463'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '22600')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_22600 - Arthrodesis posterior or poster_b590b3'))

WebUI.click(findTestObject('Page_MedTel/Patient Positions NYU and MST Spine/Patient Position 1 Spine'))

WebUI.click(findTestObject('Page_MedTel/Patient Positions NYU and MST Spine/Patient_Position_Unknown'))

WebUI.click(findTestObject('Page_MedTel/NYU/Bed Types NYU Spine/Bed Type 1'))

WebUI.click(findTestObject('Page_MedTel/NYU/Bed Types NYU Spine/Bed_Type_Unknown_NYU_SPine'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Implants and Products'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Implant Type_jss987'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Fixation'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'maxan anteri')

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_MaxAn Anterior Cervical Plate (EBI) - Z_ee2f85'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Approach_Spine'))

WebUI.click(findTestObject('Page_MedTel/Procedure/Hip Approach/div_Anterior'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_From_jss987'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C3'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_To_jss987'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C4'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Add Implant'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Implant Type_jss987'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Interbody'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'solitaire-c cervical spacer system ')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Solitaire-C Cervical Spacer System (Ant_10e5f7'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_From_jss987'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C3'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_To_jss987'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C5'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Add Implant'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Confirm Implants Added'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'), 'cell sav')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_CELL SAVER'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'), 'zeiss')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Zeiss'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'), 'cloward cervical')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_CLOWARD Cervical Retractor'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Confirm Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.closeBrowser()

