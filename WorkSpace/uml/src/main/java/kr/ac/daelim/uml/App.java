package kr.ac.daelim.uml;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Marine mr = new Marine();
        Medic md = new Medic();
        
        mr.Attack();
        md.move();
    }
}
