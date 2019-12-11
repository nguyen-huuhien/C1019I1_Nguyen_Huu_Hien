package b3_LopVaDoiTuongTrongJava.bt.StopWatch;

public class Main {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for (int i = 0; i <10000000 ; i++) {
            Math.random();
        }
        stopWatch.stop();
        System.out.println( stopWatch.getElapsedTime() );



    }
}
