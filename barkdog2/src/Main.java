public class Main {

        public static void main(String[] args) {

            boolean results;
            if (barkingdog.bark(true, 7)) results = true;
            else results = false;
            System.out.println(results);

        }

        public static class barkingdog {

             static boolean bark(boolean barking, int hourOfDay) {

                if(!barking){
                    return false;
                } else if (hourOfDay <= 8) {
                    return true;
                } else if ((hourOfDay == 23) && (hourOfDay == 22)){
                    return true;
                } else {
                    return false;
                }
            }


        }
    }


