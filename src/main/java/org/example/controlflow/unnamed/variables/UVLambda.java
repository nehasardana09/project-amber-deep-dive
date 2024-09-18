import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Point(double x, double y) {}
record UniqueRectangle(String id,
                       Point upperLeft, Point lowerRight) {}

 Map getIDs(List<UniqueRectangle> r) {
    return r.stream().collect(Collectors.toMap(UniqueRectangle::id, value -> "NODATA"));
}

public void main() {
    List<UniqueRectangle> r = new ArrayList<>();
    r.add(new UniqueRectangle("1", new Point(1, 1), new Point(2, 2)));
    r.add(new UniqueRectangle("2", new Point(2, 2), new Point(3, 4)));
    r.add(new UniqueRectangle("1", new Point(3, 3), new Point(1, 0)));
    Map iDs = getIDs(r);
    System.out.println(iDs);

}
