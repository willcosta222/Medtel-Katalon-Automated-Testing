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

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'cathys@comcllc.com')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Login'))

CustomKeywords.'medtel.utilities.utilities.medtelfindCalendarDate'(GlobalVariable.CaseDate)

CustomKeywords.'medtel.utilities.utilities.medtelfindCase'(GlobalVariable.CaseNumber, true)

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Amend Case'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Implants and Products'))

CustomKeywords.'medtel.utilities.utilities.removeImplant'('4WEB Anterior Spine')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Implant Type_jss1046'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Fixation'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__IMP-DESC'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_CD Horizon Legacy 55 Spinal System - Me_816944'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Approach_jss1631'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_From_jss1631'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C1'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_To_jss1631'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C4'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Add Implant'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Implant Type_jss1631'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_No Implant Required'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Approach_jss1631'))

WebUI.click(findTestObject('Page_MedTel/Procedure/Hip Approach/div_Anterior'))

WebUI.click(findTestObject('Page_MedTel/Procedure/Hip Laterality/div_Laterality_jss1631'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Right'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_From_jss1631'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C2'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_To'))

WebUI.click(findTestObject('Page_MedTel/MST/MST Spine From-To/div_C5'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Add Implant'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/label_Confirm Implants Added'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__IMP-BONE'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_DBX - Depuy Synthes - Harold Mondschein_0f5ba0'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__IMP-MONITOR'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Fluoroscopy - Stryker - Jessa Camacho (_0c7e19'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__IMP-MONITOR'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_LessRay - NuVasive Inc - Carol Mondsche_6f1e60'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Incisional Wound Vac'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/button_UserName'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/div_Logout'))

WebUI.closeBrowser()

