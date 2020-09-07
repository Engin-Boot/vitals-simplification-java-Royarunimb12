package vitals;

import java.util.ArrayList;
import java.util.List;

public class VitalsConditions {
    public static List<Vitals> lvit = new ArrayList<>();
    public static IReporter irep=new ReporterPlugins();

    static void addVital(Vitals vital) {
        lvit.add(vital);
    }
    static List<Vitals> getallVitals(){
        return lvit;
    }



    static boolean checkVitalHigh(Vitals vital) {
        if (vital.getValue() > vital.getHighValue()) {
            irep.alert(vital.getVitalName(),"is high");
            return true;
        }
        else{
            return false;
        }

    }


    static boolean checkVitalLow(Vitals vital){
        if(vital.getValue()<vital.getLowValue()) {
            irep.alert(vital.getVitalName(), "is low");
            return true;
        }
        else{
            return false;
        }
    }

    static boolean isVitalcheckOk(Vitals vital){
        if(checkVitalHigh(vital)==false && checkVitalLow(vital)==false)
            return true;
        return false;
    }

    static boolean checkIfAllVitalsOk(List<Vitals> lvit){
        for(Vitals vital: lvit)
        {
            if(!isVitalcheckOk(vital))
                return false;
        }
        return true;
    }


}
