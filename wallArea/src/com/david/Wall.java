package com.david;

public class Wall {
    //upload test 2

    private double width;
    private double height;

    // constructor.
    public Wall(double width, double height) {
        if(width < 0 && height < 0){
            System.out.println("no measurement, please re-measure.");
        }

        this.width = width;
        this.height = height;
    }

      // function
      public double getArea (){
            return width * height;
      }


    public void setWidth(double width) {
        if(width <= 0){
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        if(height <= 0){
            this.height = 0;
        }

    }

    // return getters
        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }







}
