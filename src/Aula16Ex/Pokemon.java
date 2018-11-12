package Aula16Ex;


public class Pokemon {
    private String nome;
    private String raridade;
    private String ataque;
    private String defesa;
    private String tipo;

    public Pokemon(){

    }

    public void atacou(){
        System.out.println(nome+" atacou com: "+ataque);
    }
    public void defendeu(){
        System.out.println(nome+" atacou com: "+defesa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }
}
