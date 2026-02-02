class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int xoverlap=0;
        int yoverlap=0;
        int overlap=0;

        int area1 = (ax2-ax1) * (ay2-ay1);
        int area2 = (bx2-bx1) * (by2-by1);

        xoverlap = Math.min(ax2,bx2) - Math.max(ax1,bx1);
        yoverlap = Math.min(ay2,by2) - Math.max(ay1,by1);

        if(xoverlap > 0 && yoverlap > 0){
            overlap = xoverlap * yoverlap;

        }
        return area1+area2-overlap;
    }
}