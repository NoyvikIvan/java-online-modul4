package by.epam.novik.mod4.task7;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

public class TriangleLogic {

	public static final String L_1 = "AB";
	public static final String L_2 = "BC";
	public static final String L_3 = "CA";
	
	// метод создания треугольника

	public Triangle createTriangle(Point a, Point b, Point c) {

		if (a == null || b == null || c == null) {

			return null;

		}

		if (a.equals(b) || b.equals(c) || c.equals(a)) {     //проверка на несовпадение точек

			return null;

		}

		
		//проверка что бы точки нележали на одной прямой
		
		double infelicity = 1e-8;

		double x1 = a.getX();
		double x2 = b.getX();
		double x3 = c.getX();

		double y1 = a.getY();
		double y2 = b.getY();
		double y3 = c.getY();

		double tmp = ((x3 - x1) / (x2 - x1)) - ((y3 - y1) / (y2 - y1));

		if (tmp <= infelicity) {

			return null;

		}

		return new Triangle(a, b, c);

	}
	
	// метод создания треугольника


	public Triangle createTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {

		if (x1 == x2 && y1 == y2 || x2 == x3 && y2 == y3 || x3 == x1 && y3 == y1) {

			return null;

		}

		double infelicity = 1e-8;

		double tmp = ((x3 - x1) / (x2 - x1)) - ((y3 - y1) / (y2 - y1));

		if (tmp <= infelicity) {

			return null;

		}

		return new Triangle(x1, y1, x2, y2, x3, y3);
	}
	
	
	// метод создания случайного  треугольника

	public Triangle createRandomTriangle() {

		double x1, x2, x3, y1, y2, y3;
		
		x1 = Math.random() * 10;
		y1 = (Math.random() * 10) + 1;
		
		x2 = Math.random() * 10;
		y2 = Math.random() * -10;
		
		x3 = (Math.random() * -10) - 1;
		y3 = Math.random() * 10;

		double infelicity = 1e-8;

		double tmp = ((x3 - x1) / (x2 - x1)) - ((y3 - y1) / (y2 - y1));

		if (tmp >= infelicity) {

			x1 += 5;
			
		}

		return new Triangle(x1, y1, x2, y2, x3, y3);
	}

	
	// метод нахоождения длины стороны треугольника
	
	
	public double findSide(Triangle triangle, String side) {

		if (triangle == null || side == null) {

			return -1;

		}
		
		switch (side) {

		case L_1: {

			double x1 = triangle.getA().getX();
			double x2 = triangle.getB().getX();
			double y1 = triangle.getA().getY();
			double y2 = triangle.getB().getY();

			double x = x2 - x1;
			double y = y2 - y1;

			return Math.sqrt((x * x + y * y));

		}

		case L_2: {

			double x1 = triangle.getB().getX();
			double x2 = triangle.getC().getX();
			double y1 = triangle.getB().getY();
			double y2 = triangle.getC().getY();

			double x = x2 - x1;
			double y = y2 - y1;

			return Math.sqrt((x * x + y * y));

		}

		case L_3: {

			double x1 = triangle.getC().getX();
			double x2 = triangle.getA().getX();
			double y1 = triangle.getC().getY();
			double y2 = triangle.getA().getY();

			double x = x2 - x1;
			double y = y2 - y1;

			return Math.sqrt((x * x + y * y));
		}

		default: {

			return -1;
		}
		}
	}

	
	// метод определения периметра
	
	public double findPerimetr(Triangle triangle) {

		if (triangle == null) {
			
			return -1;
		}
		
		double ab = this.findSide(triangle, L_1);
		double bc = this.findSide(triangle, L_2);
		double ca = this.findSide(triangle, L_3);

		if (ab <= 0 || bc <= 0 || ca <= 0) {

			return -1;

		}

		return ab + bc + ca;

	}
	
	
	// метод определения площади

	public double findArea(Triangle triangle) {

		if (triangle == null) {
			return -1;
		}

		double ab = this.findSide(triangle, L_1);
		double bc = this.findSide(triangle, L_2);
		double ca = this.findSide(triangle, L_3);

		if (ab <= 0 || bc <= 0 || ca <= 0) {

			return -1;

		}

		double p = findPerimetr(triangle) / 2;

		double area;

		area = p * (p - ab) * (p - bc) * (p - ca);

		area = Math.sqrt(area);

		return area;

	}

	
	// метод находения точки на отрезке произвольно делящей этот отрезок

	
	public Point findPointOnLine(Point p1, Point p2, int firstPart, int secondPart) {

		if (p1 == null || p2 == null) {
			return null;
		}

		double x1 = p1.getX();
		double x2 = p2.getX();
		double y1 = p1.getY();
		double y2 = p2.getY();

		double x = (firstPart * x2 + secondPart * x1) / (firstPart + secondPart);
		double y = (firstPart * y2 + secondPart * y1) / (firstPart + secondPart);

		return new Point(x, y);

	}
	
	
	// метод находения точки которая является серединой одной из сторон треугольника


	public Point midOfSide(Triangle triangle) {

		if (triangle == null) {
			return null;
		}

		Point a = triangle.getA();
		Point b = triangle.getB();

		return this.findPointOnLine(a, b, 1, 1);

	}
	
	// метод находения точки пересечения медиан треугольника


	public Point findMedianIntersectionPoint(Triangle triangle) {

		if (triangle == null) {
			return null;
		}

		Point midOfSede = this.midOfSide(triangle);

		Point c = triangle.getC();

		int firstPart = 1;
		int secondPart = 2;

		return this.findPointOnLine(midOfSede, c, firstPart, secondPart);

	}

}
