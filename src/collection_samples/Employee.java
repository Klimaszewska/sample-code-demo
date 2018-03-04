package collection_samples;

import java.util.Date;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private EmployeeGender gender;
    private Date hireDate;

    //private constructor which refers to the builder
    private Employee(EmployeeBuilder builder){
        this.employeeId = builder.employeeId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.hireDate = builder.hireDate;
    }

    //getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmployeeGender getGender() {
        return gender;
    }

    public void setGender(EmployeeGender gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }


    //a nested, static builder class
    public static class EmployeeBuilder{
        private int employeeId;
        private String firstName;
        private String lastName;
        private EmployeeGender gender;
        private Date hireDate;

        public EmployeeBuilder employeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public EmployeeBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder gender(EmployeeGender gender){
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder hireDate(Date hireDate){
            this.hireDate = hireDate;
            return this;
        }
    }
}
