package Semenars_Exceptions.Sem3.Task4_Sem3;

import java.util.Map;

public class DataException extends IllegalArgumentException {
    public DataException(int x, int y) {
        super(String.format("В ячейке [%s][%s] находится не число", x, y));
    }

    public DataException(Map<Point2D, String> map) {
        super(String.format("В ячейках %s не число", map));
    }
}
