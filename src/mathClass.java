public class mathClass {
    public static void main(String[] args) {

        System.out.println(Math.round(4.5));
        System.out.println(Math.max(2,4));
        System.out.println(Math.min(3,8));
        System.out.println(Math.ceil(15.0001));
        System.out.println((int)Math.floor(2.5));

        System.out.println(Math.pow(20,4));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(144));

        double a = 3;
        double b = 4;
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println(c);
        System.out.println(Math.abs(-100-50));

        System.out.println((int)(Math.random()*11)+1);

    }
}
