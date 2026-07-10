package classobject;

public class Main {


    static void main() {


        //Florians classobject.Tasse:

        Tasse floriansTasse = new Tasse("123dh", 250, false, new String[]{"grau", "weiß"}, "abgerundet");

//        floriansTasse.size = 250;
//        floriansTasse.material = "keramik";
//        floriansTasse.thermo = false;
//        floriansTasse.form = "abgerundet";
//        floriansTasse.color = new String[]{"grau", "weiß"};

        floriansTasse.setColor(new String[]{"grau", "weiß"});

        System.out.println(floriansTasse.getColor());
        System.out.println(floriansTasse.isThermo());
        System.out.println(floriansTasse.getForm());
        System.out.println(floriansTasse.getMaterial());


        Tasse stanislavsTasse = new Tasse("metall", 200, false, new String[]{"schwarz", "silber"}, "round");
        Tasse jpTasse = new Tasse("material");


        System.out.println(floriansTasse.toString());

    }
}
