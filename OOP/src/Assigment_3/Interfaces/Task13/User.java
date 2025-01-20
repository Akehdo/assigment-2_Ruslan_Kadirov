package Assigment_3.Interfaces.Task13;

public class User implements  DBObject {
    long id;
    String name;

    @Override
    public DBObject initializeIdAndName(long id, String name) {
        this.id = id;
        this.name = name;
        return this;
    }

    public String toString() {
        return String.format("The user's name is %s, id = %d", name, id);
    }

}
