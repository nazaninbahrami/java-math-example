// neveshte shode tavasote nazanin bahrami

public class MathExample {
    public static void main(String[] args) {
        double radians = 45.0;
        double d1 = 5.0, d2 = 6.5;
        int num, x = 10, y = 20;
        double degree = 90.0;
        double p = -5.36;

        // mohasebe cos zavie 45 daraje
        System.out.println("cos(" + radians + ") = " + Math.cos(Math.toRadians(radians)));
        // mohasebe 5.0 be tavan 6.5
        System.out.println("pow(" + d1 + ", " + d2 + ") = " + Math.pow(d1, d2));
        // peyda kardan meghdar bozorgtar beyn 10 va 20
        System.out.println("max(" + x + ", " + y + ") = " + Math.max(x, y));
        // peyda kardan meghdar koochaktar beyn 5.0 va 6.5
        System.out.println("min(" + d1 + ", " + d2 + ") = " + Math.min(d1, d2));
        // mohasebe jazr 20
        System.out.println("sqrt(" + y + ") = " + Math.sqrt(y));
        // gerd kardan 6.5
        System.out.println("round(" + d2 + ") = " + Math.round(d2));
        // gerd kardan be samt bala -5.36
        System.out.println("ceil(" + p + ") = " + Math.ceil(p));
        // gerd kardan be samt payin -5.36
        System.out.println("floor(" + p + ") = " + Math.floor(p));
        // tabdil 90 daraje be radian
        System.out.println("toRadians(" + degree + ") = " + Math.toRadians(degree));
        // mohasebe e be tavan 5.0
        System.out.println("exp(" + d1 + ") = " + Math.exp(d1));

        // tolide 5 adade tasadofi sahih koochiktar ya mosavi 5
        System.out.println("Generate 5 integer random numbers less than or equal 5:");
        for (int i = 1; i <= 5; i++) {
            num = (int) (5 * Math.random());
            System.out.print("num" + i + " = " + num + "\t");
        }
    }
}


// khorooji:

/*
cos(45.0) = 0.7071067811865476
pow(5.0, 6.5) = 34938.56214843421
max(10, 20) = 20
min(5.0, 6.5) = 5.0
sqrt(20) = 4.47213595499958
round(6.5) = 7
ceil(-5.36) = -5.0
floor(-5.36) = -6.0
toRadians(90.0) = 1.5707963267948966
exp(5.0) = 148.4131591025766
Generate 5 integer random numbers less than or equal 5:
num1 = 1	num2 = 3	num3 = 3	num4 = 2	num5 = 4	
*/
