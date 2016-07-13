# Simple example showing integration tests in Grails 3.1.8

This so simple project contains only one domain class (`Book`) and two integration tests. The aim of this project is to show how the integration test are executed.

Book domain contains:

- `String name`
- `String isbn`

And two integration tests:
 
- `BookIntegrationTestOneSpec` with one test named `"saves a Book"`. This test expects that a new `Book` is saved and there is at least one row in domain `Book`.
- `BookIntegrationTestTwoSpec` with one test named `"saves a Book"`. This expects the same than the former one.

There are two important annotations in this tests (at class level): 
 
- `@Integration`. Transformation to apply to integration tests. This annotation allows to have full access to the Grails environment within the test.
- `@Rollback`. The Rollback annotation ensures that each test methods runs in a transaction that is rolled back. Generally this is desirable because you do not want your tests depending on order or application state.

To execute integration test there are two ways:

- Via Grails CLI: 
	`grails test-app -integration`
- Via Gradle Wrapper (**Recommended**): 
	`gradlew integrationTest`
	
	- If you want to execute an individual test you can execute: 
	`gradlew integrationTest --tests example.integration.tests.BookIntegrationTestOneSpec` 
	- Or if you want to execute some tests included in a package: 
   `gradlew integrationTest --tests example.integration.tests.*` 