package medtel.utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import java.util.Dictionary
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.*
import org.openqa.selenium.Keys as Keys

public class utilities {

	@Keyword
	def medtelfindCalendarDate(String option) {
		// input will be CaseDate Global Variable
		// format CaseDate Global Variable
		System.out.println(option)
		option = option.replaceAll('D.O.S: ', '')
		String CaseYear = option.substring(8, 10)
		String CaseMonth = option.substring(0, 2)
		String CaseDay = option.substring(3, 5)
		System.out.println("Option")
		System.out.println(option)

		// month dictionary
		Dictionary months = new Hashtable()
		months.put("01","Jan")
		months.put("02","Feb")
		months.put("03","Mar")
		months.put("04","Apr")
		months.put("05","May")
		months.put("06","Jun")
		months.put("07","Jul")
		months.put("08","Aug")
		months.put("09","Sep")
		months.put("10","Oct")
		months.put("11","Nov")
		months.put("12","Dec")

		//Read and Format Calendar Date from Medtel Calendar
		String CalendarDate = WebUI.getText(findTestObject('Page_MedTel/Calendar Objects/button_CalendarDate'))
		CalendarDate = CalendarDate.replaceAll('\\s','')
		String year = CalendarDate.substring(CalendarDate.length() - 2, CalendarDate.length())
		String month = CalendarDate.substring(0, 3)

		System.out.println("CalendarDate,year,CaseYear")
		System.out.println(CalendarDate)
		System.out.println(year)
		System.out.println(CaseYear)
		// Check For Correct Year
		while (year != CaseYear) {
			WebUI.click(findTestObject('Page_MedTel/Calendar Objects/button_YearForward'))

			String new_date = WebUI.getText(findTestObject('Page_MedTel/Calendar Objects/button_CalendarDate'))
			year = new_date.substring(new_date.length() - 2, new_date.length())
		}

		String Casemonths = months.get(CaseMonth)
		while (month != Casemonths) {
			WebUI.click(findTestObject('Page_MedTel/Calendar Objects/button__MonthForward'))

			String new_date = WebUI.getText(findTestObject('Page_MedTel/Calendar Objects/button_CalendarDate'))

			year = new_date.substring(new_date.length() - 2, new_date.length())

			month = new_date.substring(0, 3)
		}
		if (year != CaseYear) {
			WebUI.click(findTestObject('Page_MedTel/Calendar Objects/button__YearBackward'))
		}
		TestObject new_btn = WebUI.modifyObjectProperty(findTestObject('Page_MedTel/Calendar Objects/button_CalendarDay'), 'xpath', 'equals', '//abbr[text()="'+CaseDay+'"]', true)
		WebUI.click(new_btn)
		return
	}

	@Keyword
	def medtelfindCase(String CaseNumber, Boolean Complete) {
		if (Complete == true) {
			WebUI.click(findTestObject('Page_MedTel/Case Status/button_Complete'))
		}
		else {
			WebUI.click(findTestObject('Page_MedTel/Case Status/button_Incomplete'))
		}
		String CaseNum = CaseNumber.replaceAll('\\s', '')
		CaseNum = CaseNumber.substring(6, 11)
		TestObject new_case = WebUI.modifyObjectProperty(findTestObject('Page_MedTel/DIVs/div_Casebutton'), 'xpath', 'equals', '//span[text()="'+CaseNum+'"]', true)
		while(WebUI.verifyElementPresent(new_case,3,FailureHandling.OPTIONAL)==false){
			WebUI.click(findTestObject('Page_MedTel/Case Status/button_CaseNextPage'))
		}
		WebUI.click(new_case)
		GlobalVariable.CaseNum2 = CaseNum
		return
	}
	@Keyword
	def removeICDcode(String ICDcode) {
		// ICDcode should be given in format 'x##', i.e 'S22'
		TestObject rmvICD = WebUI.modifyObjectProperty(findTestObject('Page_MedTel/span-p-li-misc/ICDcode'),'xpath','equals','//span[contains(text(),"'+ICDcode+'")]/following-sibling::node()',true)
		WebUI.click(rmvICD)
		return
	}

	@Keyword
	def removeAnesthesia(String Atype) {
		// Atype should be given in format 'Anesthesia Type' i.e 'BB', 'Spinal'
		TestObject aType = WebUI.modifyObjectProperty(findTestObject('Page_MedTel/span-p-li-misc/RemoveAnesthesiaType'),'xpath','equals','//span[text()="'+Atype+'"]/following-sibling::node()',true)
		WebUI.click(aType)
		return
	}

	@Keyword
	def removeImplant(String implantType) {
		// implantType should be given in format 'Implant Type' i.e 'No Implant Required'
		TestObject implant = WebUI.modifyObjectProperty(findTestObject('Page_MedTel/span-p-li-misc/implantType'),'xpath','equals','//p[contains(text(),"'+implantType+'")]/ancestor::tr/td/button',true)
		WebUI.click(implant)
		return
	}

	@Keyword
	def addPositionBedType(TestObject Position, TestObject BedType, String number) {
		WebUI.click(findTestObject('Page_MedTel/BUTTONS/button_Add Position and Bed Type'))
		TestObject positionmenu = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_MedTel/Patient Positions NYU and MST Spine/Patient Position 1 Spine'),'xpath','equals', '//*/text()[normalize-space(.)="Positions and Bed Types"]/parent::*/following-sibling::div['+number+']/div[1]',true)
		WebUI.click(positionmenu)
		WebUI.click(Position)
		TestObject bedtypemenu = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_MedTel/Patient Positions NYU and MST Spine/Bed Type 1 Spine'),'xpath','equals', '//*/text()[normalize-space(.)="Positions and Bed Types"]/parent::*/following-sibling::div['+number+']/div[2]',true)
		WebUI.click(bedtypemenu)
		WebUI.click(BedType)
		return
	}
	@Keyword
	def clearTextField(TestObject textField){
		String text = WebUI.getAttribute(textField, 'value')
		while (text!=''){
			WebUI.sendKeys(textField, Keys.chord(Keys.BACK_SPACE))
			text = WebUI.getAttribute(textField, 'value')
		}
		return
	}
	@Keyword
	def inputHeight(String feet,String inches){
		WebUI.sendKeys(findTestObject('Page_MedTel/INPUTS/input__Height Feet'),Keys.chord(Keys.BACK_SPACE))
		String foot = WebUI.getAttribute(findTestObject('Page_MedTel/INPUTS/input__Height Feet'),'value')
		while (foot != feet){
			WebUI.sendKeys(findTestObject('Page_MedTel/INPUTS/input__Height Feet'),Keys.chord(Keys.UP))
			foot = WebUI.getAttribute(findTestObject('Page_MedTel/INPUTS/input__Height Feet'),'value')
		}
		WebUI.sendKeys(findTestObject('Page_MedTel/INPUTS/input__Height Inches'),Keys.chord(Keys.BACK_SPACE))
		String inch = WebUI.getAttribute(findTestObject('Page_MedTel/INPUTS/input__Height Inches'),'value')
		while (inch != inches){
			WebUI.sendKeys(findTestObject('Page_MedTel/INPUTS/input__Height Inches'),Keys.chord(Keys.UP))
			inch = WebUI.getAttribute(findTestObject('Page_MedTel/INPUTS/input__Height Inches'),'value')
		}
		return
	}
	@Keyword
	def confirmCaseStatus(String CaseNumber,String status, Boolean click){
		// The goal of this keyword is to confirm the status of a case, without clicking it. As long as the case is
		// present on the page, it can be observed. Current form only checks if a case is canceled, but can be
		//expanded to confirm any status.

		//status given as "1"-incomplete,"2",-pending override....according to dictionary

		String caseNum = CaseNumber.replaceAll('\\s', '')
		caseNum = CaseNumber.substring(6, 11)

		Dictionary buttonTypes = new Hashtable()
		buttonTypes.put("1","Incomplete")
		buttonTypes.put("2","Pending Override Requests")
		buttonTypes.put("3","Case Alerts")
		buttonTypes.put("4","Complete")
		buttonTypes.put("5","Canceled")
		buttonTypes.put("6","Closed")

		Dictionary statusTypes = new Hashtable()
		statusTypes.put("1","INCOMPLETE")
		statusTypes.put("2","PENDING_OVERRIDE")
		statusTypes.put("3","ALERT")
		statusTypes.put("4", "COMPLETE")
		statusTypes.put("5", "CANCELED")
		statusTypes.put("6","CLOSED")

		String confirmStatus = statusTypes.get(status)
		String buttonStatus = buttonTypes.get(status)
		WebUI.scrollToElement(findTestObject('Object Repository/Page_MedTel/Case Status/button_'+buttonStatus),3)
		WebUI.click(findTestObject('Object Repository/Page_MedTel/Case Status/button_'+buttonStatus))

		TestObject new_case = WebUI.modifyObjectProperty(findTestObject('Page_MedTel/DIVs/div_Casebutton'), 'xpath', 'equals', '//span[text()="'+caseNum+'"]', true)
		while(WebUI.verifyElementPresent(new_case,3,FailureHandling.OPTIONAL)==false){
			WebUI.click(findTestObject('Page_MedTel/Case Status/button_CaseNextPage'))
		}

		TestObject check_case = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_MedTel/DIVs/div_Casebutton'), 'xpath', 'equals', '//span[text()="'+caseNum+'"]/ancestor::tr', true)
		Boolean flag = WebUI.verifyElementAttributeValue(check_case, 'status', confirmStatus, 3, FailureHandling.STOP_ON_FAILURE)
		System.out.println(flag)
		if (flag == true){
			if (click ==true){
				WebUI.click(new_case)
				return
			}
			return
		}
		else{
			System.out.println("FLAG: Case has not been Canceled")
			// I'm going to try a broken line to see if it will cause the test case to fail...
			WebUI.click(findTestObject('BREAK'),FailureHandling.STOP_ON_FAILURE)
		}

		return
	}
	@Keyword
	def confirmCommentPresent(Integer numberOfComments){
		Integer n=1
		while(n!=numberOfComments+1){
			String x = n.toString()
			TestObject comment = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_MedTel/Case Navigation/Comments/table_commentEntry'),'xpath','equals','//th[text()="Comment"]/ancestor::table/tbody/tr['+x+']',true)
			TestObject commentText = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_MedTel/Case Navigation/Comments/table_commentEntry'),'xpath','equals','//th[text()="Comment"]/ancestor::table/tbody/tr['+x+']/td[1]',true)

			if(WebUI.verifyElementPresent(comment,3,FailureHandling.OPTIONAL)==true){
				String text =WebUI.getText(commentText)
				if(text != 'There are no comments on this case'){
					n=n+1
				}
				else{
					System.out.println("FLAG: Comment Not Present! Trying Refresh.")
					try {
						WebUI.refresh()
						WebUI.verifyElementPresent(comment,3,FailureHandling.OPTIONAL)
					} catch (Exception e) {
						WebUI.click(findTestObject('BREAK'),FailureHandling.STOP_ON_FAILURE)
					}
				}
			}
			else{
				System.out.println("FLAG: Comment Not Present! Trying Refresh.")
				try {
					WebUI.refresh()
					WebUI.verifyElementPresent(comment,3,FailureHandling.OPTIONAL)
				} catch (Exception e) {
					WebUI.click(findTestObject('BREAK'),FailureHandling.STOP_ON_FAILURE)
				}
			}
		}
		return
	}

}
