import static org.junit.Assert.*;

import org.example.Pessoa;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ListaPessoasTest {

    // criei uma lista que importa a classe Pessoa, cujo objeto é pessoa
    List<Pessoa> pessoas;

    //A classe ListaPessoas foi criar, junto com o objeto listaPessoas
    ListaPessoas listaPessoas;


    @Before
    public void setup() {

        //agora eu chamo o objeto da classe Pessoa, porque eu quero utilizar para guardar nesse objeto um arraylist as informações contidas nessa classe
        pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("João", 15));
        pessoas.add(new Pessoa("Leandro", 21));
        pessoas.add(new Pessoa("Paulo", 17));
        pessoas.add(new Pessoa("Jessica", 18));

        //guardei no objeto listaPessoas dentro da classe, as informações de pessoas que eu adicionei em pessoas
        listaPessoas = new ListaPessoas(pessoas);
    }

    @Test

    public void deveCriarClasseListaPessoas() throws Exception {

    }

    @Test
    public void deveCriarUmConstrutordePessoas() throws Exception {

    }

    @Test
    public void deveCriarMetodoQueIdentifiquePessoaMaisVelha() throws Exception {
        assertEquals("Leandro", ListaPessoas.maiorIdade(pessoas));

    }

    @Test
    public void deveCriarMetodoQueExcluaPessoasMenoresDe18() throws Exception {
        assertEquals(2, ListaPessoas.menorIdade(pessoas));

    }

    @Test
    public void deveCriarMetodoQueIdentifiqueNomeJessica() throws Exception {
        assertEquals(18, ListaPessoas.nomeExiste(pessoas,"Jessica"));

    }




}
