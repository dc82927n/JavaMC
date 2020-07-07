public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (double kiloByte){

        double megabytetokiloConversion = kiloByte * 1024;
        

        System.out.println("this is how many mega in a kilo " + megabytetokiloConversion);

    }

    public static void printkiloTomegaConversion (double megabytes){

      double kiloTomegaConversion = megabytes / 1024;
        System.out.println("this is how kilo in a mega " + kiloTomegaConversion);
    }



}
