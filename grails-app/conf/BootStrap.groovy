import org.example.domain.Person

class BootStrap {

    def init = { servletContext ->
    	if (Person.count() == 0) {
	    	new Person(firstName: "John", lastName: "Doe").save(flush: true)
    		new Person(firstName: "Jane", lastName: "Smith").save(flush: true)
    	}
    }

    def destroy = {
    }
}
