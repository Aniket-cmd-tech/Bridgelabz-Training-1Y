import java.util.Scanner;
class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base= sc.nextFloat();
        float height= sc.nextFloat();
		float areaInSqInch = 0.5f *base*height;
        float areaInSqCm = areaInSqInches*6.4516f;
        System.out.println("The area of the triangle in square inches is "
                + areaInSqInches + " and in square centimeters is "+ areaInSqCm);
    }
}
