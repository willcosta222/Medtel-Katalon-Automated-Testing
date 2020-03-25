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

WebUI.navigateToUrl('https://stage.medtel.com')

WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Email_email'), 'thomas.youm@nycmc.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Login'))

CustomKeywords.'medtel.utilities.utilities.medtelfindCalendarDate'(GlobalVariable.CaseDate)

CustomKeywords.'medtel.utilities.utilities.medtelfindCase'(GlobalVariable.CaseNumber, true)

WebUI.click(findTestObject('Object Repository/Page_MedTel/BUTTONS/button_Cancel Case'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Yes'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_MedTel/BUTTONS/button_Cancel Case'))

WebUI.verifyElementNotClickable(findTestObject('Page_MedTel/BUTTONS/button_Amend Case'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/img_Connect_header-logo'))

CustomKeywords.'medtel.utilities.utilities.medtelfindCalendarDate'(GlobalVariable.CaseDate)

CustomKeywords.'medtel.utilities.utilities.confirmCaseStatus'(GlobalVariable.CaseNumber, '5', false)

WebUI.click(findTestObject('Page_MedTel/Medtel Header/button_UserName'))

WebUI.click(findTestObject('Page_MedTel/Medtel Header/div_Logout'))

WebUI.closeBrowser()

