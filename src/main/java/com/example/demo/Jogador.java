import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String funcao;
    private String nomeTime;
    private String patente;

    // Construtores, getters e setters (não mostrados para brevidade)

    // Métodos adicionais, se necessário

    public static Jogador buscarPorId(Long id) {
        // Lógica para buscar jogador por ID no banco de dados
        // Se não encontrar, lançar JogadorNaoEncontradoException
        throw new JogadorNaoEncontradoException("Jogador não encontrado para o ID: " + id);
    }
}
