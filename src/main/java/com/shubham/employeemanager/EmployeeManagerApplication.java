package com.shubham.employeemanager;

import com.shubham.employeemanager.services.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class EmployeeManagerApplication implements CommandLineRunner {

    private final DataService dataService;

    @Value("${my.variable}")
    private String myVariable;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("my variable: " + myVariable);

        System.out.println("The data is: "+dataService.getData());
    }
}
