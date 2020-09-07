package vitals;

import java.util.ResourceBundle;

public class ReporterFactory {
    public static IReporter getReporterInstance() {
        ResourceBundle.clearCache();

        ResourceBundle rb = ResourceBundle.getBundle("resources/reporter");
        String strclass = rb.getString("cname");
        IReporter reporter = null;
        try {
            Class cls = Class.forName(strclass);
            reporter = (IReporter)cls.newInstance();
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return reporter;
    }
}
