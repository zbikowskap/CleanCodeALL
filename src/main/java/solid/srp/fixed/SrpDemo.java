package solid.Srp;

import java.util.List;

public class SrpDemo {
    public static void main(String[] args) {

        Person person1 = new Person("Jan","Kowalski");
        Person person2 = new Person("Ada","Loczek");
        Person person3 = new Person("Ola","Nowak");
        Person person4 = new Person("Janek","Kowalski");
        person1.setAge(33);
        person2.setAge(16);
        person3.setAge(22);
        person4.setAge(88);

        if(DrivingLicenseRules.canGetDrivingLicense(person1)){
            System.out.println(person1.getSurname()+ " "+ person1.getName()+ " can have driving license");
        }else{
            System.out.println(person1.getSurname()+ " "+ person1.getName()+ " can't have driving license");
        }

        List<Person>people = List.of(person1,person2,person3,person4);
        people.stream()
                .filter(DrivingLicenseRules::canGetDrivingLicense)
                .forEach(x -> System.out.println(x.getName()+ " "+ x.getSurname() + " can get license"));

    }
}
