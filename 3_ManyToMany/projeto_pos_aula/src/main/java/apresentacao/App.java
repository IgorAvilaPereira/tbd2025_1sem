/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
import controller.Controller;
import java.util.HashMap;
import java.util.Map;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinMustache;
import static org.eclipse.jetty.util.component.LifeCycle.start;

// https://javalin.io/tutorials/javalin-hibernate
public class App {

    public static void main(String[] args) {

        Controller controller = new Controller();

        var app = Javalin.create(config -> {
            config.fileRenderer(new JavalinMustache());
        })
                //        .get("/", ctx -> ctx.result("Hello World"))
                //        .get("/ok", ctx -> ctx.result("Hello World2"))
                .get("/", ctx -> ctx.render("/templateFile.html", controller.listarPessoas()))
                .get("/excluir/{id}", ctx -> ctx.render("/mensagem.html", controller.excluir(Integer.parseInt(ctx.pathParam("id")))))
                .get("/tela_alterar/{id}", ctx -> ctx.render("/tela_alterar.html", controller.tela_alterar(Integer.parseInt(ctx.pathParam("id")))))
                .get("/tela_adicionar", ctx -> ctx.render("/tela_adicionar.html"))
                .post("/adicionar", ctx -> ctx.render("/mensagem.html", controller.adicionar(ctx)))
                .post("/alterar", ctx -> ctx.render("/mensagem.html", controller.alterar(ctx)))

                .start(7070);
    }

}
