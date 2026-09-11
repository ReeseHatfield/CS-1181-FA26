public class Person {
    static class Bar {
        
    }

    static class Baz {

    }

    static class InvalidAgeException extends RuntimeException {
        public InvalidAgeException(String msg){
            super(msg);
        }
    }


    private int age = 30;

    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge){
        if(newAge < 0){
            // InvalidAgeException iae = new InvalidAgeException(newAge + " is not a valid age");

            // throw iae;

            throw new InvalidAgeException(newAge + " is not a valid age");
        }

        this.age = newAge;
    }
    // public void setAge(int newAge) throws InvalidAgeException {
    //     if(newAge < 0){
    //         InvalidAgeException iae = new InvalidAgeException(newAge + " is not a valid age");

    //         throw iae;
    //     }

    //     this.age = newAge;
    // }

}
