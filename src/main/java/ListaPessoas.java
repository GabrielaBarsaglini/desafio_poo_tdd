import org.example.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {

    //criei a classe ListaPessoas que importa a classe Pessoa e todos seus atributos e o objeto pessoas que vou usar para guardar informações
    private List<Pessoa> pessoas = new ArrayList<>();

    //em test pediu para eu criar um construtor que passasse (pessoas)
    public ListaPessoas(List<Pessoa> pessoas) {

    }

    public static String maiorIdade(List<Pessoa> pessoas) {


        // Mostrando maior idade
        int maior = 0;
        String pessoaVelha = " ";
        for (int i = 0; i < pessoas.size(); i = i + 1) {
            if (pessoas.get(i).getIdade() > maior) {
                maior = pessoas.get(i).getIdade();
                pessoaVelha = pessoas.get(i).getNome();

            }

        }
        return pessoaVelha;
    }

    // Excluindo menor idade

    public static int menorIdade(List<Pessoa> pessoas) {

        int tamanho = 0;
        for (int i = 0; i < pessoas.size(); i = i + 1) {
            if (pessoas.get(i).getIdade() < 18) {

                pessoas.remove(i);
                tamanho = pessoas.size();

            }


        }

        return tamanho;
    }


    public static int nomeExiste(List<Pessoa> pessoas, String nomePessoa) {

        int idadePessoa = 0;
        for (int i = 0; i < pessoas.size(); i = i + 1) {
            if (pessoas.get(i).getNome() == nomePessoa) {

                idadePessoa = pessoas.get(i).getIdade();


            }

        }

        return idadePessoa;
    }
}
