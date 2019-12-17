package Chuong_4;

public class CowArrayDemo {
    public static void main(String[] args) {
        Cow cow1 = new Cow();
        cow1.name = "hehe";
// Todo cow1.momo();
        Cow[] myCows = new Cow[4];
        myCows[0] = new Cow();
        myCows[1] = new Cow();
        myCows[2] = new Cow();
        myCows[3] = new Cow();

        myCows[0].name = "dsasd";
        myCows[1].name = "sdyt";
        myCows[2].name = "sd6";
        myCows[3].name = "sd4";
//        for (int i = 0; i < myCows.length ; i++) {
//            myCows[i].momo();
//        }
        myCows[0].momo(4);
    }
}
//Todo toan