import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Principal {
    public static void main(String[] args) {
        // Inserir jogadores
        inserirJogadores();

        // Recuperar e imprimir dados dos jogadores
        recuperarEImprimirJogadores();

        // Buscar jogador por ID existente
        buscarEImprimirJogadorPorId(2L);

        // Buscar jogador por ID inexistente
        buscarEImprimirJogadorPorId(5L);
    }

    private static void inserirJogadores() {
        // Lógica de inserção de jogadores no banco de dados
    }

    private static void recuperarEImprimirJogadores() {
        // Lógica de recuperação e impressão de jogadores do banco de dados
    }

    private static void buscarEImprimirJogadorPorId(Long id) {
        try {
            // Buscar jogador por ID
            Jogador jogador = Jogador.buscarPorId(id);

            // Imprimir dados do jogador
            System.out.println("Jogador encontrado:");
            System.out.println("ID: " + jogador.getId());
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Função: " + jogador.getFuncao());
            System.out.println("Time: " + jogador.getNomeTime());
            System.out.println("Patente: " + jogador.getPatente());
            System.out.println();
        } catch (JogadorNaoEncontradoException e) {
            // Tratar exceção de jogador não encontrado
            System.out.println(e.getMessage());
        }
    }
}
