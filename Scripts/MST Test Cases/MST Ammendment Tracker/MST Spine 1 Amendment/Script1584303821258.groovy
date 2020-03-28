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

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'jkuehl@ct-ortho.com')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.sendKeys(findTestObject('Page_MedTel/INPUTS/input_Password_password'), Keys.chord(Keys.ENTER))

CustomKeywords.'medtel.utilities.utilities.medtelfindCalendarDate'(GlobalVariable.CaseDate)

CustomKeywords.'medtel.utilities.utilities.medtelfindCase'(GlobalVariable.CaseNumber, true)

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Amend Case'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Patient has special needs_jss1112'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Yes-No Options/div_Yes'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__SN-SPECIAL-NEEDS-OPTS'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Group home'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__SN-SPECIAL-NEEDS-OPTS'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Hearing impaired'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Procedure Details'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__jss1076 jss1061'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Adeleke (Stage-MS) Adebola - Podiatry'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__jss1076 jss1061'), 'ald')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Aldrich (Stage-MS) Keith - Orthopedics'))

WebUI.setText(findTestObject('Page_MedTel/Procedure/input__PRD-CPT'), '22612')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_22612 - Arthrodesis posterior or poster_8024e4'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-DS'), 'q76')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Q76 - CONGENITAL MALFORMATIONS OF SPINE_b893b4'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__PRD-DS'), 's22')

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__PRD-DS'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_S22 - FRACTURE OF RIB(S) STERNUM AND TH_444a03'))

CustomKeywords.'medtel.utilities.utilities.removeICDcode'('S33')

WebUI.click(findTestObject('Page_MedTel/Anesthesia Type/Input_Anesthesia'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_MAC'))

CustomKeywords.'medtel.utilities.utilities.removeAnesthesia'('BB')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/div_Implants and Products'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-BONE'), 't biofix')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_T BIOFIX FLOW INJECTABLE ALLOGRAFT 1CC _eb0418'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-MONITOR'), 'fluo')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Fluoroscopy - Stryker - Jessa Camacho (_0c7e19'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__IMP-MONITOR'), 'less')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_LessRay - NuVasive Inc - Carol Mondsche_6f1e60'))

WebUI.click(findTestObject('Page_MedTel/INPUTS/input__IMP-ANC'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Incisional Wound Vac'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/button_UserName'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/div_Logout'))

WebUI.closeBrowser()

