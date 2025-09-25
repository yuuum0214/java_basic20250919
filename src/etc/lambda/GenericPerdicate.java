package etc.lambda;

@FunctionalInterface
public interface GenericPerdicate<T> {

    boolean test(T t);

}
