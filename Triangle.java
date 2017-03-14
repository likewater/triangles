public class Triangle {
  public int mSideOne;
  public int mSideTwo;
  public int mSideThree;

  public Triangle(int sideOne, int sideTwo, int sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public String verifyTriangle(int sideOne, int sideTwo, int sideThree) {
    String result = "";
    if (sideOne > sideTwo + sideThree || sideTwo > sideThree + sideOne || sideThree > sideTwo + sideOne) {
      result = "That is not a triangle";
      System.out.println(result);
    } else {
    }
    return result;
  }

  public String typeOfTriangle(int sideOne, int sideTwo, int sideThree) {
    String type = "";
    if (sideOne == sideTwo && sideTwo == sideThree) {
      System.out.println("Equalateral");
    } else if (sideOne != sideTwo && sideTwo != sideThree && sideThree != sideOne) {
      System.out.println("Scalene");
    } else {
      System.out.println("Isosceles");
    }
    return type;
  }
}
