package Lesson6.Task1;

public final class PairUtil {

    private PairUtil() {
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> source) {
        K one = source.getOne();
        V two = source.getTwo();
        return new Pair<>(two, one);
    }
}
