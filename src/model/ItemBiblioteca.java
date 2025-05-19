//Declaração que a classe está no pacote "model"
package model;

//criação da classe ItemBiblioteca
//protected permite que a subclasse acessem esses atributos;
// cria aquilo que todos os alunos irão ter em comum (atributo titulo e codigo);
public class ItemBiblioteca {
    protected String titulo;
    protected String codigo;

    public ItemBiblioteca(String titulo, String codigo){
        this.titulo = titulo;
        this.codigo = codigo;
    }

    public void  avaliar (){
        System.out.println("Item avaliado");
    }
}
