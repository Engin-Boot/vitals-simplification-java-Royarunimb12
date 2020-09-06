package vitals;

public class Main {

    private static float[] BP_limits={70,150};
    private static float[] Spo2_Limits={30,100};
    private static float[] RespRate_Limits={30,95};

    static boolean isbpOk(float bpm){
        return isVital_LimitsOk(bpm, BP_limits[0], BP_limits[1]);
    }
    static boolean isSpo2Ok(float spo2)
    {
        return isVital_LimitsOk(spo2, Spo2_Limits[0], Spo2_Limits[1]);
    }
    static boolean isRespRateOk(float respRate)
    {
        return isVital_LimitsOk(respRate, RespRate_Limits[0], RespRate_Limits[1]);
    }

    static boolean isVital_LimitsOk(float val, float high, float low)
    {
        return (val >= low && val <= high);
    }


    public static void main(String[] args) {
        assert(isbpOk(80)==true);
        
        System.out.println("Some more tests needed");
    }
}
