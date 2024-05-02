import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MyAnnClass an = new MyAnnClass();
        Class<?> cl = an.getClass();
        Method [] allMethods = cl.getDeclaredMethods();
        for (Method m : allMethods){
            MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
            int a = myAnnotation.a();
            int b = myAnnotation.b();
            an.annMethod(a,b);
        }

    }

}
class MyAnnClass{
    @MyAnnotation(a = 42,b = 38)
    public void annMethod (int a,int b){
        System.out.println( "a = " + a +"b = " + b );
    }
 }
