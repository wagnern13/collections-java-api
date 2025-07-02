package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {

        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade() {

        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura() {

        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 28, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 38, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.78);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoa.ordernarPorIdade());
        System.out.println(ordenacaoPessoa.ordernarPorAltura());
    }

}
