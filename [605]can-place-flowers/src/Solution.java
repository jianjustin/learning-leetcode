public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] items = new int[flowerbed.length];
        int result = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            boolean can = true;
            if(flowerbed[i] == 1){
                items[i] = 1;
                continue;
            }
            if(flowerbed[i] == 0 && i < flowerbed.length-1 && flowerbed[i+1] == 1)can = false;
            if(flowerbed[i] == 0 && i > 0 && flowerbed[i-1] == 1)can = false;
            if(!can)
                items[i] = flowerbed[i] = 0;
            else {
                items[i] = flowerbed[i] = 1;
                result++;
            }
        }

        return result >= n ? true : false;
    }

}
