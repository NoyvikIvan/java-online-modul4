package by.epam.novik.mod4.task7;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

public class TriangleView {

	public void printTriangle(Triangle triangle) {

		if (triangle != null) {

			double x1 = triangle.getA().getX();
			double x2 = triangle.getB().getX();
			double x3 = triangle.getC().getX();

			double y1 = triangle.getA().getY();
			double y2 = triangle.getB().getY();
			double y3 = triangle.getC().getY();

			System.out.println("Треугольник с вершнами:");
			System.out.println("А (" + x1 + ", " + y1 + ")");
			System.out.println("B (" + x2 + ", " + y2 + ")");
			System.out.println("C (" + x3 + ", " + y3 + ")");

		} else {

			System.out.println("Неверно передан параметр метода.");
		}

	}

}
