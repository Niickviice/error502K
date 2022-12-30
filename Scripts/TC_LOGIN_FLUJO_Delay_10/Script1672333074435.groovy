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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://pru-gnp-lab-migtec-portal.biaani.com/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/button_Iniciar sesin'), 10)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/button_Iniciar sesin'), 10) == true) {
	WebUI.setText(findTestObject('Object Repository/input_La contrasea quehas introducido es in_6ef811'),
		'608')
WebUI.setText(findTestObject('Object Repository/input_Deseas                               _b18aba'),
		'GNP')
WebUI.waitForElementClickable(findTestObject('Object Repository/button_Iniciar sesin'), 5)

	WebUI.click(findTestObject('Object Repository/button_Iniciar sesin'))

	WebUI.waitForPageLoad(5)}


WebUI.click(findTestObject('Object Repository/span_Oferta Educativa'))

WebUI.click(findTestObject('Object Repository/a_IDEAS GNP'))

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false)) {
    WebUI.click(findTestObject('Object Repository/span_Mi Plan de Carrera'))
} else {
         WebUI.closeBrowser()   
        }

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false)) {
	WebUI.click(findTestObject('Object Repository/a_Mis Avances'))
} else {
	WebUI.closeBrowser()
}
if (WebUI.verifyTextNotPresent('502 Bad Gateway', false)) {
	WebUI.click(findTestObject('Object Repository/span_Mi Fuerza de Ventas'))
} else {
         WebUI.closeBrowser()   
        }

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false )) {
	WebUI.click(findTestObject('Object Repository/a_Cursos y Designaciones'))
} else {
         WebUI.closeBrowser()   
        }

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false )) {
	WebUI.click(findTestObject('Object Repository/span_Atraccin y Desarrollo'))
} else {
         WebUI.closeBrowser()   
        }

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false )) {
    WebUI.doubleClick(findTestObject('Object Repository/span_Autoestudio'))
} else {
         WebUI.closeBrowser()   
        }

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false )) {
    WebUI.click(findTestObject('Object Repository/a_Microclases'))
}  else {
         WebUI.closeBrowser()   
        }

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false)) {
   WebUI.doubleClick(findTestObject('Object Repository/a_Artculos'))
} else {
         WebUI.closeBrowser()   
        }

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false )) {
   WebUI.doubleClick(findTestObject('Object Repository/a_tica y Cumplimiento'))
} else {
         WebUI.closeBrowser()   
        }

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false)) {
    WebUI.click(findTestObject('Object Repository/a_Eventos'))
} else {
         WebUI.closeBrowser()   
        }

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false )) {
    WebUI.doubleClick(findTestObject('Object Repository/a_Eventos'))
} else {
         WebUI.closeBrowser()   
        }

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false )) {
    WebUI.doubleClick(findTestObject('Object Repository/a_Campaas'))
} else {
         WebUI.closeBrowser()   
        }

WebUI.delay(600)

if (WebUI.verifyTextNotPresent('502 Bad Gateway', false)) {
    WebUI.click(findTestObject('Object Repository/input_ADAN AGUSTIN GARCIA FIGUEROA MARTINEZ_5049b8'))
}


WebUI.closeBrowser()

