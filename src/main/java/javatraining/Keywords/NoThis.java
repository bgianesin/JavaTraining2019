package javatraining.Keywords;

public class NoThis {
    int id;
    String  name;

    NoThis(int id, String name) {
        id = id;
        name = name;
        //setId(id);
        //setName(name);
    }

    void show() {
        System.out.println("Show id :" + getId());
        System.out.println("Show name :" + getName());
    }

    public static void main(String[] args) {
        NoThis oNT = new NoThis(5, "41");
        oNT.show();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
