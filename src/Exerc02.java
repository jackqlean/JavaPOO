public class Exerc02 {
    public static void main(String[] args) {
        double peso,altura,imc;
        peso = 81.0;
        altura = 1.72;

        imc = peso/(altura * altura);
        System.out.printf("Seu imc é : %.2f kg/m²",imc);
    }
}
