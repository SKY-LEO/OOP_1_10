package slave;

import master.Master;

public class Boss extends Master {
    @Override
    public String toString() {
        return "Классу Boss доступны переменные с модифакотрами доступа: " + Master.str2 + Master.str4;
    }
}
