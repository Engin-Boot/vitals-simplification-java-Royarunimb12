package vitals;

import vitals.IReporter;

class ReporterPlugins implements IReporter {
    @Override
    public void alert(String vitalName, String message) {
        System.out.println(vitalName+" "+message);
    }
}
