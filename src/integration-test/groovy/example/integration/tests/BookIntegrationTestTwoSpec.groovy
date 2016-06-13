package example.integration.tests

import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class BookIntegrationTestTwoSpec extends Specification {

    void setupSpec(){
        println '[TEST] Executing BookIntegrationTestTwoSpec'
    }

    void "saves a Book"() {
        expect:
        new Book(name: 'test2', isbn: 'isbn2').save(flush:true)
        Book.count
    }
}
