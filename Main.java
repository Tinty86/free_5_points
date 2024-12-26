
public class Main {
    public static void main(String[] args) {
        Smartphone newSmartphone = new Smartphone.Builder("Galaxy s24 ultra", "Samsung")
                .setGlobal(true)
                .setFlagman(true)
                .build();
        System.out.println("model is " + newSmartphone.model);
        System.out.println("producing company is " + newSmartphone.producing_company);
        System.out.println(newSmartphone.is_Global ? "Smartphone is global" : "Smartphone is not global");
        System.out.println(newSmartphone.is_Flagman ? "Smartphone is a flagman" : "Smartphone is not a flagman");
    }
}