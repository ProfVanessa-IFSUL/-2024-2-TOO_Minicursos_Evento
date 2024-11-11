/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vanessalagomachado
 */
public class Oficina {
    private String nome;
    private String descricao;
    private int CH;
    private Date dataInicio;
    private int vagas;
    private Ministrante ministrante;
    private Organizador organizador;
    private ArrayList<Participante> listaParticipantes;
    
    
    private Local local;
    
    public Oficina(String nome){
        this.nome = nome;
        listaParticipantes = new ArrayList<>();
    }
    
    // getter
    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getCH(){
        return CH;
    }
    public Date getDataInicio(){
        return dataInicio;
    }
    public int getVagas(){
        return vagas;
    }
    
    public Ministrante getMinistrante(){
        return ministrante;
    }
    public void setMinistrante(Ministrante m){
        this.ministrante = m;
    }
    
    public Local getLocal(){
        return this.local;
    }
    
    public Organizador getOrganizador(){
        return organizador;
    }
    
    public ArrayList<Participante> getListaParticipante(){
        return listaParticipantes;
    }
    
    
    // setter
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String des){
        descricao = des;
    }
    public void setVagas(int vagas){
        this.vagas = vagas;
    }
    public void setCH(int CH){
        this.CH = CH;
    }
    public void setDataInicio(Date dt){
        this.dataInicio = dt;
    }
    
    public void setLocal(Local local){
        this.local = local;
    }
    
    public void setOrganizador(Organizador or){
        organizador = or;
    }
    
    // métodos de manipulação do ArrayList
    
    public void addPartipante(Participante participante){
        listaParticipantes.add(participante);
    }
    
    public void removerPartipante(Participante participante){
        listaParticipantes.remove(participante);
    }
    
    public String mostrarListaParticipantes(){
        String aux = "Lista de Participantes: ";
        for(Participante p: listaParticipantes){
            aux += "\n"+p;
        }
        return aux;
    }
    
    
    public String getInformacoes(){
        SimpleDateFormat mascaraData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        String aux = "Oficina cadastrada:";
        if(nome != null){
            aux += "\n Oficina: "+nome;
        }
        aux += descricao != null ? "\n descrição: "+nome : "";
        aux += CH > 0 ? "\nCH: "+CH : "";
        aux += dataInicio != null ? "\nData: "+mascaraData.format(dataInicio) : "";
       aux += vagas > 0 ? "\nVagas: "+vagas : "";
       aux += ministrante !=null ? "\nMinistrante: "+ministrante.getNome(): "";
       //aux += local != null ? "\nLocal: "+local +" - lotação: "+local.getLotacao(): "";
       aux += local != null ? "\nLocal: "+local : "";
       
       aux += organizador != null ? "\nOrganizador: "+organizador : "";
       
       if(!listaParticipantes.isEmpty()){
           aux+= "\n\n"+mostrarListaParticipantes();
       } else{
           aux += "\n Não há participantes inscritos";
       }
       
        return aux;
    }
    
}
