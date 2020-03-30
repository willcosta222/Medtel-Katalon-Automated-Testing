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

WebUI.navigateToUrl('https:/stage.medtel.com')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Email'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'cathy@rycortho.com')

not_run: WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Email_email'), 'deirdre.corporan@nyumc.org')

not_run: WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Email_email'), 'jane.frattini@nyumc.org')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Login'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_New Case'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-MRN'), '734672')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Surgeon_jss765'))

WebUI.click(findTestObject('Page_MedTel/Primary Surgeon -Surgical Location/NYU Primary Surgeons/div_Youm (Stage-NYU), Thomas'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Site_jss765'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Site_react-select-3-input'), 'hip')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Hip'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Create Case'))

GlobalVariable.CaseNumber = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Number'))

GlobalVariable.CaseDate = WebUI.getText(findTestObject('Page_MedTel/span-p-li-misc/Case Date'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-DOB'), '08/03/1949')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Gender_jss987'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_F'))

CustomKeywords.'medtel.utilities.utilities.inputHeight'('5', '2')

WebUI.setText(findTestObject('Page_MedTel/Stats - Height and Weight/input__Weight'), '0211')

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_MEDICARE'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/Primary Surgeon -Surgical Location/NYU Surgical Location/div_NYU Langone Orthopedic Hospital (LOH)'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-PROD (1)'), 'arthroplasty hip')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_ARTHROPLASTY HIP TOTAL'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '27130')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_27130 - Arthroplasty acetabular and pro_dd70c6'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '20985')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_20985 - Computer-assisted surgical navi_439a55'))

WebUI.click(findTestObject('Page_MedTel/Procedure/Hip Laterality/div_Laterality'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Right'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Implants and Products'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'r3 acet')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_R3 Acetabular System (Cup) - Smith  Nep_f96de4'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'polarstem cementless')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_POLARSTEM Cementless Stem System - Smit_d5be32'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Confirm Implants Added'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'), 'intellijoint')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Intellijoint HIP - Intellijoint Surgica_30fccb'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Confirm Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.click(findTestObject('Page_MedTel/Medtel Header/button_UserName'))

WebUI.click(findTestObject('Page_MedTel/Medtel Header/div_Logout'))

WebUI.closeBrowser()

