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

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'cathy@rycortho.com')

not_run: WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Email_email'), 'deirdre.corporan@nyumc.org')

not_run: WebUI.setText(findTestObject('Object Repository/Page_MedTel/INPUTS/input_Email_email'), 'jane.frattini@nyumc.org')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Login'))

CustomKeywords.'medtel.utilities.utilities.medtelfindCalendarDate'(GlobalVariable.CaseDate)

CustomKeywords.'medtel.utilities.utilities.medtelfindCase'(GlobalVariable.CaseNumber, true)

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Amend Case'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/Comments/div_Comments'))

WebUI.setText(findTestObject('Page_MedTel/Case Navigation/Comments/input__Comment'), 'SCHEDULER COMMENT 1')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/Comments/button_Add Comment'))

'Duplicate Comment - Scheduler'
WebUI.setText(findTestObject('Page_MedTel/Case Navigation/Comments/input__Comment'), 'SCHEDULER COMMENT 1')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/Comments/button_Add Comment'))

'Duplicate Comment - Scheduler'
WebUI.setText(findTestObject('Page_MedTel/Case Navigation/Comments/input__Comment'), 'hi')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/Comments/button_Add Comment'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.refresh()

CustomKeywords.'medtel.utilities.utilities.confirmCommentPresent'(3)

WebUI.click(findTestObject('Page_MedTel/Medtel Header/button_UserName'))

WebUI.click(findTestObject('Page_MedTel/Medtel Header/div_Logout'))

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'thomas.youm@nycmc.org')

not_run: WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'william.macaulay@nyumc.org')

not_run: WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'james.slover@nycmc.org')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Login'))

not_run: WebUI.click(findTestObject('Page_MedTel/Approver-Surgeon Toggle'))

CustomKeywords.'medtel.utilities.utilities.medtelfindCalendarDate'(GlobalVariable.CaseDate)

CustomKeywords.'medtel.utilities.utilities.medtelfindCase'(GlobalVariable.CaseNumber, true)

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Amend Case'))

WebUI.click(findTestObject('Page_MedTel/Case Navigation/Comments/div_Comments'))

WebUI.setText(findTestObject('Page_MedTel/Case Navigation/Comments/input__Comment'), 'SURGEON COMMENT 1')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/Comments/button_Add Comment'))

'Duplicate Comment - Scheduler'
WebUI.setText(findTestObject('Page_MedTel/Case Navigation/Comments/input__Comment'), 'SURGEON COMMENT 1')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/Comments/button_Add Comment'))

'Duplicate Comment - Scheduler'
WebUI.setText(findTestObject('Page_MedTel/Case Navigation/Comments/input__Comment'), 'hi')

WebUI.click(findTestObject('Page_MedTel/Case Navigation/Comments/button_Add Comment'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Save Case'))

WebUI.refresh()

CustomKeywords.'medtel.utilities.utilities.confirmCommentPresent'(6)

WebUI.click(findTestObject('Page_MedTel/Medtel Header/button_UserName'))

WebUI.click(findTestObject('Page_MedTel/Medtel Header/div_Logout'))

WebUI.closeBrowser()

