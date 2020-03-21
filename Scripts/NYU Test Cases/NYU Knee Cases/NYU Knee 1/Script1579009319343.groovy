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

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Login'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_New Case'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PD-MRN'), '12345')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Primary Surgeon_jss765'))

WebUI.click(findTestObject('Page_MedTel/NYU/NYU Primary Surgeons/div_Quirno (Stage-NYU) Martin'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__SCH-PD'), '12/31/2020')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Site_jss765'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Site_react-select-3-input'), 'knee')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Knee'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Create Case'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PD-DOB'), '12/12/1990')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Gender_jss987'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_M'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Feet_css-amjubi-indicatorContainer'))

WebUI.click(findTestObject('Page_MedTel/Height and Weight/Height-Feet Drop Down Menu/div_6_feet'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__jss951 jss936'), '200')

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_Insurance Type_NYU'))

WebUI.click(findTestObject('Page_MedTel/Insurance Types/div_MEDICARE'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Surgical Location'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_NYU Langone Orthopedic Hospital (LOH)'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-PROD'), 'total knee arthroplasty')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_TOTAL KNEE ARTHROPLASTY'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-CPT'), '27447')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_27447 - Arthroplasty knee condyle and p_ed80cb'))

WebUI.click(findTestObject('Page_MedTel/Hip Laterality/div_Laterality'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Left'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Implants and Products'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'), 'standard demand knee')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Standard Demand Knee (Legion PS Genesis_53c105'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Confirm Implants Added'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'), 'simplex ')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Simplex HV Cement - Stryker - Shelby Da_2d2964'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/label_Confirm Copy to EMR'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Save Case'))

WebUI.closeBrowser()

