//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal perro = new Animal() {
            @Override
            public void hacerSonido() {


                System.out.println("guguaasdfsdfuu");
            }

            @Override
            public void saludar() {
                System.out.println("Hola soy un perrro guauudg");



            }
        };

        Animal gato = new Animal(){
            @Override
            public void hacerSonido() {
                System.out.println("Miamiaumiau");

            };


            Animal gato1 = new Animal(){

                @Override
                public void hacerSonido(){
                    System.out.println("Miamiaumiau");
                }

                @Override
                public void saludar() {
                    System.out.println("Miamiaumiau");
                }
            };




            @Override
            public void saludar(){
                System.out.println("Hola soy un gato. Miamiaumiau");

            }

        };


        Raza gatoRaza = ()-> System.out.println("Hola gato soy de raza gatubela");


        perro.hacerSonido();

        perro.saludar();

        gato.saludar();

        gato.hacerSonido();

        gatoRaza.tipoRaza();
    }
}