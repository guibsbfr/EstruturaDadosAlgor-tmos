import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Contato> contatoList = new ArrayList<>(20);


        System.out.print("Quantos contatos serão adicionados ao vetor? ");
        int quantidade = sc.nextInt();
        criarListaContatos(quantidade, contatoList);


        int option;
        do {
            menu();
            option = sc.nextInt();

            Contato contato;
            String name;
            String email;
            int number;
            int posicao;

            switch (option) {
                case 1:

                    System.out.print("Digite o nome do contato: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.print("Digite o email do contato: ");
                    email = sc.nextLine();
                    System.out.print("Digite o numero do contato: ");
                    number = sc.nextInt();

                    contato = new Contato(name, email, number);
                    contatoList.add(contato);

                    break;
                case 2:

                    System.out.print("Digite o nome do contato: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.print("Digite o email do contato: ");
                    email = sc.nextLine();
                    System.out.print("Digite o numero do contato: ");
                    number = sc.nextInt();
                    System.out.print("Digite a posição que o contato será armazenado: ");
                    posicao = sc.nextInt();

                    contato = new Contato(name, email, number);
                    contatoList.add(posicao, contato);

                    break;
                case 3:

                    System.out.print("Digite a posição do contato que você deseja acessar: ");
                    posicao = sc.nextInt();

                    try {
                        System.out.println(contatoList.get(posicao));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Posição inválida");
                    }

                    break;
                case 4:

                    System.out.print("Digite o nome do contato: ");
                    sc.nextLine();
                    name = sc.nextLine();

                    boolean encontrado = false;
                    for (Contato contatos : contatoList) {
                        if (contatos.getName().equals(name)) {
                            encontrado = true;
                            System.out.println(contatos);
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Não existe nenhum contato com este nome.");
                    }
                    break;
                case 5:

                    System.out.print("Digite o nome do contato: ");
                    sc.nextLine();
                    name = sc.nextLine();

                    encontrado = false;
                    int indice = 0;
                    for (Contato contatos : contatoList) {
                        indice++;
                        if (contatos.getName().equals(name)) {
                            encontrado = true;
                            System.out.println("O contato está na posição " + indice);
                        }

                    }
                    if (!encontrado) {
                        System.out.print("Não existe nenhum contato com este nome.");
                    }
                    break;

                case 6:

                    System.out.print("Digite o nome do contato: ");
                    sc.nextLine();
                    name = sc.nextLine();

                    encontrado = false;
                    for (Contato contatos : contatoList) {
                        if (contatos.getName().equals(name)) {
                            encontrado = true;
                            System.out.println(contatos);
                        }
                    }
                    if (!encontrado) {
                        System.out.print("Este contato não existe.");
                    }
                    break;
                case 7:

                    System.out.print("Digite a posição do contato que você deseja deletar: ");
                    posicao = sc.nextInt();

                    try {
                        System.out.println(contatoList.get(posicao));
                        contatoList.remove(posicao);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Posição inválida");
                    }
                    break;
                case 8:

                    System.out.print("Digite o nome do contato: ");
                    sc.nextLine();
                    name = sc.nextLine();

                    posicao = 0;
                    encontrado = false;
                    for (Contato contatos : contatoList) {
                        if (contatos.getName().equals(name)) {
                            encontrado = true;
                            posicao = contatoList.indexOf(contatos);
                        }
                    }
                    if (!encontrado) {
                        System.out.print("Este contato não existe.");
                    }
                    else {
                        contatoList.remove(posicao);
                    }
                    break;
                case 9:

                    int tamanho = 0;
                    for (int i = 0; i < contatoList.size(); i++) {
                        tamanho++;
                    }
                    System.out.println("Tamanho do vetor é de " + tamanho);
                    break;
                case 10:

                    contatoList.clear();

                    break;
                case 11:
                    for (Contato contatos : contatoList) {
                        System.out.println("Lista de contatos: ");
                        System.out.println(contatos);
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;

            }
        } while (option != 0);
    }

    protected static void menu() {

        System.out.println("Digite a opção desejada:");
        System.out.println("1: Adiciona contato no final do vetor");
        System.out.println("2: Adiciona contato em uma posição específica");
        System.out.println("3: Obtém contato de uma posição específica");
        System.out.println("4: Consulta contato");
        System.out.println("5: Consulta último índide do contato");
        System.out.println("6: Verifica se contato existe");
        System.out.println("7: Excluir por posição");
        System.out.println("8: Excluir contato");
        System.out.println("9: Verifica tamanho do vetor");
        System.out.println("10: Excluir todos os contatos do vetor");
        System.out.println("11: Imprime vetor");
        System.out.println("0: sair");

    }


    private static void criarListaContatos(int quantidade, List<Contato> lista) {

        Contato contato;

        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();
            contato.setName("Contato" + i);
            contato.setEmail("contato" + i + "@email.com");
            contato.setNumber(1111111 + i);

            lista.add(contato);
        }
    }
}