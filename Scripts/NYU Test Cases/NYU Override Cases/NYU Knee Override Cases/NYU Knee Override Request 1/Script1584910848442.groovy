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

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Email_email'), 'cathy@rycortho.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Login'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_New Case'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-MRN'), 'KNEE OVERRIDE REQ 1')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Surgeon_jss919'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Youm (Stage-NYU) Thomas'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Site_jss765'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Site_react-select-3-input'), 'knee')

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Knee'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Create Case'))

GlobalVariable.CaseNumber = WebUI.getText(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/Case Number'))

GlobalVariable.CaseDate = WebUI.getText(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/Case Date'))

WebUI.setText(findTestObject('Page_MedTel/Demographics/input__PD-DOB'), '12/15/1954')

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Gender_jss987'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_M'))

CustomKeywords.'medtel.utilities.utilities.inputHeight'('5', '10')

WebUI.setText(findTestObject('Page_MedTel/Stats - Height and Weight/input__Weight'), '200')

WebUI.click(findTestObject('Object Repository/Page_MedTel/Insurance Types/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_MEDICARE'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Procedure Details'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_NYU Langone Orthopedic Hospital (LOH)'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-PROD (1)'), 'total knee arthroplasty')

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_TOTAL KNEE ARTHROPLASTY'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '27447')

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_27447 - Arthroplasty knee condyle and p_ed80cb'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Laterality_jss1156'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/DIVs/div_Right'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Scheduling'))

WebUI.setText(findTestObject('Page_MedTel/Schedule/input__SCH-TIME (1)'), '07:30 AM')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Implants and Products'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'high dem')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_High Demand Knee (Legion Oxinium Genese_d4015c'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/span-p-li-misc/span_Confirm Implants Added'))

WebUI.setText(findTestObject('Object Repository/Page_MedTel/Override/div_Override_enter_diagnosis'), 'OA')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/Override/div_Override_reason_for_request'), 'ACTIVE')

WebUI.click(findTestObject('Object Repository/Page_MedTel/Override/button_Request Override'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/img_Connect_header-logo'))

CustomKeywords.'medtel.utilities.utilities.medtelfindCalendarDate'(GlobalVariable.CaseDate)

CustomKeywords.'medtel.utilities.utilities.confirmCaseStatus'(GlobalVariable.CaseNumber, '2', false)

WebUI.closeBrowser()

