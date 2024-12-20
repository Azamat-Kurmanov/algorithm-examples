package kz.jgarant.dit.simpleexample1;

import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        Integer[][] triangleList = {{2},{3,4},{6,5,7},{4,1,8,3}};
        Integer[][] triangleListSec = {{-1},{2,3},{1,-1,-3}};
        List<List<Integer>> listOfTriangles = new ArrayList<>();
        for (Integer[] triangle : triangleListSec) {
            listOfTriangles.add(Arrays.asList(triangle));
        }
        System.out.println(minimumTotal(listOfTriangles));
        System.out.println(minimumTotalSec(listOfTriangles));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        for (List<Integer> items : triangle) {
            Integer min = 0;
            for (int j = 0; j < items.size(); j++) {
                min = Collections.min(items);
            }
            sum += min;
        }
        return sum;
    }

    public static int minimumTotalSec(List<List<Integer>>triangle){
        for(int i=triangle.size()-2;i>=0;i--) {
            List<Integer>crow=triangle.get(i);
            List<Integer>nrow=triangle.get(i+1);

            for(int j=0;j<crow.size();j++){
                int minpath=Math.min(nrow.get(j),nrow.get(j + 1));
                crow.set(j,crow.get(j)+minpath);
            }
        }

        return triangle.get(0).get(0);
    }

}
