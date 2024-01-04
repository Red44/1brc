package dev.morling.onebrc;

import java.io.RandomAccessFile;

final public class CalculateAverage_red44 {

    private static final String file = "./measurements.txt";
    private static final int cores =  Runtime.getRuntime().availableProcessors();


    public static void main(String[] args) throws Exception {
        var read = args.length == 0 ? file : args[0];
        RandomAccessFile file = new RandomAccessFile(read, "r");
        long len = file.length();

    }

    ///xxx.x to (x*N.x) to xxxx
    public static int numFromStr(byte[] data, int start, int end){
        int result = 0;
        int base = 1;
        for (int i = end-1; i>=start;i--){
            int clearIfPointMask = (~(data[i] - 47)) >> 7;
            int number = data[i]-48;
            result+=(number&clearIfPointMask)*base;
            base*=1+(9&clearIfPointMask);
        }
        return result;
    }


}

