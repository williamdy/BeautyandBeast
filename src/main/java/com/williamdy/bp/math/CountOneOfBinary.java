package com.williamdy.bp.math;

public class CountOneOfBinary {

    public static int rigtMigrate(int sig){
        int count = 0;
        while(sig != 0){

            if((sig & 1) == 1)
                count ++;
            sig =sig>>1;
        }
        return count;
    }

    public static int andByBit(int sig){
        int count = 0;
        while(sig != 0){
            sig &= (sig-1);
            count ++;
        }
        return count;
    }

}
