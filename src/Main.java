import master.Master;
import master.Observer;
import master.Pupil;
import slave.Boss;
import slave.NoName;

public class Main {
    public static void main(String[] args) {
        Master master = new Master();
        Pupil pupil = new Pupil();
        Observer observer = new Observer();
        Boss boss = new Boss();
        NoName noname = new NoName();
        System.out.println(master);
        System.out.println(pupil);
        System.out.println(observer);
        System.out.println(boss);
        System.out.println(noname);
    }
}
