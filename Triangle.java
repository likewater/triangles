git commitpublic class Triangle {
  public int mSideOne;
  public int mSideTwo;
  public int mSideThree;

  public Triangle(int sideOne, int sideTwo, int sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public Boolean verifyTriangle(int sideOne, int sideTwo, int sideThree) {
    if (sideOne + sideTwo < sideThree || sideOne + sideThree < sideTwo || sideTwo + sideThree < sideOne) {
    }
    return false;
  }

  public String typeOfTriangle(int sideOne, int sideTwo, int sideThree) {
    String type = "";
    if (sideOne == sideTwo && sideTwo == sideThree) {
      type = "Equalateral";
    } else if (sideOne != sideTwo && sideTwo != sideThree && sideThree != sideOne) {
      type = "Scalene";
    } else {
      type = "Isosceles";
    }
    return type;
  }
}
