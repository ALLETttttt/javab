package lambda_ex.task10;

import java.util.List;

@FunctionalInterface
public interface DataProcessor<T> {
    List<T> process(List<T> data);
}
