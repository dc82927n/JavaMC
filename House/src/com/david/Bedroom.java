package com.david;

public class Bedroom {
        private String name;
        private Wall wall1;
        private Wall wall2;
        private Wall wall3;
        private Wall wall4;

        private Ceiling ceiling;
        private Bed bed;
        private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    public void bed(){
        System.out.println("just a message for bed: ");
        // when we did not add this getter. line 11 was red because
        // we need a getter
        bed.make();
    }



}
