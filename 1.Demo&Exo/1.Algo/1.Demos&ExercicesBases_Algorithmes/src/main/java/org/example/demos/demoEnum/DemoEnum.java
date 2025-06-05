package org.example.demos.demoEnum;

public class DemoEnum {
    public static void main(String[] args) {
        // Role userRole = "ADMIN"; Fonctionne pas car le type Role n'utilise pas de chaine de caractere
        Role userRole = Role.MODO;
        System.out.println(userRole);
    }
}
