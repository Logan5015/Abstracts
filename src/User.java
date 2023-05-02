public abstract class User {

    protected String firstName, lastName;

    public User(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName()
    {
        return(firstName+" "+lastName);
    }

}
