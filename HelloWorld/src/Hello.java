public class Hello {

    public static void main(String [] args){
        System.out.println("Hello, Javier");
        System.out.println("Hello world");
        boolean isAlien = false;
        if (isAlien==false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        if (topScore >= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore=60;
        if (topScore>secondTopScore && topScore>=100 ){
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <90){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue ==50 )
            System.out.println("This is true");

        boolean isCar = true;
        if (isCar){//booleans can not have a sentence, intellij detect if true for default
            // (!isCar) if you want to have it is false you can put that
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar= "VolksWagen";
        boolean isDomestic= makeOfCar == "VolksWagen" ? false : true;//Operador ternario. Si la primera opcion es vedadera se asigna el booleano despues del signo de interrogacion, sino se asigna el otro booleano por defecto
        //Estos operadores ternarios pueden asigar cualquier tipo de valor, lo unico es que la sentencis si debe de basarse en una operacion de verdadero o falso (booleana)
        //Otra forma funcional de utilizar el operador ternario seria la siguiente:
        //boolean isDomestic = (makeOfCar != "Volkswagen");
        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double var1=(double)20.00;
        double var2=(double)80.00;
        double var3= (var1 + var2)*100.00;
        double var4= var3 % 40.00;
        System.out.println(var4);
        boolean var5 = var4==0 ? true : false;
        System.out.println(var5);
        if (!var5)
            System.out.println("got some reminder");
        
    }
}
