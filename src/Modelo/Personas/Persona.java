package Modelo.Personas;

public abstract class Persona {

    protected String name;
    protected String lastName;
    protected int age;
    protected boolean sex;
    protected String id;
    protected String phone;

    public Persona(String name, String lastName, int age, boolean sex, String id, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String informacionPersona() {
        return "name=" + name
                + "\nlastName=" + lastName 
                + "\nage=" + age 
                + "\nsex=" + sex 
                + "\nid=" + id 
                + "\nphone=" + phone;
    }

}
