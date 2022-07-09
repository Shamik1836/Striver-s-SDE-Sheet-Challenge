
public class Flood_Fill
{
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
        if (image[x][y] ==newColor) return image;
        fill(image,x,y,image[x][y],newColor);
        return image;
    }
    public static void fill(int[][] image, int x, int y,int color, int newColor){
        if (x<0 || y<0 || x>=image.length||y>=image[0].length||image[x][y] != color){
            return;
        }
        image[x][y]=newColor;
        fill(image,x-1,y,color,newColor);
        fill(image,x+1,y,color,newColor);
        fill(image,x,y-1,color,newColor);
        fill(image,x,y+1,color,newColor);
    }
}

