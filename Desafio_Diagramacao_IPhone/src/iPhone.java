import com.dio.iphone.interfaces.AparelhoTelefonico;
import com.dio.iphone.interfaces.NavegadorInternet;
import com.dio.iphone.interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("A ligação foi atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Favor gravar mensagem");
    }

    public void tocar() {
        System.out.println("A música está sendo reproduzida.");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("A música escolhida foi: " + musica);
    }

    public void exibirPagina(String url) {
        System.out.println("A página: " + url + " está sendo exibida");
    }

    public void adicionarNovaAba(String url) {
        System.out.println("Uma nova aba " + url + " foi aberta.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso");
    }
}
