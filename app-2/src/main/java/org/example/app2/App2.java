package org.example.app2;

import org.example.service.Service;
import org.example.util2.Util2;

public class App2 {
    public static void main(String[] args) {
        System.out.println(Service.serve(1, Util2.add(2, 3)));
    }
}
