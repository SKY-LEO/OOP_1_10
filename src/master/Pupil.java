package master;

public class Pupil extends Master {
    @Override
    public String toString() {
        return "Классу Pupil доступны переменные с модифакотрами доступа: " + Master.str2 + Master.str3 + Master.str4;
    }
}
