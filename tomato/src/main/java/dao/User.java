package dao;

import java.util.UUID;

public class User {
    public static void main(String[] args) {
        for( int i = 0; i< 10; i++){
            UUID uuid = UUID.randomUUID();
            String s = uuid.toString();
            System.out.println(s);
            System.out.println(s.length());
        }
    }
}
