package day05;

import org.junit.Test;

public class C01_Notasyon {
    // javadaki gibi selenium da da belirli islevleri yapan methodlar olusturabiliriz
   // ancak bu methodlar cagrilmadikca Calismazlar
    public void ilkTestMethodu(){
        System.out.println("ilk test methodumuz");
    }
    //juNIT ILE NOTASYON KULLANARAK siradan methodlari test methoduna donusturebiliriz
    // bir test methodu bagimsiz olarak calisabilen test yapmamiza imkan verir
    // @Test notasyonu sayesinde main method mecburuyeti ortadan kalkar
    @Test
    public void notasyonluilkTestMethodu(){
        System.out.println("notasyonlu ilk test methodumuz");
    }
}
