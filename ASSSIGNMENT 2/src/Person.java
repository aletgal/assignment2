public abstract class Person {
    private static int nextId = 1;
    private String name;
    private String surname;
    private int id;


    public Person(){
        this.id = nextId++;
    }

    public Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

}
