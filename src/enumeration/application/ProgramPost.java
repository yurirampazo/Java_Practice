package enumeration.application;

import enumeration.entities.Comment;
import enumeration.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramPost {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Woow, that's awesome");
        Post p1 = new Post(sdf.parse("21/03/2021 13:05:76"),
                "Travelling to New Zeland",
                "I'll visit this awesome Country!!!", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        Post p2 = new Post(sdf.parse("23/04/2021 13:05:76"),
                "Good night guys", "See you tomorrow!", 5);

        Comment c3 = new Comment("May the force be with you!");
        Comment c4 = new Comment("C yaa!");
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println("-------------");
        System.out.println(p2);



    }
}
