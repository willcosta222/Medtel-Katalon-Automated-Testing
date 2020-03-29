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

WebUI.navigateToUrl('https://stage.medtel.com/login')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Email_email'), 'jane.frattini@nyumc.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/span_New Case'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-MRN'), '643354')

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Primary Surgeon_jss765'))

WebUI.click(findTestObject('Page_MedTel/Primary Surgeon -Surgical Location/NYU Primary Surgeons/div_Slover (Stage-NYU), James'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Site_jss765'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Site_react-select-3-input'), 'hip')

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Hip'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/span_Create Case'))

GlobalVariable.CaseNumber = WebUI.getText(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/Case Number'))

GlobalVariable.CaseDate = WebUI.getText(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/Case Date'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-DOB'), '07/19/1948')

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Gender_jss987'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_M'))

CustomKeywords.'medtel.utilities.utilities.inputHeight'('5', '10')

WebUI.setText(findTestObject('Page_MedTel/Stats - Height and Weight/input__Weight'), '209')

WebUI.click(findTestObject('Object Repository/Page_MedTel/Insurance Types/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Insurance Types/div_MEDICARE'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/span_Procedure Details'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/Primary Surgeon -Surgical Location/NYU Surgical Location/div_NYU Langone Orthopedic Hospital (LOH)'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-PROD (1)'), 'arthroplasty hip ')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/span_HIP'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '27130')

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_27130 - Arthroplasty acetabular and pro_dd70c6'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Approach_Hip'))

WebUI.click(findTestObject('Page_MedTel/Procedure/Hip Approach/div_Anterior'))

WebUI.click(findTestObject('Page_MedTel/Procedure/Hip Laterality/div_Laterality'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Right'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/span_Implants and Products'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input__IMP-DESC'), 'anthology hip ')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/strong_System (Stem) - Smith  Nephew - Larr_43b284'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input__IMP-DESC'), 'biolox delta ceramic femoral head - djo')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/strong_- Stryker - Shelby Dapuzzo (Stage-NY_5a8d22'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input__IMP-DESC'), 'r3 multi hole acetabular')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/strong_Shell - Smith  Nephew - Larry Astwoo_a302b4'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input__IMP-DESC'), 'synergy short')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/strong_Stem - Smith  Nephew - Larry Astwood_4d2e46'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/span_Confirm Implants Added'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input__IMP-ANC'), 'MIS retra')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/strong_ctors - Stryker'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input__IMP-ANC'), 'R3 MIS in')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/strong_struments - Anterior approach reamer_40254c'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input__IMP-ANC'), 'omni trac')

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/strong_Femoral Elevator'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/span_Copy to EMR'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/span_Confirm Copy to EMR'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/BUTTONS/button_Save Case'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_MedTel/Medtel Header/button_UserName'))

WebUI.click(findTestObject('Page_MedTel/Medtel Header/div_Logout'))

not_run: WebUI.closeBrowser()

