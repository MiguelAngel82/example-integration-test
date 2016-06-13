import example.integration.tests.Book

class BootStrap {

    def init = { servletContext ->
        println "[BOOTSTRAP] Books: ${Book.findByName('test')}"
    }
}
