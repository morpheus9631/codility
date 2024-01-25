package com.codility.count_visible_nodes;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Count Visible Nodes In Binary Tree\r\n");
    
        Solution sol = new Solution01();
        String format = "A[] = %s, \r\nreturn %d, \r\nactual %d";
    
        Tree tree = getCase();
        int result = sol.solution(tree);
        int actual = getReturn();
        System.out.println(
            String.format(  format, 
                            TreeUtils.toList(tree), 
                            result,
                            actual)
        );
    }

    public static Tree getCase() {
        Tree T = new Tree();
        T.x = 5;

        T.l = new Tree();
        T.l.x = 3;

        T.r = new Tree();
        T.r.x = 10;

        T.l.l = new Tree();
        T.l.l.x = 20;

        T.l.r = new Tree();
        T.l.r.x = 21;

        T.r.l = new Tree();
        T.r.l.x = 1;

        return T;
    }
    
    public static int getReturn() {
        return 4;
    }
}

