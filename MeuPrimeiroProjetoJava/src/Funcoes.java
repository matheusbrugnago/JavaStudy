package JavaStudy.MeuPrimeiroProjetoJava.src;

public class Funcoes {
    public static void main(String[] args){
        calc(30,40);
        percentagem(15,100);
        mediaTresNumeros(5,6,10);
    }

    static void calc(int x,int y){
        //static void > declaração padrão
        // sun> NOME DA FUNÇÃO( PODERIA SER QLQER COISA)
        //(tipo nomeDaVariavel)
        //{} > Bloco de código
        System.out.println(x + y);
        System.out.println(x-y);
        System.out.println(x / y);
        System.out.println( x * y);
    }

    static void percentagem(double a,double b){
        System.out.println((a/100)*b);
    }
    static void mediaTresNumeros(double um,double dois,double tres){
        System.out.println((um+dois+tres)/3);
    }
}
