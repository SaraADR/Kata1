package kata.v1;

import java.util.Date;

public class Person {
    private final Date birthday;
    private final String surname;
    private final String name;

    public Person(Date birthday, String surname, String name) {
        this.birthday = birthday;
        this.surname = surname;
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime() - birthday.getTime())/31536000000L); 
    }
    
    
}
