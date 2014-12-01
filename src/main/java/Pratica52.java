import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

public class Pratica52 {
    public static void main(String[] args){
        Equacao2Grau<Integer> eq1, eq2, eq3, eq4;
        
        try{
            eq1 = new Equacao2Grau<>(1, -1, -20);
            System.out.println(eq1.getRaiz1() + ", " + eq1.getRaiz2());
        }
        catch(RuntimeException re){
            System.out.println(re.getLocalizedMessage());
        }
        
        try{
            eq2 = new Equacao2Grau<>(1, -6, 9);
            System.out.println(eq2.getRaiz1() + ", " + eq2.getRaiz2());
        }
        catch(RuntimeException re){
            System.out.println(re.getLocalizedMessage());
        }
        
        try{
            eq3 = new Equacao2Grau<>(2, 1, 7);
            System.out.println(eq3.getRaiz1() + ", " + eq3.getRaiz2());
        }
        catch(RuntimeException re){
            System.out.println(re.getLocalizedMessage());
        }
        
        try{
            eq4 = new Equacao2Grau<>(0, 3, 4);
        }
        catch(RuntimeException re){
            System.out.println(re.getLocalizedMessage());
        }        
    }
}