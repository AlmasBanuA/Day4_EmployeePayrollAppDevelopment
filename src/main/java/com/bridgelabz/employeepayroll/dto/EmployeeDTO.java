package com.bridgelabz.employeepayroll.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    /**
     * Declaring variables
     * The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
     */
    private String firstName;
    private String lastName;
    private String profilePic;
    private String department;
    private Long salary;
    private LocalDate date;
    private String notes;

    /**
     * The super keyword in Java is a reference variable which is used to refer immediate parent class object.
     */
    public EmployeeDTO() {

        super();
    }

    /**
     * created parameterized constructor with parameters
     * @param firstName
     * @param lastName
     * @param profilePic
     * @param department
     * @param salary
     * @param date
     * @param notes
     */
    public EmployeeDTO(String firstName, String lastName, String profilePic, String department, Long salary,
                       LocalDate date, String notes) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePic = profilePic;
        this.department = department;
        this.salary = salary;
        this.date = date;
        this.notes = notes;
    }

    /**
     * created getter setters
     * @return
     */
    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }


    public String getProfilePic() {

        return profilePic;
    }


    public String getDepartment() {

        return department;
    }


    public Long getSalary() {

        return salary;
    }


    public LocalDate getDate() {

        return date;
    }


    public String getNotes() {

        return notes;
    }

}
