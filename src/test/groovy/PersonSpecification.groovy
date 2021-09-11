import org.av.exploremaven.Person
import spock.lang.Specification

class PersonSpecification extends Specification {

    def setupSpec() {
        System.out.println("setupSpec");
    }

    def setup() {
        System.out.println("setup");
    }
    def cleanup() {
        System.out.println("cleanup");
    }

    def cleanupSpec() {
        System.out.println("cleanupSpec");
    }

    def "Should throw exception if first name or last name is empty"() {
        given:
        def person = new Person();

        when:
        String fullName = person.getFullName(firstName, lastName);

        then:
        System.out.println("setupSpec");
        thrown(IllegalArgumentException);

        where:
        firstName << [null, "", " ", "A", "A", "A", null, "", " "];
        lastName << [null, "", " ", null, "", " ", "A", "A", "A"];
    }

    def "Should return full name if both first name and last name are not empty"() {
        given:
        def person = new Person();

        when:
        String fullName = person.getFullName("P", "K");

        then:
        fullName == "P K";
    }
}
