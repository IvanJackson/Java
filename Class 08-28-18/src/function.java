import java.lang.Math;
public class function {
		
		public static double areaOfTriangle(double s1, double s2, double s3) {
			double s = (s1 + s2 + s3) / 2.0;
			double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
			return area;

		}
}
