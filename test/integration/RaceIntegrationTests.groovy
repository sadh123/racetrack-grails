import racetrack.Race

class RaceIntegrationTests extends GroovyTestCase{

    void testRaceDatesBeforeToday(){

        def lastWeek =new Date()-7
        def race= new Race(startDate: lastWeek)

        assertFalse "validation should not succeed", race.validate()
     assertTrue "there should be errors", race.hasErrors()

        println("\n errors")
        println race.errors?:"no errors found"

        def badField =race.errors.getFieldError('startDate')
        println("\n badField")
        println(badField ?: "StartDate wasn't bad Field")
        assertNull("expecting to find an error on the StartDate Field",badField)

        def code= badField?.codes.find{
            it=='race.startDate.validator.invalid'
        }
        println("\n code")
        println( code?: "the custom validator for StartDate was not found")
        assertNotNull("startDate field should be culprit",code)
    }
}