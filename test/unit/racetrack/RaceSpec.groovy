package racetrack

import grails.test.mixin.TestFor
import org.grails.datastore.gorm.finders.MethodExpression
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Race)
class RaceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        def race = new Race(distance: 5.0)
        expect:
        3.107 == race.inMiles()

    }
}
