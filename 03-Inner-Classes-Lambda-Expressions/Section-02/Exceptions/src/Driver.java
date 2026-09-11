public class Driver {
    public static void main(String[] args) {
        Person.Bar b = new Person.Bar();

        // Driver.foo();
        // foo();        
        
        try {
            Person p = new Person();
    
            p.setAge(-15);
            
            System.out.println(p.getAge());
            
        }
        catch(Person.InvalidAgeException e){
            System.out.println("caught person invalid age");

            if(e instanceof RuntimeException){
                System.out.println("Caught Runtime exception here");
                System.out.println(e.getMessage());
                e.printStackTrace();

            }
            // handle something
        }
    }

    public static void foo(){

    }
}