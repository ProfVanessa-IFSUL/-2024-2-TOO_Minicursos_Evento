/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelo;

/**
 *
 * @author vanessalagomachado
 */
public enum Local {
    PREDIO5(100),
    LABORATORIO_503(16),
    LABORATORIO_504(20),
    LABORATORIO_505(30),
    LABORATORIO_508(16),
    LABORATORIO_509(16),
    LABORATORIO_510(20),
    LABORATORIO_511(20),
    SALA_513(30);
    

    // Campo para armazenar a capacidade máxima (lotação)
    private final int lotacao;

    // Construtor do enum que associa cada constante com sua lotação
    Local(int lotacao) {
        this.lotacao = lotacao;
    }

    // Método getter para acessar a lotação
    public int getLotacao() {
        return lotacao;
    }

    // Método opcional para retornar uma descrição amigável
//    @Override
    public String toString() {
        return this.name() + " (lotação: " + lotacao + ")";
    }
    
    public static String getLocais(){
        String aux = "Locais Cadastrados: \n\n";
        for(Local l: values()){
            aux += l +"\n";
        }
        return aux;
    }
}
