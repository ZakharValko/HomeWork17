package ua.alevel;

public class MyObject implements Comparable {
    int id;
    String name;
    int count;

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public MyObject(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
