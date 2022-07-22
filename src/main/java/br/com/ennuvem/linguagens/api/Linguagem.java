package br.com.ennuvem.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="principaisLinguagens")
public class Linguagem {
    @Id
    private String id;
    private String title;
    private String urlimagem;
    private Integer ranking;
    
    public void setId(String id) {
        this.id = id;
    }
    public Linguagem(String title, String urlimagem, Integer ranking) {
        this.title = title;
        this.urlimagem = urlimagem;
        this.ranking = ranking;
    }
    public Linguagem(){

    }

    public String getTitle() {
        return title;
    }
    public String getUrlimagem() {
        return urlimagem;
    }
    public Integer getRanking() {
        return ranking;
    }
    public String getId() {
        return id;
    }
    
}
