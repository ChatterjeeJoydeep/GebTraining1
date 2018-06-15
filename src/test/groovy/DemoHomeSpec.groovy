import geb.spock.GebSpec

class DemoHomeSpec extends GebSpec {

    def "can go to the basic example page"() {
        when:
        to DemoHomePage

        and:
        clickOnStartPractising()
        sleep(500)

        then:
        basicText. getAttribute('innerText').contains("BASIC")
    }
    def "go to simple form demo page"() {
        when:
        to DemoHomePage

        and:
        clickOnSimpleFormDemo()
        sleep(500)

        then:
        at SimpleFormPage
    }
}