package example.integration.tests

import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class BookIntegrationTestOneSpec extends Specification {

    void setupSpec(){
        println '[TEST] Executing BookIntegrationTestOneSpec'
    }

    void "saves a Book"() {
        expect:
        new Book(name: 'test', isbn: 'isbn').save(flush:true)
        Book.count
    }
}
