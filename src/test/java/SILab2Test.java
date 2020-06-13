import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILab2Test {
    private List<String> createList(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    void everyBranchAndStatementTest(){
        RuntimeException ex;

        ex= assertThrows(RuntimeException.class, ()->SILab2.function(null,createList("Bojan")) );
        assertTrue(ex.getMessage().contains("The user argument is not initialized!"));

        User user1=new User(null,"vafla","bojan@live.com");
        ex= assertThrows(RuntimeException.class, ()->SILab2.function(user1,createList("Bojan,Riste,Marko")) );
        assertTrue(ex.getMessage().contains("User already exists!"));

        User user2=new User("Dimitar","@ssL@", null);
        assertTrue(user2.getEmail()==null);

        User user3=new User("Krste","badpassword2020","Kamber");
        assertTrue(!user3.getEmail().contains("@") || !user3.getEmail().contains("."));

        User user4=new User("Krste","badpassword2020","bojan.gavreski@students.finki.ukim.mk");
        assertTrue(user4.getEmail().contains("@") && user4.getEmail().contains("."));
    }
}
