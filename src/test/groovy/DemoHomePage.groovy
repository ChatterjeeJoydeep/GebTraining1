import geb.Page

class DemoHomePage extends Page {

    static at = { title == "Selenium Easy - Best Demo website to practice Selenium Webdriver Online" }

    static content = {
        startPractisingButton { $('a#btn_basic_example') }
        basicText{$('span', text:contains("BASIC"))}
        interExampleButton{$('a#btn_inter_example')}
        inputFormsButton { $('a',text:contains("Input Forms"),0) }
        simpleFormDemoButton { $('a',text:contains("Simple Form Demo"),0) }
    }

    def clickOnStartPractising(){
        waitFor{
            startPractisingButton
        }
        startPractisingButton.click()

    }
    def clickOnSimpleFormDemo(){
        waitFor{
            inputFormsButton
        }
        inputFormsButton.click()
        waitFor{
            simpleFormDemoButton
        }
        simpleFormDemoButton.click()

    }

}
