package Family;

public class Children {

    private String name;
    private int age;
    private Boolean happy;

    public String getName() {
         return this.name = name;
    }
    public String setName(String name) {
        return this.name;
    }
    public int getAge() {
         return this.age = age;
    }
    public int setAge(int age) {
        return this.age;
    }
    public Boolean getHappy() {
        return happy;
    }
    public void setHappy(){
        this.happy=true;
    }
    public Children(String name, int age, boolean happy) {
        this.name = name;
        this.age = age;
        this.happy= happy;
    }

    public boolean enjoy() {
        if (this.happy == true) {
        }
        return happy;
    }
}
