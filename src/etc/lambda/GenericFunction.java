package etc.lambda;

import java.time.Year;

@FunctionalInterface
public interface GenericFunction<X, Y> {

    //X에서 Y를 추출해줄게
    Y apply(X x);

}
