package com.company;

public class Principal extends Applicant{

    public Principal(String firstName, String secondName){
        super(firstName,secondName);
    }
   /* public Principal(int age, String className) {
        super(age, className);

    }*/

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getSecondName() {
        return super.getSecondName();
    }

    public String admit(){
        int age = super.getAge();
        if(age < 10 ){
            return "Admmision Denied!!! try next Year";
        }
        else if (age > 10 && age < 12){
            return "Congratulation You have been Granted Admmision into jss1";
        }
        else if (age > 12 && age < 15){
            return "Congratulation You have been Granted Admmision into jss2";
        }
        else if (age > 15 && age < 17){
            return "Congratulation You have been Granted Admmision into jss3";
        }
        else if (age > 17 && age < 19){
            return "Congratulation You have been Granted Admmision into SS1";
        }
        else if (age > 19 && age < 21){
            return "Congratulation You have been Granted Admmision into SS2";
        }
        else {
            return "Youve been Admitted to SS3";
        }
    }

    public String expel(String name){
        return (name + " You Have Been Expelled");
    }
}
