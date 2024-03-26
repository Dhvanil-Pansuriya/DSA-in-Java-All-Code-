package OppsConcepts;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
    }
}

interface Chess{
    void move();
}

class Queen implements Chess{
    public void move(){
        System.out.println("Queen");
    }
}