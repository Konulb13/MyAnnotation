public class Main {
    public static void main(String[] args) {
        @MyAnnotation(a = 42,b =38)
        public void annMethod (int a,int b){
            System.out.println(a+b);
    }

}

    }