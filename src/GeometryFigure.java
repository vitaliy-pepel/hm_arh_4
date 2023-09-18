import java.util.ArrayList;
import java.util.List;

public class GeometryFigure {
    static private List<IShape> toolbox;

    public GeometryFigure() {
        toolbox = new ArrayList<IShape>();
    }

    // Метод для добаления новой фигуры
    public void add(IShape figure) {
        toolbox.add(figure);
    }

    // Метод для удаления фигуры
    public void remove(int num) {
        if (num >= 0 && num < toolbox.size()) {
            IShape figure = toolbox.get(num);
            toolbox.remove(num);
            System.out.println("Фигура " + figure.getName() + num + " удалена");
        } else {
            System.out.println("Фигура " + num + " не может быть удалена");
        }
    }

    // Метод поиска необходимой фигуры
    public void search(IShape figure) {
        int index = toolbox.indexOf(figure);
        if (index >= 0) {
            System.out.println("Фигура " + figure.getName() + " найдена " + index);
        } else {
            System.out.println("Фигура " + figure.getName() + " не найдена");
        }
    }

    // Метод отображения подробной информации о фигурк
    public void getInfo(int num) {
        if (num >= 0 && num < toolbox.size()) {
            IShape figure = toolbox.get(num);
            System.out.println("Площадь фигуры " + figure.getName() + ": " + figure.getArea());
            System.out.println("Периметр фигуры " + figure.getName() + ": " + figure.getPerimeter());
        } else {
            System.out.println("Фигура с номером " + num + " не существует");
        }
    }
}
