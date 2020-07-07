package com.david;

public class PersonInfo {

   private String firstName;
   private String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        if(age > 100 || age <= 0){
            return 0;
        } else{
            return age;
        }
    }

    public boolean isTeen(){
        if(age > 12 && age < 20 ){
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "error";
        } else {

            return firstName + lastName;
        }
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
