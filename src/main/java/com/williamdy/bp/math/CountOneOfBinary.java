package com.williamdy.bp.math;

public class CountOneOfBinary {

    int rigtMigrate(int sig){
        int count = 0;
        while(sig != 0){

            if((sig & 1) == 1)
                count ++;
            sig =sig>>1;
        }
        return count;
    }

    int andByBit(int sig){
        int count = 0;
        while(sig != 0){
            sig &= (sig-1);
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountOneOfBinary cob = new CountOneOfBinary();
        System.out.println(cob.rigtMigrate(9));
        System.out.println(cob.andByBit(9));
    }
}
