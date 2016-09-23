package kata.v1;

import java.util.Date;

public class KataV1 {

    public static void main(String[] args) {
        Person person = new Person(new Date(95,8,23), "ADR", "Sara");
        System.out.println("La edad de " + person.getName() + " " + person.getSurname() + " es de "+ person.getAge() + " años");
        
    }
}
