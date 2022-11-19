/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphAlgo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rishabh
 */
public class DFS {
    public static boolean searchPath(int[][] maze, int x, int y, int tx, int ty ,List<Integer> path){
     
        if(x==tx &&  y==ty){
            path.add(x);
            path.add(y);
            return true;
        }
        
        if(maze[x][y] == 0){
            maze[x][y]=2;
            
            int[] dx = {1,0,0,-1};
            int[] dy = {0,1,-1,0};
            
            for(int d=0; d<dx.length; d++){
                int newx = x+dx[d];
                int newy = y+dy[d];
                if(newx>=0 && newx<maze.length && newy>=0 && newy<maze[0].length && searchPath(maze,newx,newy,tx,ty,path)){
                    path.add(x);
                    path.add(y);
                    return true;
                }
                
                
                
            }
            
        }
    return false;
    }
    
    
    public static void main(String[] args){
    
        DFS obj = new DFS();
        int[][] maze = {
            {0,0,0},
            {0,1,0},
            {0,0,0},
        };
        List<Integer> path = new ArrayList<Integer>();
        boolean reach = obj.searchPath(maze, 0, 0,1,2, path);
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + " ");
        }
        
    }
    
}
