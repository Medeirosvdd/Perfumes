package br.boticario.entity;

import java.util.ArrayList;

public class Perfume {

    private static ArrayList<String> listaPerfumes = new ArrayList<>();

    // Construtor vazio
    public Perfume() {
    }

    // Método para salvar um perfume na lista
    public void salvar(String nome) {
        listaPerfumes.add(nome);
    }

    // Método para exibir os perfumes cadastrados
    public String exibirTarefas() {
        if (listaPerfumes.isEmpty()) {
            return "Nenhum perfume cadastrado.";
            }
        return String.join("\n", listaPerfumes);
    }

    // Método para remover um perfume da lista
    public boolean remover(String nome) {
        return listaPerfumes.remove(nome);
    }

    // Método para acessar a lista de perfumes
    public static ArrayList<String> getListaPerfumes() {
        return listaPerfumes;
    }

    public String exibirTarefasComIndice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
