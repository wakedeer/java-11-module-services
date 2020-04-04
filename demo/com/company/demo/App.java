package com.company.demo;

import java.util.ServiceLoader;

public class App {
    public static void main(String[] args) {
        ServiceLoader.load(com.company.service.Service.class)
                .forEach(com.company.service.Service::test);
    }
}
