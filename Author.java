
public class Author {
    private String firstName;
   private String lastName;

   public Author(){

   }


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String toString() {
        return String.format("%s %s",
                firstName, lastName);
    }

}
