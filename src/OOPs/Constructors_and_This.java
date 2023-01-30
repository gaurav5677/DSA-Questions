package OOPs;

public class Constructors_and_This {
    public static class Person {
        int age;
        String name;

        void saysHi() {
            System.out.println(name + "[" + age + "] says hi");
        }


        // if we forget , java provides our class a default constructor
        Person(){
            // constructor
        }

        Person( int age , String name ){
            this.age = age ;
            this.name = name ;
        }

    }

    public static void main(String[] args) {

        main.Person p1 = new main.Person();
        p1.age = 10;
        p1.name = "A";
        p1.saysHi();


       Person p2 = new Person(20 , "B");
       p2.saysHi();
    }

//    public static void swap(Person psn1, Person psn2) {
//
//        Person temp = psn1;
//        psn1 = psn2;
//        psn2 = temp;
//    }


}
