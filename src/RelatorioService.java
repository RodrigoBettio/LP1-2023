import java.util.*;
import java.util.stream.Collectors;

public class RelatorioService {
    public static List<Ativo> composicaoCarteiraInvestidor(Investidor investidor) {
        List<Ativo> composicao = new LinkedList<>();
        for (Carteira carteira : investidor.getCarteiras()) {
            composicao.addAll(carteira.getAtivos());
        }
        return composicao;
    }

    public static List<Corretora> corretorasComMaisOrdens(List<Corretora> corretoras) {
        return corretoras.stream()
                .sorted(Comparator.comparingInt(c -> -c.getFilaOrdens().size()))
                .collect(Collectors.toList());
    }

    public static List<Ativo> acoesMaisNegociadas(List<Ativo> ativos) {
        return ativos.stream()
                .filter(ativo -> ativo instanceof Acao)
                .sorted(Comparator.comparingDouble(Ativo::getVolumeNegociado).reversed())
                .collect(Collectors.toList());
    }
}
