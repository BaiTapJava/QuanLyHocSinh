public class HocSinh {

    private HocSinh[] students = new HocSinh[20];
    private int size;
    public HocSinh() {
    }
    public void add(HocSinh student) {
        students[size] = student;
        size++;
    }
    private String name;
    private int age;
    public HocSinh(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getInfomation() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void displayAll() {
        if (size == 0) {
            System.out.println("There is no any student in list");
        } else if (size == 1) {
            System.out.println("There is 1 student in list");
            System.out.print(students[0].getInfomation() + "");
            System.out.println();
        } else {
            System.out.println("There are " + size + " students list: ");
            for (int i = 0; i < size; i++) {
                System.out.print(students[i].getInfomation() + ", ");
            }
            System.out.println();
        }
    }
    public void find(String name) {
        int found = 0;
        for (int i = 0; i < size; i++) {
            boolean match = students[i].getName().equals(name);
            if (match) {
                System.out.println("The position of student \""
                        + name
                        + "\" in the list is "
                        + (i + 1));
                found++;
                break;
            }
        }
        boolean notFound = found == 0;
        if (notFound) {
            System.out.println("There is no student with name " + name + " in the list");
        }
    }
}
