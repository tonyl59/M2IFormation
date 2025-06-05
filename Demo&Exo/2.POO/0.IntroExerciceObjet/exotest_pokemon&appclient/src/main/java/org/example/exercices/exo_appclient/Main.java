package org.example;
import org.example.classes.AppClient;

public class Main {
    public static void main(String[] args) {
        AppClient client = new AppClient();

        String lePrenom = client.getPrenom();
        System.out.println(lePrenom);
        //client.setPrenom("toto");
        //client.setPrenom("Maria");
        System.out.println(client.getPrenom());

        /*
        String[] clientA = {"Antoine", "antoine@utopios.net"};
        String[] clientB = {"Julia", "julia@utopios.net"};
        AppClient client;
        System.out.println(client.nom.toLowerCase); //"cannot invoke string.tolowercase because "client.nom" is null... se passe quand on a pas de valeur par defaut sur le constructeur
        */
        var prenomClient = client.getPrenom();
        var nomClient = client.getNom(); // nom et prenom sont en private donc faut passer par des set et get
        var emailClient = client.email; // emailclient et mdpclient en public sont pas besoin de passer par des set et get
        var mdpClient = client.motDePasse;

        System.out.println(client);

    }


}