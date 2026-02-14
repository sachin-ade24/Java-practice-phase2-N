package practice2026;

public class PracticeFeb11_2_2{
	
    String name;

    PracticeFeb11_2_2(String name) {
        this.name = name;
    }

    void sendToPrinter() {
    	PracticeFeb11_2_1 p = new PracticeFeb11_2_1();
        p.print(this);
    }
	
}
