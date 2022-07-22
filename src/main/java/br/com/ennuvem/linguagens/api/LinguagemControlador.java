package br.com.ennuvem.linguagens.api;
import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemControlador {
    //@Autowired
    private List<Linguagem> linguagens = 
        List.of(
            new Linguagem("java","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",1),
            new Linguagem("php","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png",2)
        );
       
    @GetMapping(value="/teste")
    public String teste(){
        return "Vamos dominar esta porra de anotações e framework spring e meter as caras";
        }
    @GetMapping(value="/ranking")
    public List<Linguagem> obterLinguagens(){
            return linguagens;
        }
}
