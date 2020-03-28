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

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'jeffreyp@comcllc.com')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Login'))

CustomKeywords.'medtel.utilities.utilities.medtelfindCalendarDate'(GlobalVariable.CaseDate)

CustomKeywords.'medtel.utilities.utilities.medtelfindCase'(GlobalVariable.CaseNumber, true)

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Amend Case'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Financial'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_MEDEX'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_PRIVATE INSURANCE COMPANY'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Private Insurance Details_jss1804'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_AARP'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-PRIM-PRIV-POL-NUM'), '1234')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-PRIM-PRIV-GRP-NAME'), '4567')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Insurance Authorization Provided_jss1804'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_No'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Policy Holder_jss1804'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Patient'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_SELF PAY'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_AUTO INSURANCE'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-SEC-AUTO-NAME'), 'GEICO')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Auto Insurance Name (Secondary)Auto Ins_5cff96'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-SEC-AUTO-CLAIM-NUM'), '12345')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Insurance Authorization Provided (Secon_3f3138'))

WebUI.click(findTestObject('Page_MedTel/Yes-No Options/div_Yes'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Patient Primary InsuranceInsurance Type_f48191'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input__INS-SEC-AUTO-AUTH-NUM'), '1234')

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Policy Holder (Secondary)_jss1804'))

WebUI.click(findTestObject('Page_MedTel/DIVs/div_Patient_1'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/button_UserName'))

WebUI.click(findTestObject('Object Repository/Page_MedTel/Medtel Header/div_Logout'))

WebUI.closeBrowser()

