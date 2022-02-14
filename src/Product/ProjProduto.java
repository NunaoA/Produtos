package Product;

import java.util.Scanner;

public class ProjProduto{

        public static void main(String [] args) {

            Scanner sc = new Scanner(System.in);

            Produto p1;
            p1 = new Produto();

            System.out.println(" 1º Produto! ");

            System.out.println(" Nome: ");
            p1.name = sc.nextLine();

            System.out.println("Preço: ");
            p1.price = sc.nextDouble();

            System.out.println(" Quantidade: ");
            p1.quantidade = sc.nextInt();

            System.out.printf("Os dados do produto são:" + p1.name + " , "  + p1.price + ", " + p1.quantidade );



            System.out.println("Deseja adicionar produtos? Se sim quantos? ");

        }


}
