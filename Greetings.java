
/*
 *Simiao Wang
 *Assignment 1
 *5100
 *Section 8
 */
public class Greetings {
    private String msg;

    public Greetings(String newmessage){
        msg = newmessage;
    }
    public void greet(){
        System.out.println(msg);
    }
    public static void main (String args[]){
        Greetings putanyword = new Greetings( "I can do it!");
        putanyword.greet();

    }
}