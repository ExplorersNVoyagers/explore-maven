import org.av.exploremaven.Person
import spock.lang.Specification

class PersonSpecification extends Specification {

    def "Should throw exception if first name or last name is empty"() {
        given:
        def person = new Person();

        when:
        String fullName = person.getFullName(firstName, lastName);

        then:
        thrown(IllegalArgumentException);

        where:
        firstName << [null, "", " ","A","A","A",null, "", " "];
        lastName << [null, "", " ",null, "", " ","A","A","A"];
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
