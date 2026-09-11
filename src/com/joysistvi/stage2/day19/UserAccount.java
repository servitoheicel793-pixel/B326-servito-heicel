package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class UserAccount {

        // Private fields - Encapsulation
        private String firstName;
        private String middleName;
        private String lastName;
        private String address;
        private String email;
        private String password;

        // Constructor
    public UserAccount(String firstName, String middleName, String lastName,
                String address, String email, String password) {

            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.address = address;

            setEmail(email);
            setPassword(password);
        }

        // Getters
        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAddress() {
            return address;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        // Setters
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        // Email validation
        public void setEmail(String email) {
            if (email != null && email.contains("@") && email.contains(".")) {
                this.email = email;
            } else {
                this.email = "Invalid Email";
            }
        }

        // Password validation
        public void setPassword(String password) {
            if (password != null && password.length() >= 6) {
                this.password = password;
            } else {
                this.password = "Invalid Password";
            }
    }
}
