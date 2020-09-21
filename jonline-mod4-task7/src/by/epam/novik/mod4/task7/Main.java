package by.epam.novik.mod4.task7;

//  7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//  площади, периметра и точки пересечения медиан.

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Создаем и три треугольника. Первый случайный, второй по трем вершинам и третий по координатам вершин");
		
		TriangleLogic logic = new TriangleLogic();
		TriangleView view = new TriangleView();
		
		double x1 = 1, x2= 2, x3 = 3, y1 = 4, y2 = -4, y3 = 3;
		
		
		Point a = new Point(x1, y1);
		Point b = new Point(x2, y2);
		Point c = new Point(x3, y3);

		
		Triangle tr1 = logic.createRandomTriangle();
		Triangle tr2 = logic.createTriangle(a, b, c);
		Triangle tr3 = logic.createTriangle(x1, y1, x2, y2, x3, y3);

		System.out.println("Первый треугольник:");
		view.printTriangle(tr1);
		
		System.out.println("Второй треугольник:");
		view.printTriangle(tr2);

		System.out.println("Третий треугольник:");
		view.printTriangle(tr3);

		System.out.println("Периметр первого треугольника:");
		double per = logic.findPerimetr(tr1);
		System.out.println("Периметр = " + per + " у.е.");
		
		
		System.out.println("Площадь второго треугольника:");
		double area = logic.findArea(tr2);
		System.out.println("Площадь = " + area + " у.е. в кв.");
		
		System.out.println("Точка пересечения медиан третьего треугольника:");
		Point point;
		point = logic.findMedianIntersectionPoint(tr3);
		System.out.println(point);
	}

}
