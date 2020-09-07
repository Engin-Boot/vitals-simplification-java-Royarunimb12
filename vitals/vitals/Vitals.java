package vitals;

public class Vitals {
    String vitalName;
    int highValue;
    int lowValue;
    int value;

    public Vitals(String vitalName,int value, int lowValue, int highValue) {
        this.vitalName = vitalName;
        this.value = value;
        this.lowValue = lowValue;
        this.highValue = highValue;


    }

    public String getVitalName() {
        return vitalName;
    }

    public void setVitalName(String vitalName) {
        this.vitalName = vitalName;
    }

    public int getHighValue() {
        return highValue;
    }

    public void setHighValue(int highValue) {
        this.highValue = highValue;
    }

    public int getLowValue() {
        return lowValue;
    }

    public void setLowValue(int lowValue) {
        this.lowValue = lowValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }



}
