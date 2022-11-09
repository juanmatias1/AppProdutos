/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Juan
 */
public class Produto {
    
    //ATRIBUTOS
    private String produto = "";
    private int tamanho = 0;
    private String descricao = "";
    private String fornecedor = "";
    private float custo = 0;
    private float venda = 0;
    private float icms = 0;

    //GET e SET
    //GET e SET - PRODUTO
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    //GET e SET - TAMANHO
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //GET e SET - DESCRIÇÃO
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //GET e SET - FORNECEDOR
    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    //GET e SET - CUSTO
    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    //GET e SET - VENDA
    public float getVenda() {
        return venda;
    }

    public void setVenda(float venda) {
        this.venda = venda;
    }

    //GET e SET - ICSM
    public float getICMS() {
        return icms;
    }

    public void setICMS(float icms) {
        this.icms = icms;
    }

    public void limparProduto() {
        produto = "";
        tamanho = 0;
        descricao = "";
        fornecedor = "";
        custo = 0;
        venda = 0;
        icms = 0;
    }
}
            
         