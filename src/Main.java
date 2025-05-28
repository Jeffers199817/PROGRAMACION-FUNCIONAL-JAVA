//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal perro = new Animal() {
            @Override
            public void hacerSonido() {
                System.out.println("Hola soy un perrro guauu");
            }
        };
    }
}