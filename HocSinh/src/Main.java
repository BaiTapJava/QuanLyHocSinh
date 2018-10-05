public class Main {
    public static void main(String[] args) {

        HocSinh studentManager = new HocSinh();
        studentManager.displayAll();

        HocSinh andy = new HocSinh("Andy", 23);
        studentManager.add(andy);
        System.out.println("added " + andy.getInfomation());
        studentManager.displayAll();

        HocSinh booby = new HocSinh("Booby", 25);
        studentManager.add(booby);
        System.out.println("added " + booby.getInfomation());
        studentManager.displayAll();

        HocSinh samy = new HocSinh("Samy", 22);
        studentManager.add(samy);
        System.out.println("added " + samy.getInfomation());
        studentManager.displayAll();
    }
}
