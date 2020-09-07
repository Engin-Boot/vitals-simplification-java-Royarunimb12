package vitals;

public class Tests {
    public static void runTests(){
        VitalsConditions.addVital(new Vitals("bpm",50,30,100));
        VitalsConditions.addVital(new Vitals("spo2",50,20,100));
        VitalsConditions.addVital(new Vitals("respRate",60,30,100));
        if(VitalsConditions.checkIfAllVitalsOk(VitalsConditions.getallVitals())==true)
            System.out.println("ok");
        VitalsConditions.lvit.clear();

        VitalsConditions.addVital(new Vitals("bpm",102,30,100));
        VitalsConditions.addVital(new Vitals("spo2",50,20,100));
        VitalsConditions.addVital(new Vitals("respRate",60,30,100));
        if(VitalsConditions.checkIfAllVitalsOk(VitalsConditions.getallVitals())==false)
            System.out.println("ok");
        VitalsConditions.lvit.clear();

        VitalsConditions.addVital(new Vitals("bpm",50,30,100));
        VitalsConditions.addVital(new Vitals("spo2",19,20,100));
        VitalsConditions.addVital(new Vitals("respRate",60,30,100));
        if(VitalsConditions.checkIfAllVitalsOk(VitalsConditions.getallVitals())==false)
            System.out.println("ok");
        VitalsConditions.lvit.clear();

        VitalsConditions.addVital(new Vitals("bpm",50,30,100));
        VitalsConditions.addVital(new Vitals("spo2",50,20,100));
        VitalsConditions.addVital(new Vitals("respRate",150,30,100));
        if(VitalsConditions.checkIfAllVitalsOk(VitalsConditions.getallVitals())==false)
            System.out.println("ok");
        VitalsConditions.lvit.clear();



    }
}
