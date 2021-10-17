package com.company;

abstract class Non_AcademicStaff extends Staff{
    private String documentation;

    public Non_AcademicStaff(String firstName,String secondName){
        super(firstName,secondName);
        this.documentation = documentation;

    }
    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }


    /*@Override
    public long getStaffId(int id) {
        return id;
    }*/

    @Override
    public String JobSpecification(String work) {
        return documentation;
    }
}
