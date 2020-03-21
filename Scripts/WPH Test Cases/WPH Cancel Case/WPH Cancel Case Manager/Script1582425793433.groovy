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

WebUI.navigateToUrl('https://patch-stage.medtel.com/login')

WebUI.setText(findTestObject('Page_MedTel/INPUTS/input_Email_email'), 'jgaynor@wphospital.org')

WebUI.setEncryptedText(findTestObject('Page_MedTel/INPUTS/input_Password_password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/span_Login'))

// Read Current Date on Calendar format (i.e, January 2020)
CalendarDate = WebUI.getText(findTestObject('Page_MedTel/BUTTONS/button_CalendarDate'))

// Format Calendar Date w/p white spaces/spaces
CalendarDate = CalendarDate.replaceAll('\\s', '')

// Separate Month and Year subStrings(Assume 'Year' always 4 digits
CDlength = CalendarDate.length()

year = CalendarDate.substring(CDlength - 2, CDlength)

System.out.println(year)

month = CalendarDate.substring(0, 3)

// Format CaseDate Variable
GlobalVariable.CaseDate = GlobalVariable.CaseDate.substring(7, 17)

CaseYear = GlobalVariable.CaseDate.substring(8, 10)

CaseMonth = GlobalVariable.CaseDate.substring(0, 2)

CaseDay = GlobalVariable.CaseDate.substring(3, 5)

// Check For Correct Year
while (year != CaseYear) {
    WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_YearForward'))

    new_date = WebUI.getText(findTestObject('Page_MedTel/BUTTONS/button_CalendarDate'))

    NDlength = new_date.length()

    year = new_date.substring(NDlength - 2, NDlength)

    System.out.println(year)
}

// Format Months
if (CaseMonth == '01') {
    CaseMonth = 'Jan'
}

if (CaseMonth == '02') {
    CaseMonth = 'Feb'
}

if (CaseMonth == '03') {
    CaseMonth = 'Mar'
}

if (CaseMonth == '04') {
    CaseMonth = 'Apr'
}

if (CaseMonth == '05') {
    CaseMonth = 'May'
}

if (CaseMonth == '06') {
    CaseMonth = 'Jun'
}

if (CaseMonth == '07') {
    CaseMonth = 'Jul'
}

if (CaseMonth == '08') {
    CaseMonth = 'Aug'
}

if (CaseMonth == '09') {
    CaseMonth = 'Sep'
}

if (CaseMonth == '10') {
    CaseMonth = 'Oct'
}

if (CaseMonth == '11') {
    CaseMonth = 'Nov'
}

if (CaseMonth == '12') {
    CaseMonth = 'Dec'
}

System.out.println(CaseMonth)

//Check for Correct Month
while (month != CaseMonth) {
    WebUI.click(findTestObject('Page_MedTel/BUTTONS/button__MonthForward'))

    new_date = WebUI.getText(findTestObject('Page_MedTel/BUTTONS/button_CalendarDate'))

    NDlength = new_date.length()

    year = new_date.substring(NDlength - 2, NDlength)

    month = new_date.substring(0, 3)
}

if (year != CaseYear) {
    WebUI.click(findTestObject('Page_MedTel/BUTTONS/button__YearBackward'))
}

System.out.println(CaseYear)

System.out.println(year)

System.out.println(CaseMonth)

System.out.println(month)

//Day Test
dayOne = WebUI.getText(findTestObject('Object Repository/Page_MedTel/Calendar Days/button_CalendarDay1'))

int dayCount = 1

// Check day of first calendar box
while (dayOne != '1') {
    d = Integer.toString(dayCount)

    dayOne = WebUI.getText(findTestObject('Object Repository/Page_MedTel/Calendar Days/button_CalendarDay' + d))

    if (dayOne != '1') {
        dayCount = (dayCount + 1)
    }
    
    System.out.println(dayCount)

    System.out.println(dayOne)
}

if (dayOne == '1') {
    if (dayOne == CaseDay) {
        d = Integer.toString(dayCount)

        WebUI.click(findTestObject('Object Repository/Page_MedTel/Calendar Days/button_CalendarDay' + d))
    } else {
        r = Integer.toString(dayCount)

        rightDay = WebUI.getText(findTestObject('Object Repository/Page_MedTel/Calendar Days/button_CalendarDay' + r))

        System.out.println(rightDay)

        System.out.println(dayCount)

        while (rightDay != CaseDay) {
            r = Integer.toString(dayCount)

            rightDay = WebUI.getText(findTestObject('Object Repository/Page_MedTel/Calendar Days/button_CalendarDay' + r))

            dayCount = (dayCount + 1)

            System.out.println(rightDay)

            System.out.println(dayCount)
        }
        
        dayCount = (dayCount - 1)

        r = Integer.toString(dayCount)

        WebUI.click(findTestObject('Object Repository/Page_MedTel/Calendar Days/button_CalendarDay' + r))
    }
    
    System.out.println(dayCount)

    System.out.println(rightDay)
}

CaseNum = GlobalVariable.CaseNumber.replaceAll('\\s', '')

CaseNum = GlobalVariable.CaseNumber.substring(6, 11)

lastCase = WebUI.getText(findTestObject('Object Repository/Page_MedTel/Case Number List/div_CaseListLast'))

n = 1

System.out.println(lastCase)

System.out.println(CaseNum)

if (CaseNum == lastCase) {
    WebUI.click(findTestObject('Object Repository/Page_MedTel/Case Number List/div_CaseListLast'))
}

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Cancel Case'))

WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Yes'))

WebUI.click(findTestObject('Page_MedTel/span-p-li-misc/img_Connect_header-logo'))

WebUI.closeBrowser()

