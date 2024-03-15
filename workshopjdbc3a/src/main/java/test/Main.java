package test;

import models.Personne;
import service.PersonneService;
import utils.MyDataBase;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        Connection connection=MyDataBase.getInstance().getConnection();
        Connection connection1=MyDataBase.getInstance().getConnection();

        System.out.println(connection);
        System.out.println(connection1);

        PersonneService personneService =new PersonneService();
        try {
         //   personneService.update(new Personne(1,"ben","ali",24));
            System.out.println(personneService.select());
        } catch (SQLException e) {
            System.out.println(e.getMessage());        }
    }

}
