package me.krios2146.easy;

public class LongerContiguousSegmentsOfOnesThanZeros {
    public boolean checkZeroOnes(String s) {
        int sequenceOfOnes = 0;
        int sequenceOfZeros = 0;

        int onesCount = 0;
        int zerosCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                onesCount++;
                if (onesCount > sequenceOfOnes) {
                    sequenceOfOnes = onesCount;
                }
                zerosCount = 0;
            }
            if (s.charAt(i) == '0') {
                zerosCount++;
                if (zerosCount > sequenceOfZeros) {
                    sequenceOfZeros = zerosCount;
                }
                onesCount = 0;
            }
        }

        return sequenceOfOnes > sequenceOfZeros;
    }
}
