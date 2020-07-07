public  class Main {

    public static void main(String[] args) {

       boolean results = barkingdog.bark(true, 10);
        System.out.println(results);

    }

    public static class barkingdog {

        public boolean bark(boolean barking, int hourOfDay) {


            if (hourOfDay <= 8) {
                return true;
            } else if ((hourOfDay == 23) && (hourOfDay == 22)){
                return true;
            } else {
                return false;
            }
        }


    }
}
