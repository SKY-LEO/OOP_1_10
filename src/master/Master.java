package master;

public class Master {
    private static String str1 = " private ";
    protected static String str2 = " protected ";
    static String str3 = " default ";
    public static String str4 = " public ";

    @Override
    public String toString() {
        return "Классу Master доступны переменные с модифакотрами доступа: " + Master.str1 + Master.str2
                + Master.str3 + Master.str4;
    }
}
